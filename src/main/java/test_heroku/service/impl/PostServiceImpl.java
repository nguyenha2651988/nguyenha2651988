package test_heroku.service.impl;

import test_heroku.model.Post;
import test_heroku.repository.PictureRepository;
import test_heroku.repository.PostRepository;
import test_heroku.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostRepository postRepository;
    @Autowired
    PictureRepository pictureRepository;
    @Override
    public void save(Post post) {
        postRepository.save(post);
    }

    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    @Override
    public Iterable<Post> findAllPost() {
        return postRepository.findAll();
    }

    @Override
    public Optional<Post> findById(Long id) {
        return postRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        postRepository.deleteById(id);
    }

    @Override
    public List<Post> getAllByCategoryId(Long id) {
        return postRepository.getAllByCategoryId(id);
    }

    @Override
    public List<Post> findAllByName(String name) {
        return postRepository.findAllByName(name);
    }

    @Override
    public List<Post> getAllByUserId(Long id) {
        return postRepository.getAllByUserId(id);
    }
}
