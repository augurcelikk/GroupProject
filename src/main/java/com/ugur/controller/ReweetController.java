package com.ugur.controller;

import com.ugur.repository.RetweetRepository;
import com.ugur.repository.entity.Retweet;
import com.ugur.service.RetweetService;

import java.util.List;
import java.util.Optional;

public class ReweetController {
     RetweetService retweetService;
    public ReweetController() {
        this.retweetService = new RetweetService();
    }

    public Retweet save(Retweet retweet){
        return retweetService.save(retweet);
    }


    public List<Retweet> findAll(){
        return retweetService.findAll();
    }

    public Optional<Retweet> findById(Long id){
        return retweetService.findById(id);
    }

    public List<Retweet> saveAll(List<Retweet> retweetList){
        return (List<Retweet>) retweetService.saveAll(retweetList);
    }

    public void delete(Retweet retweet){
        retweetService.delete(retweet);
    }

    public void deleteById(Long id){
        retweetService.deleteById(id);
    }

    public boolean existById(Long id){
        return retweetService.existById(id);
    }
    public List<Retweet> findByEntity(Retweet retweet){
        return retweetService.findByEntity(retweet);
    }

    public List<Retweet> findByColumnNameAndValue(String columnName, String columnValue){
        return retweetService.findByColumnNameAndValue(columnName,columnValue);
    }
}
