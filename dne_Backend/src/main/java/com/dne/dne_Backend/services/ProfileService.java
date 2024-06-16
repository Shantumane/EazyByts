package com.dne.dne_Backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dne.dne_Backend.entity.Profile;
import com.dne.dne_Backend.repository.ProfileRepository;


@Service
public class ProfileService {

	@Autowired
	private ProfileRepository profileRepository;
	
	public List<Profile> getAllProfile(){
		return profileRepository.findAll();
	}

	public Profile addProfile(Profile profile) {
		return profileRepository.save(profile);
	}
	
	public void UpdateProfile(Profile profile) {
		profileRepository.save(profile);
	}
	
	public void deleteProfile(int userId) {
		profileRepository.deleteById(userId);
	}
	
	public Profile getProfileById(int userId) {
		return profileRepository.findById(userId).orElse(null);
	}
	
	public List<Profile> getAllProfiles(){
		return profileRepository.findAll();
	}

}
