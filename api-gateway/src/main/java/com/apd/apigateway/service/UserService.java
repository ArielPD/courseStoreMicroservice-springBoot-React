package com.apd.apigateway.service;

import com.apd.apigateway.model.Role;
import com.apd.apigateway.model.User;

import java.util.Optional;

public interface UserService {
    User saveUSer(User user);

    Optional<User> findByUsername(String username);

    void changeRole(Role newRole, String username);
}
