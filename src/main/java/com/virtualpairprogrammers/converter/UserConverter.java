package com.virtualpairprogrammers.converter;

import java.util.ArrayList;
import java.util.List;


import com.virtualpairprogrammers.dto.UserDTO;
import com.virtualpairprogrammers.model.User;

/**
 * Il converter si occupa di "convertire" un model in un dto e viceversa
 *
 */
public class UserConverter {


	/**
	 * Converte un NodesDTO in Nodes
	 */
	public static User toEntity(UserDTO userDTO) {

		User user = null;
		//UserDTO usersDTO = new UserDTO();
		if (userDTO != null) {
			 user = new User(userDTO.getIduser(), userDTO.getUser(), userDTO.getPassword(), userDTO.getNome(), userDTO.getCognome(), userDTO.getTipouser());
		}

		return user;
	}

	/**
	 * Converte un Nodes in NodesDTO
	 */
	public static UserDTO toDTO(User user) {

		UserDTO usersDTO = null;
		if (user != null) {
			usersDTO = new UserDTO(user.getIduser(), user.getUser(), user.getPassword(), user.getNome(), user.getCognome(), user.getTipoUser());
		}

		return usersDTO;
	}
	

}