package com.example.apigateway.service;

import com.example.apigateway.model.Role;
import com.example.apigateway.model.User;
import com.example.apigateway.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.transaction.Transactional;
import java.time.ZonedDateTime;
import java.util.Optional;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User saveUSer(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(Role.USER);
        user.setCreateTime(ZonedDateTime.now());

        return userRepository.save(user);
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    @Transactional //Transactional is required when executing an update/delete query.
    public void changeRole(Role newRole, String username) {
        userRepository.updateUserRole(username, newRole);
    }
}
