package com.ugur.service;

import com.ugur.repository.PhotosRepository;
import com.ugur.repository.entity.Photos;
import com.ugur.repository.entity.Retweet;

import java.util.List;
import java.util.Optional;

public class PhotosService {
    PhotosRepository photosRepository;
    public PhotosService() {
        this.photosRepository = new PhotosRepository();
    }

    public Photos save(Photos photos){
        return photosRepository.save(photos);
    }


    public List<Photos> findAll(){
        return photosRepository.findAll();
    }

    public Optional<Photos> findById(Long id){
        return photosRepository.findById(id);
    }

    public List<Photos> saveAll(List<Photos> photosListo){
        return (List<Photos>) photosRepository.saveAll(photosListo);
    }

    public void delete(Photos photos){
        photosRepository.delete(photos);
    }

    public void deleteById(Long id){
        photosRepository.deleteById(id);
    }

    public boolean existById(Long id){
        return photosRepository.existById(id);
    }
    public List<Photos> findByEntity(Photos photos){
        return photosRepository.findByEntity(photos);
    }

    public List<Photos> findByColumnNameAndValue(String columnName, String columnValue){
        return photosRepository.findByColumnNameAndValue(columnName,columnValue);
    }
}
