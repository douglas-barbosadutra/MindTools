package com.virtualpairprogrammers.service;

import java.util.ArrayList;
import java.util.List;

import com.virtualpairprogrammers.converter.UserConverter;
import com.virtualpairprogrammers.dao.UserDAO;
import com.virtualpairprogrammers.dto.UserDTO;
import com.virtualpairprogrammers.model.User;

/**
 * Classe che si occupa di interfacciarsi con la persistenza e recuperare
 * attraverso i metodi del Data Access Object le tuple desiderate, Le converte
 * in un oggetto DTO e le restituisce al controller opportuno
 */
public class UsersService {

	

	private UserDAO userDAO;
	private UserDTO userDTO;
	public static User user;
	private static int id_usersesion;
	
	
	

	public static User getUser() {
		return user;
	}

	public static void setUser(User user) {
		UsersService.user = user;
	}

	public UsersService() {
		this.userDAO = new UserDAO();
		this.userDTO = new UserDTO();
	}
	public UserDTO getUserDTO() {
		return userDTO;
	}

	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}

	public static int getId_usersesion() {
		return id_usersesion;
	}

	public static void setId_usersesion(int id_usersesion) {
		UsersService.id_usersesion = id_usersesion;
	}

	public UserDTO getUserById(int id_user) {
		List<User> list = userDAO.getAllUser();
		UserDTO userDTO = new UserDTO() ;
		for(User u : list) {
			if (u.getIduser() == id_user)
				userDTO = UserConverter.toDTO(u);
		}
		
		return userDTO;
		
	}
	
	
	public UserDTO getUserByUsernameAndPassword(String username, String password) {
		return UserConverter.toDTO(userDAO.login(username, password));
	}
	public UserDTO getUserByDAO(UserDAO userDAO) {
		List<User> list = userDAO.getAllUser();
		User user1 = list.get(0);
		userDTO = UserConverter.toDTO(user1);
		return userDTO;
		
	}
	public List<UserDTO> getAllUsers(){
		List<User> users = this.userDAO.getAllUser();
    	List<UserDTO> usersDTO = new ArrayList<>();
    	
		for(User utente: users) {
			usersDTO.add(UserConverter.toDTO(utente));
		}
		return usersDTO;
	}

	public boolean insertUsers (UserDTO userDTO) {
		return this.userDAO.InsertUser(UserConverter.toEntity(userDTO));
	
}
	
	 public void insertUser (User user) {
		 
	       this.userDAO.InsertUser(user);
	    }
		
	
	
}
