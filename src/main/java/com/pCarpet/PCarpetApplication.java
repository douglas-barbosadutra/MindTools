package com.pCarpet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pCarpet.services.UserService;

@SpringBootApplication
public class PCarpetApplication {

	static UserService userService;

	@Autowired
	public PCarpetApplication(UserService userService) {
		this.userService = userService;
	}

	public static void main(String[] args) {
		SpringApplication.run(PCarpetApplication.class, args);
	}
}
