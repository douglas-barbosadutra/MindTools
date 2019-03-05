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
import main.model.Principi;
import main.model.User;

public class UserDAO {
	private final String QUERY_ALL = "select * from principi";
	private final String QUERY_RANDOM = "SELECT * FROM principi ORDER BY RAND() LIMIT 1";
	private final String QUERY_SEARCH="select * from principi where p_chiave=?";
	
	
	public UserDAO() {}
	
	 
	 public List<Principi> getAllPrincipi() {
        List<Principi> principis = new ArrayList<>();
        Connection connection = ConnectionSingleton.getInstance();
        
        try {
           Statement statement = connection.createStatement();
           ResultSet resultSet = statement.executeQuery(QUERY_ALL);
           
           while (resultSet.next()) {
        	   
        	   int idprincipi = resultSet.getInt("id_principi");
        	   String nome = resultSet.getString("nome");
        	   String descrizione = resultSet.getString("descrizione");
        	   String d_punti = resultSet.getString("d_punti");
        	   String d_numeri = resultSet.getString("d_numeri");
        	   String p_chiave = resultSet.getString("p_chiave");
        	   
        	   principis.add(new Principi(idprincipi,nome,descrizione, d_punti,d_numeri, p_chiave));

           }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return principis;
    }
	 
	 public List<Principi> searchPrincipi(String p_chiave) {
			Connection connection=ConnectionSingleton.getInstance();
			 List<Principi> principis = new ArrayList<>();
			Principi principi = new Principi();
			try {
				PreparedStatement preparedStatement=connection.prepareStatement(QUERY_SEARCH);
				preparedStatement.setString(1, p_chiave);
				ResultSet resultSet=preparedStatement.executeQuery();
				
				if(resultSet.next()) {
					int idprincipi = resultSet.getInt("id_principi");
		        	   String nome = resultSet.getString("nome");
		        	   String descrizione = resultSet.getString("descrizione");
		        	   String d_punti = resultSet.getString("d_punti");
		        	   String d_numeri = resultSet.getString("d_numeri");
		        	   
		        	   principi=new Principi(idprincipi,nome,descrizione,d_punti,d_numeri, p_chiave);
			              
		        	   principis.add(principi);
		        	   
		        	   principi.setParole_chiave(p_chiave);
		        	  
				}
			} catch (SQLException e) {
				GestoreEccezioni.getInstance().gestisciEccezione(e);
			}
			return principis;
		}
	 
	 public Principi getPrincipiRandom () {
		 
	        Principi principi = new Principi();
	        Connection connection = ConnectionSingleton.getInstance();
	        
	        try {
	           Statement statement = connection.createStatement();
	           ResultSet resultSet = statement.executeQuery(QUERY_RANDOM);
	           
	           while (resultSet.next()) {
	        	   
	        	   int idprincipi = resultSet.getInt("idprincipi");
	        	   String nome = resultSet.getString("nome");
	        	   String descrizione = resultSet.getString("descrizione");
	        	   String d_punti = resultSet.getString("d_punti");
	        	   String d_numeri = resultSet.getString("d_numeri");
	        	   String p_chiave = resultSet.getString("p_chiave");
	        	   
	               
	        	   principi=new Principi(idprincipi,nome,descrizione,d_punti,d_numeri, p_chiave);	           }
	        }
	        catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return principi;
	    }
}
