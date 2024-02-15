package com.project.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.password.PasswordEncoder;

import lombok.extern.log4j.Log4j;

@Log4j
public class CustomNoOpPasswordEncoder implements PasswordEncoder{
	
	private final Logger log = LoggerFactory.getLogger(CustomNoOpPasswordEncoder.class);
	
	public String encode(CharSequence rawPassword) {
		
		log.warn("before encod : " + rawPassword);
		
		return rawPassword.toString();
		
	}

	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		
		log.warn("mathces: " + rawPassword + ": " + encodedPassword);
		
		return rawPassword.toString().equals(encodedPassword);
	}
}
