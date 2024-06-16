package com.dne.dne_Backend.services;


import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dne.dne_Backend.entity.User;
import com.dne.dne_Backend.entity.UserLoginRequest;
import com.dne.dne_Backend.entity.UserRegisterRequest;
import com.dne.dne_Backend.repository.UserRepository;




@Service
public class UserService {
    
	 @Autowired
	    private UserRepository userRepository;

	    // Login method
	    public ResponseEntity<Map<String, String>> login(UserLoginRequest loginRequest) {
	        // Retrieve user by username
	        User user = userRepository.findByUserName(loginRequest.getUserName());

	        Map<String, String> response = new HashMap<>();
	        if (user != null && user.getPassword().equals(loginRequest.getPassword())) {
	            response.put("message", "Login successful");
	            return new ResponseEntity<>(response, HttpStatus.OK);
	        } else {
	            response.put("message", "Invalid username or password");
	            return new ResponseEntity<>(response, HttpStatus.UNAUTHORIZED);
	        }
	    }

	    // Registration method
	    public ResponseEntity<Map<String, String>> register(UserRegisterRequest registerRequest) {
	        Map<String, String> response = new HashMap<>();
	        // Check if username already exists
	        if (userRepository.existsByUserName(registerRequest.getUserName())) {
	            response.put("message", "Username already exists");
	            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
	        }

	        // Create new user
	        User user = new User();
	        user.setUserName(registerRequest.getUserName());
	        user.setEmail(registerRequest.getEmail());
	        user.setPassword(registerRequest.getPassword());

	        // Save user to database
	        userRepository.save(user);

	        response.put("message", "Registration successful");
	        return new ResponseEntity<>(response, HttpStatus.CREATED);
	        
	        
	        
	    }

		public Optional<User> getUserById(Long id) {
			return userRepository.findById(id);
		}
	}