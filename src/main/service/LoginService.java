package main.service;

import main.dao.LoginDAO;
import main.model.User;

public class LoginService {

    private LoginDAO loginDAO;

    public LoginService() {
        this.loginDAO = new LoginDAO();
    }

    public User login (String username, String password) {
    	
        return this.loginDAO.login(username, password);
    }
}
