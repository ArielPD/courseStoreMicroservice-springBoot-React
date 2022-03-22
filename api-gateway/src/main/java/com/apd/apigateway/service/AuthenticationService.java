package com.apd.apigateway.service;

import com.apd.apigateway.model.User;

public interface AuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
