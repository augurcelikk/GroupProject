package com.ugur.repository;

import com.ugur.repository.entity.Retweet;
import com.ugur.repository.entity.Tweet;
import com.ugur.utility.MyFactoryRepository;

public class RetweetRepository extends MyFactoryRepository<Retweet,Long> {
    public RetweetRepository() {
        super(new Retweet());
    }
}
