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
	private final String QUERY_INSERT = "INSERT INTO experience ( id_user, commento, positivo, negativo, score) values (?,?,?,?,?)";
	private final String QUERY_GET_EXPERIENCE = "SELECT * FROM experience WHERE id_experience = ?";
	public ExperienceDAO() {}
	
	 
	 public List<String> getAllExperiences(User user) {
		    List<String> experiences = new ArrayList();
	        Connection connection = ConnectionSingleton.getInstance();
	        try {
	           PreparedStatement statement = connection.prepareStatement(QUERY_ALL);
	           statement.setInt(1, user.getIduser());
	           ResultSet resultSet = statement.executeQuery();
	           while (resultSet.next()) {
	        	   String nome = resultSet.getString("nome");
	        	   String cognome = resultSet.getString("cognome");
	        	   String commento = resultSet.getString("commento");
	        	   int score = resultSet.getInt("score");
	        	   experiences.add(nome);
	        	   experiences.add(cognome);
	        	   experiences.add(commento);
	        	   experiences.add(Integer.toString(score));
	           }
	        }
	        catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return experiences;
	    }
	 public boolean insertExperience(Experience experience) {
	        Connection connection = ConnectionSingleton.getInstance();
	        try {
	            PreparedStatement statement = connection.prepareStatement(QUERY_INSERT);
	            statement.setInt(1,  experience.getId_user());
	            statement.setString(2, experience.getCommento());
	            statement.setString(3,  experience.getPositivo());
	            statement.setString(4, experience.getNegativo());
	            statement.setInt(5, experience.getScore());
	            return statement.execute();
	        }
	        catch (SQLException e) {
	           /* ((Object) GestoreEccezioni.getInstance()).gestisciEccezione(e);*/
	        	return false;
	        }
	    }
	 public Experience getExperience(int id_experience) {
    	 Connection connection = ConnectionSingleton.getInstance();
         try{
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY_GET_EXPERIENCE);
             preparedStatement.setInt(1, id_experience);
             ResultSet resultSet = preparedStatement.executeQuery();
             Experience experience = new Experience();
             if (resultSet.next()) {
            	 experience.setId_experience(resultSet.getInt("id_experience"));
            	 experience.setId_user(resultSet.getInt("id_user"));
            	 experience.setCommento(resultSet.getString("commento"));
            	 experience.setPositivo(resultSet.getString("positivo"));
            	 experience.setNegativo(resultSet.getString("negativo"));
            	 experience.setScore(resultSet.getInt("score"));
                 preparedStatement.close();
                 return experience;
             }
         }catch (Exception e){
             /*GestoreEccezioni.getInstance().gestisciEccezione(e);
             System.out.println("Errore nella ricerca dell' utente");*/
             return null;
         }
         return null;
    }
    
	
	 
	 

}
