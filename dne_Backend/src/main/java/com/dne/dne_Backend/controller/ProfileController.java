package com.dne.dne_Backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dne.dne_Backend.entity.Profile;
import com.dne.dne_Backend.services.ProfileService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/profiles")

public class ProfileController {
	
	@Autowired
    private ProfileService profileService;

    @PostMapping("/api")
    public void addProfile(@RequestBody Profile profile) {
    	profileService.addProfile(profile);
    }

    @PutMapping("/{profileId}")
    public void updateUser(@PathVariable int profileId, @RequestBody Profile profile) {
    	profile.setUserId(profileId);
        profileService.UpdateProfile(profile);
    }

    @DeleteMapping("/{profileId}")
    public void deleteProfile(@PathVariable int profileId) {
    	profileService.deleteProfile(profileId);
    }

    @GetMapping("/{profileId}")
    public Profile getProfileById(@PathVariable int profileId) {
        return profileService.getProfileById(profileId);
    }

    @GetMapping("/profile")
    public List<Profile> getAllProfiles() {
        return profileService.getAllProfiles();
    }

}
