package com.pCarpet.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.pCarpet.model.User;


public interface UserDAO extends CrudRepository<User, Integer>{
	public User findUserByUsernameAndPassword(String username, String password);
	public User findUserByIdUser(int idUser);
	
	
	public List<User> findAll();
}