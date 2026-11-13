package com.example.server.service.impl;

import com.example.server.enums.ImageType;
import com.example.server.service.ImageService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

@Service
public class ImageServiceImpl implements ImageService {
    @Value("app.image.continent.upload-dir")
    private String continentUploadDir;

    @Value("app.image.continent.base-url")
    private String continentBaseUrl;

    @Value("app.image.country.upload-dir")
    private String countryUploadDir;

    @Value("app.image.country.base-url")
    private String countryBaseUrl;

    @Value("app.image.trip.tripimage.upload-dir")
    private String tripImageUploadDir;

    @Value("app.image.trip.tripimage.base-url")
    private String tripImageBaseUrl;

    @Value("app.image.trip.tripmap.upload-dir")
    private String tripMapUploadDir;

    @Value("app.image.trip.tripmap.base-url")
    private String tripMapBaseUrl;

    @Value("app.image.trippictures.upload-dir")
    private String tripPicturesUploadDir;

    @Value("app.image.trippictures.base-url")
    private String tripPicturesBaseUrl;

    @Value("")
    private String continentMapUploadDir;

    @Value("")
    private String continentMapBaseUrl;

    @Value("")
    private String countryMapUploadDir;

    @Value("")
    private String countryMapBaseUrl;

    @Override
    public String uploadImage(Long id, MultipartFile file, ImageType type) throws IOException {
        String filename = getExtension(file.getOriginalFilename());
        String imageName = id + filename;
        String uploadDir = "";
        String baseUrl = "";
        switch (type){
            case CONTINENT -> {
                uploadDir = continentUploadDir;
                baseUrl = continentBaseUrl;
            }
            case COUNTRY -> {
                uploadDir = countryUploadDir;
                baseUrl = countryBaseUrl;
            }
            case CONTINENT_MAP -> {
                uploadDir =continentMapUploadDir;
                baseUrl = continentMapBaseUrl;
            }
            case COUNTRY_MAP -> {
                uploadDir =countryMapUploadDir;
                baseUrl=countryMapBaseUrl;
            }
            case TRIP_MAP -> {
                uploadDir = tripMapUploadDir;
                baseUrl = tripMapBaseUrl;
            }
            case TRIP_IMAGE -> {
                uploadDir = tripImageUploadDir;
                baseUrl = tripImageBaseUrl;
            }
            case TRIP_PICTURES -> {
                uploadDir = tripPicturesUploadDir;
                baseUrl = tripPicturesBaseUrl;
            }
            default -> throw new IllegalArgumentException("Unknown image type: " + type);
        }
        Path uploadPath = Paths.get(uploadDir);
        if(!Files.exists(uploadPath)){
            Files.createDirectories(uploadPath);
        }
        Path filepath = uploadPath.resolve(imageName);
        Files.copy(file.getInputStream(), filepath, StandardCopyOption.REPLACE_EXISTING);
        return baseUrl + "/" + imageName;
    }

    @Override
    public void deleteImage(Long id, ImageType imageType) throws IOException {
        String uploadDir = switch (imageType){
            case CONTINENT -> continentUploadDir;
            case COUNTRY -> countryUploadDir;
            case CONTINENT_MAP -> continentMapUploadDir;
            case COUNTRY_MAP -> countryMapUploadDir;
            case TRIP_IMAGE -> tripImageUploadDir;
            case TRIP_MAP -> tripMapUploadDir;
            case TRIP_PICTURES -> tripPicturesUploadDir;
        };
        try(Stream<Path> files = Files.list(Paths.get(uploadDir))){
            files.filter(path -> path.getFileName().toString().startsWith(id + ".")).forEach(path -> {
                try {
                    Files.deleteIfExists(path);
                }catch (IOException e){
                    throw new RuntimeException("Failed to delete the image",e);
                }
            });
        }
    }

    private String getExtension(String filename){
        if(filename==null || !filename.contains(".")){
            return ".jpg";
        }
        return filename.substring(filename.lastIndexOf("."));
    }
}
