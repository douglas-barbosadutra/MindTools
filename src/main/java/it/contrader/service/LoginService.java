package it.contrader.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//import it.contrader.model.User;
import it.contrader.dto.UserDTO;
import it.contrader.dao.UserDAO;
import it.contrader.converter.ConverterUser;

@Service
public class LoginService {

    private UserDAO userDAO;

    @Autowired
    public LoginService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public UserDTO login(String username, String password) {
        return ConverterUser.toDTO(this.userDAO.findUserByUsernameAndPassword(username, password));
    }
}