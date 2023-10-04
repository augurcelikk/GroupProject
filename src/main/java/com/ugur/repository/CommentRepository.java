package com.ugur.repository;

import com.ugur.repository.entity.Comment;
import com.ugur.repository.entity.Tweet;
import com.ugur.utility.MyFactoryRepository;

public class CommentRepository extends MyFactoryRepository<Comment,Long> {
    public CommentRepository() {
        super(new Comment());
    }
}
