package com.ugur.service;

import com.ugur.repository.RetweetRepository;
import com.ugur.repository.TweetRepository;
import com.ugur.repository.entity.Retweet;
import com.ugur.repository.entity.Tweet;

import java.util.List;
import java.util.Optional;

public class RetweetService {
    RetweetRepository retweetRepository;
    public RetweetService() {
        this.retweetRepository = new RetweetRepository();
    }

    public Retweet save(Retweet retweet){
        return retweetRepository.save(retweet);
    }


    public List<Retweet> findAll(){
        return retweetRepository.findAll();
    }

    public Optional<Retweet> findById(Long id){
        return retweetRepository.findById(id);
    }

    public List<Retweet> saveAll(List<Retweet> retweetList){
        return (List<Retweet>) retweetRepository.saveAll(retweetList);
    }

    public void delete(Retweet retweet){
        retweetRepository.delete(retweet);
    }

    public void deleteById(Long id){
        retweetRepository.deleteById(id);
    }

    public boolean existById(Long id){
        return retweetRepository.existById(id);
    }
    public List<Retweet> findByEntity(Retweet retweet){
        return retweetRepository.findByEntity(retweet);
    }

    public List<Retweet> findByColumnNameAndValue(String columnName, String columnValue){
        return retweetRepository.findByColumnNameAndValue(columnName,columnValue);
    }
}
