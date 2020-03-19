package test_heroku.service;

import test_heroku.model.signinSignup.Role;
import test_heroku.model.signinSignup.RoleName;

import java.util.List;
import java.util.Optional;

public interface RoleService {
    Optional<Role> findByName(RoleName roleName);
    void save(Role role);
    List<Role> findAll();
    void delete(Role role);
}
