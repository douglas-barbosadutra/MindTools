package it.contrader.controller;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.contrader.dao.UserDAO;
import it.contrader.dto.LoginDTO;
import it.contrader.dto.UserDTO;
import it.contrader.dto.UserLoggedDTO;
import it.contrader.model.User;
import it.contrader.service.LoginService;

import it.contrader.utils.UserNotLoggedException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@CrossOrigin(value="*")
@RestController
@RequestMapping("/Login")
public class LoginController {
	private String jwt = " ";
	
	
    
    @Autowired
    LoginService loginService;
	
	@RequestMapping(value = "/authentication", method = RequestMethod.POST)
	public ResponseEntity<JsonResponseBody> login(@RequestParam(value ="username") String username, @RequestParam(value="password") String password) 
	{	
		
		  try {
	            Optional<User> userr = loginService.getUserFromDbAndVerifyPassword(username, password);
	            if(userr.isPresent()){
	                User user = userr.get();
	                jwt = loginService.createJwt(user.getIdUser().toString(), user.getUsername(), user.getRank().toString(), new Date());
	                
	                System.out.println(jwt);
	                return ResponseEntity.status(HttpStatus.OK).header("jwt", jwt).body(new JsonResponseBody(HttpStatus.OK.value(),jwt));
	            }
	        }catch (UserNotLoggedException e1){
	            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(new JsonResponseBody(HttpStatus.FORBIDDEN.value(), "Login failed! Wrong credentials" + e1.toString()));
	        }catch (UnsupportedEncodingException e2){
	            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(new JsonResponseBody(HttpStatus.FORBIDDEN.value(), "Token Error" + e2.toString()));
	        }
	        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(new JsonResponseBody(HttpStatus.FORBIDDEN.value(), "No corrispondence in the database of users"));
	}
	
	  @AllArgsConstructor
	    public class JsonResponseBody{
	        @Getter @Setter
	        private int server;
	        @Getter @Setter
	        private String token;
	    }
	
	
}