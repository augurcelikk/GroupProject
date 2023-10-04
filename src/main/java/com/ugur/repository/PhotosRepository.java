package com.ugur.repository;

import com.ugur.repository.entity.Photos;
import com.ugur.repository.entity.Tweet;
import com.ugur.utility.MyFactoryRepository;

public class PhotosRepository extends MyFactoryRepository<Photos,Long> {
    public PhotosRepository() {
        super(new Photos());
    }
}
