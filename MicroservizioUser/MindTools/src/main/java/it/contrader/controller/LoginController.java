package it.contrader.controller;

import java.io.UnsupportedEncodingException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.contrader.dto.LoginDTO;
import it.contrader.dto.UserDTO;
import it.contrader.dto.UserLoggedDTO;
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
	public ResponseEntity<UserLoggedDTO> login(@RequestBody LoginDTO loginDTO) 
	{	
		UserDTO userDTO = loginService.login(loginDTO);
		
		if(userDTO != null)
		{
			try {
				
				String jwt = loginService.createJwt(""+userDTO.getIdUser(), userDTO.getUsername(), userDTO.getPassword(),new Date());
				UserLoggedDTO userLogged = new UserLoggedDTO(jwt, userDTO.getRank());
				System.out.println(jwt);
				return ResponseEntity.status(HttpStatus.OK).header("jwt", jwt).body(userLogged);
			}
			catch (UnsupportedEncodingException e) {
				
				 return ResponseEntity.status(HttpStatus.FORBIDDEN).body(null);
			}
		}
		return ResponseEntity.status(HttpStatus.FORBIDDEN).body(null);
	}
	
}