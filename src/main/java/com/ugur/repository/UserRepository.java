package com.ugur.repository;

import com.ugur.repository.entity.User;
import com.ugur.utility.MyFactoryRepository;

public class UserRepository extends MyFactoryRepository<User,Long> {
    public UserRepository() {
        super(new User());
    }
}
