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
import com.virtualpairprogrammers.model.User;
import com.virtualpairprogrammers.utils.ConnectionSingleton;
import com.virtualpairprogrammers.utils.GestoreEccezioni;

public class FeedbackDAO<Id_experience> {

	/**
	 * Qui possiamo se vogliamo dichiarare delle stringhe rappresentanti le query
	 * che verranno utilizzate dai service, Non è obbligatorio ma è consigliato
	 * usare un ordine e dei nomi significativi per tutte le query. Con GET_ALL
	 * intendiamo recuperare tutte le tuple dal db. Se volessimo creare una query
	 * per l'inserimento, un nome identificativo potrebbe essere INSERT_ESEMPIO
	 */
	private final String GET_ALL = "select * from feedback";
	private final String QUERY_INSERT = "INSERT INTO feedback ( id_experience, id_principi, secondario) values (?,?,?)";
	private final String QUERY_SELECT_ID = "SELECT *  from feedback WHERE id_experience = ?  ";	
	/**
	 * Il suddetto metodo si occupa interagire con il database e restituire tutte le
	 * tuple al servizio che ha chiamato questo metodo
	 */

	

	public List<Feedback> getAllFeedback() {

		final List<Feedback> feedback = new ArrayList<>();
		final Connection connection = ConnectionSingleton.getInstance();

		try {
			final Statement statement = connection.createStatement();
			final ResultSet resultSet = statement.executeQuery(GET_ALL);
			while (resultSet.next()) {
				final Integer id_feedback = resultSet.getInt("id_feedback");
				final Integer id_experience = resultSet.getInt("id_experience");
				final Integer id_principi = resultSet.getInt("id_principi") ;
				final Integer secondario = resultSet.getInt("secondario");

				feedback.add(new Feedback(id_feedback, id_experience, id_principi, secondario));
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
	
	 public Feedback getFeedbackByIdExperience(int id_experience) {
    	
    	 Connection connection = ConnectionSingleton.getInstance();
    	 try {
    		 PreparedStatement statement = connection.prepareStatement(QUERY_SELECT_ID);
			statement.setInt(1,id_experience );
    		 ResultSet resultSet = statement.executeQuery();
    		 Feedback f = new Feedback();
 			while (resultSet.next()) {
				f.setId_feedback(resultSet.getInt("id_feedback"));
				f.setId_experience(resultSet.getInt("id_experience"));
				f.setSecondario(resultSet.getInt("secondario"));
				f.setId_principi(resultSet.getInt("id_principi"));
				
				statement.close();
                return f;
			}
		} catch (final SQLException e) {
			e.printStackTrace();
			return null;
		}
		return null;
     }
	
}
