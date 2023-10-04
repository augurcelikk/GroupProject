package com.ugur.repository;

import com.ugur.repository.entity.Tweet;
import com.ugur.utility.MyFactoryRepository;

public class TweetRepository extends MyFactoryRepository<Tweet,Long> {
    public TweetRepository() {
        super(new Tweet());
    }
}
