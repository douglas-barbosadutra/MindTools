package it.contrader.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.contrader.dao.UserDAO;
import it.contrader.model.User;

@Service
public class LoginService {

    private UserDAO userDAO;

    @Autowired
    public LoginService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public User login(String username, String password) {
        return this.userDAO.findUserByUsernameAndPassword(username, password);
    }
}