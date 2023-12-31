package com.ugur.service;

import com.ugur.controller.CommentController;
import com.ugur.repository.CommentRepository;
import com.ugur.repository.PhotosRepository;
import com.ugur.repository.entity.Comment;
import com.ugur.repository.entity.Photos;

import java.util.List;
import java.util.Optional;

public class CommentService {

    CommentRepository commentRepository;

    public CommentService() {
        this.commentRepository = new CommentRepository();
    }


    public Comment save(Comment comment) {
        return commentRepository.save(comment);
    }


    public List<Comment> findAll() {
        return commentRepository.findAll();
    }

    public Optional<Comment> findById(Long id) {
        return commentRepository.findById(id);
    }

    public List<Comment> saveAll(List<Comment> commentList) {
        return (List<Comment>) commentRepository.saveAll(commentList);
    }

    public void delete(Comment comment) {
        commentRepository.delete(comment);
    }

    public void deleteById(Long id) {
        commentRepository.deleteById(id);
    }

    public boolean existById(Long id) {
        return commentRepository.existById(id);
    }

    public List<Comment> findByEntity(Comment comment) {
        return commentRepository.findByEntity(comment);
    }

    public List<Comment> findByColumnNameAndValue(String columnName, String columnValue) {
        return commentRepository.findByColumnNameAndValue(columnName, columnValue);
    }
}
