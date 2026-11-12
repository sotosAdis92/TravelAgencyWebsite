package com.example.server.service;

import org.springframework.web.multipart.MultipartFile;

import javax.imageio.IIOException;
import java.io.IOException;

public interface ImageService {
    String uploadImage(Long id, MultipartFile file) throws IOException;
    void deleteImage(Long id) throws IOException;
}
