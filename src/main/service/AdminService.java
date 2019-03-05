package main.service;

import java.util.List;


import main.dao.AdminDAO;

import main.model.User;

public class AdminService {
	private AdminDAO AdminDAO;

    public AdminService() {
        this.AdminDAO = new AdminDAO();
    }

    public boolean InsertUser (User users) {
       return this.AdminDAO.InsertUser (users);
    }
    
    public boolean DeleteUser (int iduser) {
       return this.AdminDAO.DeleteUser (iduser);
    }
    
    public void  UpdateUser (String user, String nome, int iduser) {
        this.AdminDAO. UpdateUser (user, nome, iduser);
    }
    
    public List<User> getAllUser () {
    	List<User> users = this.AdminDAO.getAllUser();
    	
		
		
		return users;
    }

		
}

