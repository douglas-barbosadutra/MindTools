package main.dao;

import main.ConnectionSingleton;
import main.controller.GestoreEccezioni;
import main.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LoginDAO {

    private final String QUERY_LOGIN = "select * from user where user = ? and password = ?";

    public User login (String username, String password) {

    	User _user = new User();//null;
    	//User users = new ArrayList<>();
        Connection connection = ConnectionSingleton.getInstance();
        try {
            PreparedStatement statement = connection.prepareStatement(QUERY_LOGIN);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet rs = statement.executeQuery();
            if(rs.next()) {
            	  String user = rs.getString("user");
            	  String password1 = rs.getString("password");
            	  String nome = rs.getString("nome");
            	  String cognome = rs.getString("cognome");
            	  String email = rs.getString("email");
            	  String tipouser= rs.getString("tipouser");
             	 
            	  _user = new User(0,user,password1,nome,cognome,email,tipouser);
            	  
            	 
            	  return _user;
           
            }else {
            	return null;
            }


            
        }
        catch (SQLException e) {
            GestoreEccezioni.getInstance().gestisciEccezione(e);
            return null;
        }
    }
}
