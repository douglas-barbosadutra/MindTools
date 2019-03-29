package it.contrader.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.contrader.model.User;
import it.contrader.service.UserService;
import it.contrader.dto.UserDTO;

@Controller
@RequestMapping("/Registrazione")
public class RegistrazioneController {
	
	private UserService userService;
	
	@Autowired
	public RegistrazioneController(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping(value="/reg", method= RequestMethod.POST)
	public UserDTO insertUser(@RequestBody UserDTO user) {
		return userService.insertUser(user);
	}
	
	
	
	
	

}