package main.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import main.ConnectionSingleton;
import main.controller.GestoreEccezioni;
import main.model.User;

public class AdminDAO{

	private final String QUERY_ALL = "SELECT * FROM user";
	private final String QUERY_INSERT_USER = "INSERT INTO user (user,password,nome, cognome,email) VALUES (?,?,?,?,?)";
	private final String QUERY_DELETE_USER = "DELETE FROM user WHERE iduser = ? ";
	private final String QUERY_UPDATE_USER = "UPDATE user SET user = ?, nome = ? WHERE iduser = ? ";
	
	
	 public boolean InsertUser (User users) {
		 
        Connection connection = ConnectionSingleton.getInstance();
        try {
            PreparedStatement statement = connection.prepareStatement(QUERY_INSERT_USER);
            statement.setString(1, users.getUser());
            statement.setString(2, users.getPassword());
            statement.setString(3, users.getNome());
            statement.setString(4, users.getCognome());
            statement.setString(5, users.getEmail());         
            statement.execute();
            return true;
            
        }
        catch (SQLException e) {
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
               String tipouser = resultSet.getString("tipouser");
               
               
               users.add(new User(iduser, user , password, nome, cognome, email, tipouser));
           }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }
}
