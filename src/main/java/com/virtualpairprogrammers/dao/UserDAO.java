package com.virtualpairprogrammers.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.virtualpairprogrammers.utils.ConnectionSingleton;
import com.virtualpairprogrammers.utils.GestoreEccezioni;
import com.virtualpairprogrammers.model.User;

public class UserDAO {
	private final String QUERY_ALL = "SELECT * FROM user";
	private final String QUERY_INSERT_USER = "INSERT INTO user (user,password,nome, cognome,email,tipo_user, lingua) VALUES (?,?,?,?,?,?,?)";
	private final String QUERY_DELETE_USER = "DELETE FROM user WHERE iduser = ? ";
	private final String QUERY_UPDATE_USER = "UPDATE user SET user = ?, nome = ? WHERE iduser = ? ";
	
	
	private final String QUERY_LOGIN ="SELECT * FROM user WHERE user = ? and password = ?";
	
	
	public User login(String user , String password) {
		User _user = new User ();
		
		Connection connection = ConnectionSingleton.getInstance();
		
		try {
			PreparedStatement statement = connection.prepareStatement(QUERY_LOGIN);
			statement.setString(1, user);
			statement.setString(2, password);
			ResultSet rs = statement.executeQuery();
			if (rs.next()) {
				int id_user = rs.getInt("iduser");
				String user1 = rs.getString("user");
				String password1 = rs.getString("password");
				String nome = rs.getString("nome");
				String cognome = rs.getString("cognome");
				String email = rs.getString("email");
				String tipouser = rs.getString("tipo_user");
				String lingua = rs.getString("lingua");

				_user = new User(id_user, user1, password1, nome, cognome, email,  tipouser, lingua);
				return _user;

			}
		}
		catch(SQLException e){
            GestoreEccezioni.getInstance().gestisciEccezione(e);
            return _user;
		}
		return _user;	
	}
	
	
	 
	 
	 public boolean Insert(User user){
	        Connection connection = ConnectionSingleton.getInstance();
	        
	        try {
	            
	            PreparedStatement preparedStatement = connection.prepareStatement(QUERY_INSERT_USER);
	            preparedStatement.setString(1,user.getUser());
	            preparedStatement.setString(2,user.getPassword());
	            preparedStatement.setString(3,user.getNome());
	            preparedStatement.setString(4,user.getCognome());
	            preparedStatement.setString(5,user.getEmail());
	            preparedStatement.setString(6,user.getTipoUser());
	            preparedStatement.setString(7,user.getLingua());
	           
	            
	            return preparedStatement.execute();
	            
	            
	            
	            
	        } catch (Exception e) {
	            GestoreEccezioni.getInstance().gestisciEccezione(e);
	            return false;
	        }

	        
	    }
	 
	 
	 
	 
	 
	 public boolean DeleteUser (int iduser) {
		 
	        Connection connection = ConnectionSingleton.getInstance();
	        try {
	            PreparedStatement statement = connection.prepareStatement(QUERY_DELETE_USER);
	            statement.setInt(1, iduser);
	           
	            statement.executeUpdate();
	            return true;
	        }
	        catch (SQLException e) {
	            GestoreEccezioni.getInstance().gestisciEccezione(e);
	            return false;
	            
	        }

	}
	 
	 public void UpdateUser (String user, String nome, int iduser) {
		 
	        Connection connection = ConnectionSingleton.getInstance();
	        try {
	            PreparedStatement statement = connection.prepareStatement(QUERY_UPDATE_USER);
	            statement.setString(1, user);
	            statement.setString(2, nome);
	            statement.setInt(3, iduser);
	            
	            
	            statement.executeUpdate();
	        }
	        catch (SQLException e) {
	            GestoreEccezioni.getInstance().gestisciEccezione(e);
	        }

	}
	 
    public List<User> getAllUser (){
        List<User> users = new ArrayList<>();
        Connection connection = ConnectionSingleton.getInstance();
        try {
           Statement statement = connection.createStatement();
           ResultSet resultSet = statement.executeQuery(QUERY_ALL);
           while (resultSet.next()) {
        	   int iduser = resultSet.getInt("iduser");
               String user = resultSet.getString("user");
               String password = resultSet.getString("password");
               String nome = resultSet.getString("nome");
               String cognome = resultSet.getString("cognome");
               String email = resultSet.getString("email");
               String tipouser = resultSet.getString("tipo_user");
               users.add(new User(iduser, user , password, nome, cognome, email, tipouser));
           }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

}
