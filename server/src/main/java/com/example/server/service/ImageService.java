package com.example.server.service;

import com.example.server.enums.ImageType;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.IIOException;
import java.io.IOException;

public interface ImageService {
    String uploadImage(Long id, MultipartFile file, ImageType imageType) throws IOException;
    void deleteImage(Long id) throws IOException;
}
