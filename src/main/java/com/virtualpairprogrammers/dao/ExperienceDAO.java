package com.virtualpairprogrammers.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.fabric.xmlrpc.base.Array;
import com.virtualpairprogrammers.model.User;
import com.virtualpairprogrammers.model.Experience;
import com.virtualpairprogrammers.utils.ConnectionSingleton;
import com.virtualpairprogrammers.utils.GestoreEccezioni;

public class ExperienceDAO {
	private final String QUERY_ALL = "SELECT user.nome, user.cognome, experience.commento, experience.score FROM user, experience WHERE iduser = ? ";
	
	public ExperienceDAO() {}
	
	 
	 public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        Connection connection = ConnectionSingleton.getInstance();
        
        try {
           Statement statement = connection.createStatement();
           ResultSet resultSet = statement.executeQuery(QUERY_ALL);
           
           while (resultSet.next()) {
        	   
        	   
        	   String nome = resultSet.getString("nome");
        	   String cognome = resultSet.getString("cognome");
        	   
        	   
        	   users.add(new User(nome,cognome));

           }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }
	 
	 public List<Experience> getAllExperiences() {
	        List<Experience> experiences = new ArrayList<>();
	        Connection connection = ConnectionSingleton.getInstance();
	        
	        try {
	           Statement statement = connection.createStatement();
	           ResultSet resultSet = statement.executeQuery(QUERY_ALL);
	           
	           while (resultSet.next()) {
	        	   
	        	   
	        	   String commento = resultSet.getString("commento");
	        	   int score = resultSet.getInt("score");
	        	   
	        	   experiences.add(new Experience(commento,score));

	           }
	        }
	        catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return experiences;
	    }
	 
	 /* List<String> newList = new ArrayList<String>();
	 newList.addAll(Users);
	 newList.addAll(Experience);
	 */
}
