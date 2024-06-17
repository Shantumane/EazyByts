package com.dne.dne_Backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Profile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 	private int profileId;
	    private int userId;
	    private String profileType;
	    private String profileContent;
	    
	    
		public int getProfileId() {
			return profileId;
		}


		public void setProfileId(int profileId) {
			this.profileId = profileId;
		}


		public int getUserId() {
			return userId;
		}


		public void setUserId(int userId) {
			this.userId = userId;
		}


		public String getProfileType() {
			return profileType;
		}


		public void setProfileType(String profileType) {
			this.profileType = profileType;
		}


		public String getProfileContent() {
			return profileContent;
		}


		public void setProfileContent(String profileContent) {
			this.profileContent = profileContent;
		}


		public Profile(int profileId, int userId, String profileType, String profileContent) {
			this.profileId = profileId;
			this.userId = userId;
			this.profileType = profileType;
			this.profileContent = profileContent;
		}


		public Profile() {
			
		}
	    
	    
		
		

}
