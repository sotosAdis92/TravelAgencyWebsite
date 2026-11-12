package com.example.server.service.impl;

import com.example.server.service.ImageService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.IIOException;
import java.io.IOException;

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
    public String uploadImage(Long id, MultipartFile file) throws IIOException {
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
