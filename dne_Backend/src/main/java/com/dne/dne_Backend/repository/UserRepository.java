package com.dne.dne_Backend.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dne.dne_Backend.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	 // Method to find user by username
    User findByUserName(String userName);

    // Method to check if username already exists
    boolean existsByUserName(String userName);
    
    
	

}