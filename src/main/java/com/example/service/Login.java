package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class Login {

	  public boolean validateUser(String userid, String password) {
	        return userid.equalsIgnoreCase("Ayushee")
	                && password.equalsIgnoreCase("password");
	    }
}
