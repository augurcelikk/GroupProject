package com.ugur.controller;

import com.ugur.repository.PhotosRepository;
import com.ugur.repository.entity.Photos;
import com.ugur.service.PhotosService;

import java.util.List;
import java.util.Optional;

public class PhotosController {
    PhotosService photosService;
    public PhotosController() {
        this.photosService = new PhotosService();
    }

    public Photos save(Photos photos){
        return photosService.save(photos);
    }


    public List<Photos> findAll(){
        return photosService.findAll();
    }

    public Optional<Photos> findById(Long id){
        return photosService.findById(id);
    }

    public List<Photos> saveAll(List<Photos> photosListo){
        return (List<Photos>) photosService.saveAll(photosListo);
    }

    public void delete(Photos photos){
        photosService.delete(photos);
    }

    public void deleteById(Long id){
        photosService.deleteById(id);
    }

    public boolean existById(Long id){
        return photosService.existById(id);
    }
    public List<Photos> findByEntity(Photos photos){
        return photosService.findByEntity(photos);
    }

    public List<Photos> findByColumnNameAndValue(String columnName, String columnValue){
        return photosService.findByColumnNameAndValue(columnName,columnValue);
    }
}
