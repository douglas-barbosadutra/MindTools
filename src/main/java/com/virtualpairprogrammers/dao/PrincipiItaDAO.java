package com.virtualpairprogrammers.dao;

import java.sql.*;
import java.util.*;

import com.virtualpairprogrammers.model.PrincipiIta;
import com.virtualpairprogrammers.utils.ConnectionSingleton;
import com.virtualpairprogrammers.utils.GestoreEccezioni;

public class PrincipiItaDAO {
	private final String QUERY_SELECT_ALL = "SELECT * FROM principiita";
	private final String QUERY_SELECT_PRINCIPIOITA = "SELECT * FROM principiita WHERE idprincipioita = ?";
	public PrincipiItaDAO() {}
	
	public List<PrincipiIta> getAllPrincipiIta(){
		 
	List<PrincipiIta> principiita = new ArrayList<>();
	Connection connection = ConnectionSingleton.getInstance();
		
		try {
			 Statement statement = connection.createStatement();
	         ResultSet resultSet = statement.executeQuery(QUERY_SELECT_ALL);
	        while (resultSet.next()) {
	        	int idprincipioita = resultSet.getInt("idprincipioita");
	            String nomeprincipio = resultSet.getString("nomeprincipio");
	            String domanda = resultSet.getString("domanda");
	            String percorso = resultSet.getString("percorso");
	            String parolachiave = resultSet.getString("parolachiave");
	            principiita.add(new PrincipiIta(idprincipioita, nomeprincipio,domanda,percorso,parolachiave));
	           }
		}
		catch (SQLException e) {
            e.printStackTrace();
        }
		return principiita;
	}
	
public PrincipiIta getPrincipio(int idprincipio){
		
		PrincipiIta principioita = new PrincipiIta();
		Connection connection = ConnectionSingleton.getInstance();
		
		try {
			 PreparedStatement statement = connection.prepareStatement(QUERY_SELECT_PRINCIPIOITA);
			 statement.setInt(1, idprincipio);
	         ResultSet resultSet = statement.executeQuery();
	         
	        while (resultSet.next()) {
	        	
	        	int idprincipioita = resultSet.getInt("idprincipioita");
	            String nomeprincipio = resultSet.getString("nomeprincipio");
	            String domanda = resultSet.getString("domanda");
	            String percorso = resultSet.getString("percorso");
	            String parolachiave = resultSet.getString("parolachiave");
	            principioita = new PrincipiIta(idprincipioita, nomeprincipio, domanda, percorso, parolachiave);
	           }
		}
		catch (SQLException e) {
            e.printStackTrace();
        }
		return principioita;
	}

}