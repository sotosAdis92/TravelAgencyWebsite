package com.example.server.config;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import io.github.bucket4j.Bandwidth;
import io.github.bucket4j.Bucket;
import io.github.bucket4j.ConsumptionProbe;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

@Component
public class RateLimitFilter extends OncePerRequestFilter {
    public Cache<String, Bucket> cache = Caffeine.newBuilder().expireAfterWrite(1, TimeUnit.MINUTES).maximumSize(1_000_000).build();
    public Bucket bucket(){
        Bandwidth bandwidthLimit = Bandwidth.builder().capacity(20).refillIntervally(20, Duration.ofMinutes(1)).build();
        return Bucket.builder().addLimit(bandwidthLimit).build();
    }

    public boolean tryConsume(Cache<String, Bucket> bucket, String ip, Supplier<Bucket> supplier){
        return bucket.get(ip, s -> supplier.get()).tryConsume(1);
    }


    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String clientIp = getClientIp(request);
        ConsumptionProbe probe = bucket().tryConsumeAndReturnRemaining(1);
        if(probe.isConsumed()){
            response.addHeader("X-Rate-Limit-Remaining", String.valueOf(probe.getRemainingTokens()));
            filterChain.doFilter(request,response);
        }
        else if(!tryConsume(cache,clientIp,this::bucket)){
            var waitForRefill = probe.getNanosToWaitForRefill() / 1_000_000_000;
            response.setStatus(HttpStatus.TOO_MANY_REQUESTS.value());
            response.addHeader("X-Rate-Limit-Remaining", String.valueOf(waitForRefill));
            response.setContentType("application/json");
            String jsonResponse = """
                        {
                            "status": %s,
                            "error": "Too many requests",
                            "message": "You have exhausted the limit of calls towards the login endpoint",
                            "retryAfterSeconds": %s
                        }
                        """.formatted(HttpStatus.TOO_MANY_REQUESTS.value(), 60);
            response.getWriter().write(jsonResponse);
        }
    }

    private String getClientIp(HttpServletRequest request){
        String xfHeader = request.getHeader("X-Forwarded-For");
        if(xfHeader == null || xfHeader.isEmpty()){
            return request.getRemoteAddr();
        }
        return xfHeader.split(",")[0].trim();
    }
}
