package com.minhaempresa.course_077.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.minhaempresa.course_077.entities.User;
import com.minhaempresa.course_077.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmailc.com", "99999999999", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmailc.com", "99988888888", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
}
