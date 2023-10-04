package com.ugur.controller;

import com.ugur.repository.CommentRepository;
import com.ugur.repository.entity.Comment;
import com.ugur.service.CommentService;

import java.util.List;
import java.util.Optional;

public class CommentController {
    CommentService commentService;

    public CommentController() {
        this.commentService = new CommentService();
    }


    public Comment save(Comment comment) {
        return commentService.save(comment);
    }


    public List<Comment> findAll() {
        return commentService.findAll();
    }

    public Optional<Comment> findById(Long id) {
        return commentService.findById(id);
    }

    public List<Comment> saveAll(List<Comment> commentList) {
        return (List<Comment>) commentService.saveAll(commentList);
    }

    public void delete(Comment comment) {
        commentService.delete(comment);
    }

    public void deleteById(Long id) {
        commentService.deleteById(id);
    }

    public boolean existById(Long id) {
        return commentService.existById(id);
    }

    public List<Comment> findByEntity(Comment comment) {
        return commentService.findByEntity(comment);
    }

    public List<Comment> findByColumnNameAndValue(String columnName, String columnValue) {
        return commentService.findByColumnNameAndValue(columnName, columnValue);
    }
}
