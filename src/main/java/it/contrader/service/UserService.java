package com.pCarpet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pCarpet.dao.UserDAO;
import com.pCarpet.dto.UserDTO;
import com.pCarpet.model.User;
import com.pCarpet.converter.ConverterUser;

@Service
public class UserService {

	private UserDAO userDAO;

	private static User user = null;

	@Autowired
	public UserService(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public void deleteUser(int id) {
		this.userDAO.deleteById(id);
	}

	public void insertUser(UserDTO userdto) {
		userDAO.save(ConverterUser.toEntity(userdto));
		
	}

	public List<UserDTO> getAllUsers() {
		return ConverterUser.toListDTO(userDAO.findAll());
	}

	/*
	 * public User findUserById(int id) { return userDAO.findUserById(id); }
	 */
	
	public static void setUserSession(User u) {
		user = u;
	}

	public static User getUserSession() {
		return user;
	}
}