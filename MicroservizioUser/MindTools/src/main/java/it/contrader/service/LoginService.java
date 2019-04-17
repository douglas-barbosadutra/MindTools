package it.contrader.service;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//import it.contrader.model.User;
import it.contrader.dto.UserDTO;
import it.contrader.utils.JwtUtils;
import it.contrader.dao.UserDAO;
import it.contrader.converter.ConverterUser;
import it.contrader.dto.LoginDTO;

@Service
public class LoginService {

    private UserDAO userDAO;

    @Autowired
    public LoginService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public UserDTO login(LoginDTO loginDTO) {
        return ConverterUser.toDTO(this.userDAO.findUserByUsernameAndPassword(loginDTO.getUsername(), loginDTO.getPassword()));
    }
    
    public String createJwt(String subject, String name, String permission, Date dateNow) throws UnsupportedEncodingException {
		
		 Date expDate = dateNow;
       expDate.setTime(dateNow.getTime() + (7200*1000));
      
       String token = JwtUtils.generateJwt(subject, expDate, name, permission);
       return token;
	}
	
	public Map<String,Object> verifyJwtAndGetData(HttpServletRequest request) throws Exception{
		
		String jwt = JwtUtils.getJwtFromHttpRequest(request);
       if(jwt == null){
           throw new Exception("Authentication token not found in the request");
       }
       Map<String, Object> userData = JwtUtils.jwt2Map(jwt);
       return userData;
	}
	
	
}
