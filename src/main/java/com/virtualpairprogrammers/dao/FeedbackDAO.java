package com.virtualpairprogrammers.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.fabric.xmlrpc.base.Array;
import com.virtualpairprogrammers.model.Experience;
import com.virtualpairprogrammers.model.Feedback;
import com.virtualpairprogrammers.utils.ConnectionSingleton;
import com.virtualpairprogrammers.utils.GestoreEccezioni;

public class FeedbackDAO {

	/**
	 * Qui possiamo se vogliamo dichiarare delle stringhe rappresentanti le query
	 * che verranno utilizzate dai service, Non è obbligatorio ma è consigliato
	 * usare un ordine e dei nomi significativi per tutte le query. Con GET_ALL
	 * intendiamo recuperare tutte le tuple dal db. Se volessimo creare una query
	 * per l'inserimento, un nome identificativo potrebbe essere INSERT_ESEMPIO
	 */
	private final String GET_ALL = "select * from feedback";
	private final String QUERY_INSERT = "INSERT INTO feedback ( id_experience, id_principi, secondario) values (?,?,?)";
	
	/**
	 * Il suddetto metodo si occupa interagire con il database e restituire tutte le
	 * tuple al servizio che ha chiamato questo metodo
	 */

	/*
	public Users login(String username, String password) {

		Connection connection = ConnectionSingleton.getInstance();
		Users utente = null;
		try {
			PreparedStatement statement = connection.prepareStatement(QUERY_LOGIN);
			statement.setString(1, username);
			statement.setString(2, password);
			statement.execute();
			ResultSet resultSet = statement.getResultSet();

			while (resultSet.next()) {
				String name = resultSet.getString("username");
				String pass = resultSet.getString("password");
				Integer id = resultSet.getInt("id");
				String ruolo = resultSet.getString("ruolo");
				utente = new Users(id, name, pass, ruolo);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return utente;
	}
	*/

	public List<Feedback> getAllFeedback() {

		final List<Feedback> feedback = new ArrayList<>();
		final Connection connection = ConnectionSingleton.getInstance();

		try {
			final Statement statement = connection.createStatement();
			final ResultSet resultSet = statement.executeQuery(GET_ALL);
			while (resultSet.next()) {
				final Integer id = resultSet.getInt("id");
				final Integer id_experience = resultSet.getInt("id_experience");
				final Integer id_principi = resultSet.getInt("id_principi") ;
				final boolean secondario = resultSet.getBoolean("secondario");

				feedback.add(new Feedback(id, id_experience, id_principi, secondario));
			}
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return feedback;
	}
	
	 public boolean insertFeedback(Feedback feedback) {
	        Connection connection = ConnectionSingleton.getInstance();
	        try {
	            PreparedStatement statement = connection.prepareStatement(QUERY_INSERT);
	            statement.setInt(1,  feedback.getId_experience());
	            statement.setInt(2,  feedback.getId_principi());
	            statement.setInt(3, feedback.getSecondario());
	            return statement.execute();
	        }
	        catch (SQLException e) {
	           /* ((Object) GestoreEccezioni.getInstance()).gestisciEccezione(e);*/
	        	return false;
	        }
	    }

	
}
