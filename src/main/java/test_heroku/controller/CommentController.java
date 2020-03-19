package test_heroku.controller;

import test_heroku.model.Comment;
import test_heroku.service.CommentService;
import test_heroku.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    PostService postService;
    @Autowired
    CommentService commentService;
//    @GetMapping("/list")
//    public ResponseEntity<List<Comment>> getAllComment() {
//        try {
//            List<Comment> comments = commentService.findAllAndSortByDate();
//            return new ResponseEntity<List<Comment>>(comments, HttpStatus.OK);
//        }
//        catch (Exception e) {
//            return new ResponseEntity<List<Comment>>(HttpStatus.NOT_FOUND);
//        }
//    }

    @PostMapping("/save")
    public ResponseEntity<List<Comment>> addComment(@RequestBody Comment comment) {
        commentService.save(comment);
        return new ResponseEntity<List<Comment>>(HttpStatus.CREATED);
    }
}
