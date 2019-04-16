package it.contrader.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.contrader.dto.UserDTO;
import it.contrader.service.LoginService;

@CrossOrigin(value="*")
@RestController
@RequestMapping("/Login")
public class LoginController {
	
	private LoginService loginService;
	
	@Autowired
	public LoginController(LoginService ls) {
		loginService = ls;
	}
	
	@RequestMapping(value = "/authentication", method = RequestMethod.POST)
	public UserDTO login(@RequestParam("username") String username, @RequestParam("password") String password) {
		return(loginService.login(username, password));
	}
	
}