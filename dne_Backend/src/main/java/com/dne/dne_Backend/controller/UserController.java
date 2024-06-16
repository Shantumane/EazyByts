package com.dne.dne_Backend.controller;



import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.dne.dne_Backend.entity.User;
import com.dne.dne_Backend.entity.UserLoginRequest;
import com.dne.dne_Backend.entity.UserRegisterRequest;
import com.dne.dne_Backend.services.UserService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login(@RequestBody UserLoginRequest loginRequest) {
        return userService.login(loginRequest);
    }

    @PostMapping("/register")
    public ResponseEntity<Map<String, String>> register(@RequestBody UserRegisterRequest registerRequest) {
        return userService.register(registerRequest);
    }
    
    @GetMapping("user/{id}")
    public Optional<User> getUser(@PathVariable Long id) {
        return userService.getUserById(id);
    }
}
