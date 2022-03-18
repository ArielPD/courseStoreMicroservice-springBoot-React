package com.example.apigateway.service;

import com.example.apigateway.model.Role;
import com.example.apigateway.model.User;

import java.util.Optional;

public interface UserService {
    User saveUSer(User user);

    Optional<User> findByUsername(String username);

    void changeRole(Role newRole, String username);
}
