package it.contrader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.contrader.service.UserService;

@SpringBootApplication
public class RestApplication {

	static UserService userService;

	@Autowired
	public RestApplication(UserService userService) {
		//this.nodoService = nodoService;
		this.userService = userService;
	}

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}

}
