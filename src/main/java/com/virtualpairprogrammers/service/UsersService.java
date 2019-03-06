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
	
	
	

	public UsersService() {
		this.userDAO = new UserDAO();
		this.userDTO = new UserDTO();
	}

	/**
	 * Come vediamo la lista recuperata è di tipo Esempio ma noi la convertiamo in EsempioDTO
	 * Invito chi fa i converter a fare un metodo per convertire direttamente la lista senza farli uno ad uno perchè è sporco e poco efficiente
	 */
	/*public User  getUser() {
		List<User> list = userDAO.getAllUser();
		
		List<UserDTO> listDTO = new ArrayList<>();
		User user1;
		for (User user : list) {
			user1= UserConverter.toEntity(userDTO);
			listDTO.add(user1);

			
			
		}
		return listDTO;
	}
	*/
	
	
	public UserDTO getUserByUsernameAndPassword(String username, String password) {
		return UserConverter.toDTO(userDAO.login(username, password));
	}
	public UserDTO getUserByDAO(UserDAO userDAO) {
		List<User> list = userDAO.getAllUser();
		User user1 = list.get(0);
		userDTO = UserConverter.toDTO(user1);
		return userDTO;
		
	}

	/*public boolean updateUsers (UserDTO userDTO) {
		//return this.userDAO.updateUser(UserConverter.toEntity(userDTO));
		
}
	
	public boolean deleteUsers (UserDTO userDTO) {
		return this.userDAO.deleteUser(UserConverter.toEntity(userDTO));
		
}
	
	public boolean insertUsers (UserDTO userDTO) {
		return this.userDAO.insertUser(UserConverter.toEntity(userDTO));
	
}
		*/
	
	
}
