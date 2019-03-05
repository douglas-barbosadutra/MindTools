package main.service;

import java.util.ArrayList;
import java.util.List;


import main.dao.UserDAO;
import main.model.Principi;
import main.model.User;

public class UserService {
	private UserDAO userDAO;
	
	
	public UserService() {
		this.userDAO = new UserDAO();
		
	}
	    
	    public List<Principi> getAllPrincipi() {
	    	return this.userDAO.getAllPrincipi();
	    }

	    public List<Principi> searchPrincipi(String p_chiave) {
			return this.userDAO.searchPrincipi(p_chiave);

		}
		
	    public Principi getPrincipiRandom () {
	    	
	    	return this.userDAO.getPrincipiRandom();
	    }
	


}
