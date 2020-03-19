package test_heroku.service;

import test_heroku.model.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {
    void save(Post post);
    List<Post> findAll();
    Iterable<Post> findAllPost();
    Optional<Post> findById(Long id);
    void delete(Long id);
    List<Post> getAllByCategoryId(Long id);
    List<Post> findAllByName(String name);
    List<Post> getAllByUserId(Long id);

}
