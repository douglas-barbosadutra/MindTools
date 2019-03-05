package main.dao;
import main.ConnectionSingleton;
import main.controller.GestoreEccezioni;

import main.model.Principi;
import java.sql.*;
import java.util.*;

public class PrincipiDAO {
	private final String QUERY_SELECT = "SELECT * FROM principi";
	private final String QUERY_SELECT_BY_P_CHIAVE = "SELECT* FROM principi  where p_chiave like ?";
	private final String QUERY_SELECT_CASUAL = " SELECT* FROM principi  where id_principi = ? ";
	public PrincipiDAO() {}
	
	public List<Principi> getAllPrincipi(){
		List<Principi> principi = new ArrayList<>();
		Connection connection = ConnectionSingleton.getInstance();
		try {
			 Statement statement = connection.createStatement();
	         ResultSet resultSet = statement.executeQuery(QUERY_SELECT);
	        while (resultSet.next()) {
	        	int id = resultSet.getInt("id_principi");
	            String nome = resultSet.getString("nome");
	            String descrizione = resultSet.getString("descrizione");
	            String d_punti = resultSet.getString("d_punti");
	            String d_numeri = resultSet.getString("d_numeri");
	            String p_chiave = resultSet.getString("p_chiave");
	            principi.add(new Principi(id,nome,descrizione, d_punti,d_numeri, p_chiave));
	           }
		}
		catch (SQLException e) {
            e.printStackTrace();
        }
		return principi;
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
	        	 String descrizione = rs.getString("descrizione");
	        	 String d_punti = rs.getString("d_punti");
	        	 String d_numeri = rs.getString("d_numeri");
	        	 String p_chiave = rs.getString("p_chiave");
	        	 principi.add(new Principi(id,nome,descrizione,d_punti,d_numeri,p_chiave));
	          }
	         
		}
       
         catch (SQLException e) {
            GestoreEccezioni.getInstance().gestisciEccezione(e);
        }
      return principi;
	 }
	public Principi ShowPrincipiCasual(int casual){
		Principi p = new Principi();
		Connection connection = ConnectionSingleton.getInstance();
		try {
			PreparedStatement statement = connection.prepareStatement(QUERY_SELECT_CASUAL);
			statement.setInt(1, casual);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id_principi");
	        	 String nome = rs.getString("nome");
	        	 String descrizione = rs.getString("descrizione");
	        	 String d_punti = rs.getString("d_punti");
	        	 String d_numeri = rs.getString("d_numeri");
	        	 String p_chiave = rs.getString("p_chiave");
	        	 p = new Principi(id,nome,descrizione,d_punti,d_numeri,p_chiave);
			}
		}
		catch (SQLException e) {
            GestoreEccezioni.getInstance().gestisciEccezione(e);
        }
		return p;
		
	}

}
