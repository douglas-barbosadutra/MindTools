package main.dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




import main.ConnectionSingleton;
import main.model.Principi;




public class ShowRandomPrincipiDAO {
	
	
	private final String QUERY_RANDOM = "SELECT * FROM principi ORDER BY RAND() LIMIT 1";
	public ShowRandomPrincipiDAO() {}
	
	public Principi getPrincipoRandom(){
		
		Principi principi =null;
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
	           principi = new Principi(idprincipi,nome,descrizione,d_punti,d_numeri,p_chiave);
	           }
		}
		catch (SQLException e) {
            //e.printStackTrace();
			System.out.println("Errore durante la fase random");
        }
		return principi;
	}
	
}
