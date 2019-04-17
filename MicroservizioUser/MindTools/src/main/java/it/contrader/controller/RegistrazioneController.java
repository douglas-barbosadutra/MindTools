package it.contrader.controller;

import java.io.UnsupportedEncodingException;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.ExpiredJwtException;
import it.contrader.model.User;
import it.contrader.service.UserService;
import it.contrader.utils.JwtUtils;
import it.contrader.dto.ParamDTO;
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

	public ResponseEntity<UserDTO> registrazione(@RequestBody ParamDTO param)

	{
		LinkedHashMap user = (LinkedHashMap) param.getParam();

		try {
			int rank = this.getRankFromJwt(param.getJwt());

			if (rank == 1) {
				return ResponseEntity.status(HttpStatus.OK)
						.body(userService.insertUser(new UserDTO(Integer.parseInt(user.get("idUser").toString()),
								user.get("username").toString(), user.get("password").toString(),
								user.get("nome").toString(), user.get("cognome").toString(),
								user.get("email").toString(), user.get("lingua").toString(),
								Integer.parseInt(user.get("rank").toString()))));
			} else
				return ResponseEntity.status(HttpStatus.FORBIDDEN).body(null);

		} catch (ExpiredJwtException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			return ResponseEntity.status(HttpStatus.FORBIDDEN).body(null);
		}

	}

	private int getRankFromJwt(String jwt) throws ExpiredJwtException, UnsupportedEncodingException {

		Map<String, Object> data = JwtUtils.jwt2Map(jwt);
		int rank = Integer.parseInt(data.get("scope").toString());

		return rank;
	}

}