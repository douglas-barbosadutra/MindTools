package it.contrader.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.contrader.dao.UserDAO;
import it.contrader.dto.UserDTO;
import it.contrader.model.User;
import it.contrader.converter.ConverterUser;

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