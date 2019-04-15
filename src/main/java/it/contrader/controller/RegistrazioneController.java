package it.contrader.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.contrader.model.User;
import it.contrader.service.UserService;
import it.contrader.dto.UserDTO;

@RestController
@RequestMapping("/Registrazione")
public class RegistrazioneController {
	
	private UserService userService;
	
	@Autowired
	public RegistrazioneController(UserService userService) {
		this.userService = userService;
	}
	
	@CrossOrigin
	@RequestMapping(value = "/reg", method = RequestMethod.POST)
	
	public UserDTO registrazione(		
			
			@RequestParam(value = "iduser") String iduser,
			@RequestParam(value = "username") String username,
			@RequestParam(value = "password") String password,
			@RequestParam(value = "nome") String nome,
			@RequestParam(value = "congome") String cognome,
			@RequestParam(value = "email") String email,			
			@RequestParam(value = "lingua") String lingua
			
			
	) 
	{

		try {
		
		int idUser = Integer.parseInt(iduser);
		UserDTO  userDTO = new UserDTO(idUser,  username, password,nome, cognome, email, lingua);
		userDTO = userService.insertUser(userDTO);
		return userDTO;
		}
		catch(Exception e )
		{
			e.printStackTrace();
			UserDTO userDTO1 = new UserDTO();
			return userDTO1 = null;
		}

	
	}
	
	
	

}