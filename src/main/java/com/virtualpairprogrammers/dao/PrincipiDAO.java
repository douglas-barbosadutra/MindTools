package com.virtualpairprogrammers.dao;

import java.sql.*;
import java.util.*;

import com.virtualpairprogrammers.model.Principi;
import com.virtualpairprogrammers.utils.ConnectionSingleton;
import com.virtualpairprogrammers.utils.GestoreEccezioni;

public class PrincipiDAO {
	private final static String QUERY_SELECT_ALL = "SELECT * FROM principi";
	private final String QUERY_SELECT_PRINCIPIO = "SELECT * FROM principi WHERE id_principi = ?";
	private final String QUERY_SELECT_BY_P_CHIAVE = "SELECT* FROM principi  where p_chiave like ?";
	private final String QUERY_SELECT_CASUAL = " SELECT* FROM principi  where id_principi = ? ";
	
	
	public static List<Principi> getAllPrincipi(){
		List<Principi> principi = new ArrayList<>();
		Connection connection = ConnectionSingleton.getInstance();
		try {
			 Statement statement = connection.createStatement();
	         ResultSet resultSet = statement.executeQuery(QUERY_SELECT_ALL);
	        while (resultSet.next()) {
	        	int id = resultSet.getInt("id_principi");
	            String nome = resultSet.getString("nome");
	            String d_punti = resultSet.getString("d_punti");
	            String d_numeri = resultSet.getString("d_numeri");
	            String p_chiave = resultSet.getString("p_chiave");
	            String nomeita =resultSet.getString("nomeita");
	            String d_puntiIta = resultSet.getString("d_puntiIta");
	            String d_numeriIta = resultSet.getString("d_numeriIta");
	            String p_chiaveIta =resultSet.getString("p_chiaveIta");
	            principi.add(new Principi(id,nome, d_punti,d_numeri, p_chiave, nomeita,d_puntiIta,d_numeriIta,p_chiaveIta));
	           }
		}
		catch (SQLException e) {
            e.printStackTrace();
        }
		return principi;
		
	}
		
		
	
	public List<Principi> getAllPrincipiByNome(String testo){
		
		List<Principi> principi = new ArrayList<>();
		Connection connection = ConnectionSingleton.getInstance();
		try {
			 Statement statement = connection.createStatement();
		      ResultSet resultSet = statement.executeQuery(QUERY_SELECT_ALL + " where  p_chiave LIKE '%"+testo+"%' OR p_chiaveIta LIKE '%"+testo+"%'");
	        while (resultSet.next()) {
	        	int id = resultSet.getInt("id_principi");
	            String nome = resultSet.getString("nome");
	           
	            String d_punti = resultSet.getString("d_punti");
	            String d_numeri = resultSet.getString("d_numeri");
	            String p_chiave = resultSet.getString("p_chiave");
	            String nomeita =resultSet.getString("nomeita");
	            String d_puntiIta = resultSet.getString("d_puntiIta");
	            String d_numeriIta = resultSet.getString("d_numeriIta");
	            String p_chiaveIta =resultSet.getString("p_chiaveIta");
	            principi.add(new Principi(id,nome, d_punti,d_numeri, p_chiave, nomeita,d_puntiIta,d_numeriIta,p_chiaveIta));
	           }
		}
		catch (SQLException e) {
            e.printStackTrace();
        }
		return principi;
	}
	
public List<Principi> getPrincipi(int id_principi){
		
		Principi principi = new Principi();
		Connection connection = ConnectionSingleton.getInstance();
		
		try {
			 PreparedStatement statement = connection.prepareStatement(QUERY_SELECT_PRINCIPIO);
			 statement.setInt(1, id_principi);
	         ResultSet resultSet = statement.executeQuery();
	         
	        while (resultSet.next()) {
	        	
	        	int id = resultSet.getInt("id_principi");
	            String nome = resultSet.getString("nome");
	            String d_punti = resultSet.getString("d_punti");
	            String d_numeri = resultSet.getString("d_numeri");
	            String p_chiave = resultSet.getString("p_chiave");
	            String nomeita =resultSet.getString("nomeita");
	            String d_puntiIta = resultSet.getString("d_puntiIta");
	            String d_numeriIta = resultSet.getString("d_numeriIta");
	            String p_chiaveIta =resultSet.getString("p_chiaveIta");
	            
	            principi=new Principi(id_principi,nome, d_punti,d_numeri, p_chiave, nomeita,d_puntiIta,d_numeriIta,p_chiaveIta);
	           }
		}
		catch (SQLException e) {
            e.printStackTrace();
        }
		return (List<Principi>) principi;
	}
	public List<Principi> getByP_Chiave(String parola){

		List<Principi> principi = new ArrayList<>();
		Connection connection = ConnectionSingleton.getInstance();
		try {
			 PreparedStatement statement = connection.prepareStatement(QUERY_SELECT_BY_P_CHIAVE);
			 String srt = "%";
			 String cadena = srt.concat(parola);
			 cadena = cadena.concat("%");
	         statement.setString(1, cadena);
	         ResultSet rs = statement.executeQuery();
	         while(rs.next()){
	        	 int id = rs.getInt("id_principi");
	        	 String nome = rs.getString("nome");
	        	
	        	 String d_punti = rs.getString("d_punti");
	        	 String d_numeri = rs.getString("d_numeri");
	        	 String p_chiave = rs.getString("p_chiave");
	        	 String nomeita =rs.getString("nomeita");
		         String d_puntiIta = rs.getString("d_puntiIta");
		         String d_numeriIta = rs.getString("d_numeriIta");
		         String p_chiaveIta =rs.getString("p_chiaveIta");
		            
		            principi.add(new Principi(id,nome, d_punti,d_numeri, p_chiave, nomeita,d_puntiIta,d_numeriIta,p_chiaveIta));
	          }
	         
		}
       
         catch (SQLException e) {
            GestoreEccezioni.getInstance().gestisciEccezione(e);
        }
      return principi;
	 }
	public Principi ShowPrincipiCasual(int casual){
		Principi principi = new Principi();
		Connection connection = ConnectionSingleton.getInstance();
		try {
			PreparedStatement statement = connection.prepareStatement(QUERY_SELECT_CASUAL);
			statement.setInt(1, casual);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id_principi");
	        	 String nome = rs.getString("nome");
	        	
	        	 String d_punti = rs.getString("d_punti");
	        	 String d_numeri = rs.getString("d_numeri");
	        	 String p_chiave = rs.getString("p_chiave");
	        	 String nomeita =rs.getString("nomeita");
		         String d_puntiIta = rs.getString("d_puntiIta");
		         String d_numeriIta = rs.getString("d_numeriIta");
		         String p_chiaveIta =rs.getString("p_chiaveIta");
		            principi=new Principi(id,nome, d_punti,d_numeri, p_chiave, nomeita,d_puntiIta,d_numeriIta,p_chiaveIta);
			}
		}
		catch (SQLException e) {
            GestoreEccezioni.getInstance().gestisciEccezione(e);
        }
		return principi;
		
	}

}
