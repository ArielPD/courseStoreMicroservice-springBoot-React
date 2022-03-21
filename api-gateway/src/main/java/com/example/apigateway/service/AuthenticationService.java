package com.example.apigateway.service;

import com.example.apigateway.model.User;

public interface AuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
