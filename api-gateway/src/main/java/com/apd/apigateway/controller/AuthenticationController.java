package com.apd.apigateway.controller;

import com.apd.apigateway.model.User;
import com.apd.apigateway.service.AuthenticationService;
import com.apd.apigateway.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/authentication") //pre-path
public class AuthenticationController {

    @Autowired
   private AuthenticationService authenticationService;

    @Autowired
    private UserService userService;

    @PostMapping("sign-up") //api/authentication/sign-up
    public ResponseEntity<?> signUp(@RequestBody User user) {
        if (userService.findByUsername(user.getUsername()).isPresent()) {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>(userService.saveUSer(user), HttpStatus.CREATED);
    }

    @PostMapping("sign-in") //api/authentication/sign-up
    public ResponseEntity<?> signIn(@RequestBody User user) {
        return new ResponseEntity<>(authenticationService.signInAndReturnJWT(user), HttpStatus.OK);
    }
}
