package com.example.server.service.impl;

import com.example.server.enums.ImageType;
import com.example.server.service.ImageService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class ImageServiceImpl implements ImageService {
    @Value("")
    private String continentUploadDir;

    @Value("")
    private String continentBaseUrl;

    @Value("")
    private String countryUploadDir;

    @Value("")
    private String countryBaseUrl;

    @Value("")
    private String tripImageUploadDir;

    @Value("")
    private String tripImageBaseUrl;

    @Value("")
    private String tripMapUploadDir;

    @Value("")
    private String tripMapBaseUrl;

    @Value("")
    private String tripPicturesUploadDir;

    @Value("")
    private String tripPicturesBaseUrl;

    @Override
    public String uploadImage(Long id, MultipartFile file, ImageType type) throws IIOException {
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

        return "";
    }

    @Override
    public void deleteImage(Long id) throws IOException {

    }

    private String getExtension(String filename){
        if(filename==null || !filename.contains(".")){
            return ".jpg";
        }
        return filename.substring(filename.lastIndexOf("."));
    }
}
