package it.contrader.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.jpa.repository.JpaRepository;

import it.contrader.model.User;


public interface UserDAO extends CrudRepository<User, Integer>{
	//public User findUserByUsernameAndPassword(String username, String password);
	Optional<User> findUserByUsernameAndPassword(String username, String password);
	public User findUserByIdUser(int idUser);
	
	
	public List<User> findAll();
	
}