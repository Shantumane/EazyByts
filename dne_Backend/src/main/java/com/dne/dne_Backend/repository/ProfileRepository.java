package com.dne.dne_Backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dne.dne_Backend.entity.Profile;



@Repository
public interface ProfileRepository extends JpaRepository<Profile, Integer> {

	List<Profile> findAll();


}
