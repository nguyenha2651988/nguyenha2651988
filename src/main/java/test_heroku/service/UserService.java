package test_heroku.service;

import test_heroku.model.signinSignup.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<User> findById(Long id);
    Optional<User> findByUsername(String username);
    void save(User user);
    List<User> findAll();
    void delete (User user);
}
