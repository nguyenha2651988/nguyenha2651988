package test_heroku.service.impl;

import test_heroku.model.Comment;
import test_heroku.repository.CommentRepository;
import test_heroku.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;

public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentRepository commentRepository;

    @Override
    public void save(Comment comment) {
        commentRepository.save(comment);
    }
}
