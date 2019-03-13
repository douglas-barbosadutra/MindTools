package com.virtualpairprogrammers.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.fabric.xmlrpc.base.Array;
import com.virtualpairprogrammers.model.User;
import com.virtualpairprogrammers.service.UsersService;
import com.virtualpairprogrammers.dto.ExperienceDTO;
import com.virtualpairprogrammers.dto.UserDTO;
import com.virtualpairprogrammers.model.Experience;
import com.virtualpairprogrammers.utils.ConnectionSingleton;
import com.virtualpairprogrammers.utils.GestoreEccezioni;

public class ExperienceDAO {

	private final String QUERY_ALL_EXPERIENCE = "select * from experience";
	private final String QUERY_INSERT = "INSERT INTO experience ( id_user, commento, positivo, negativo, score) values (?,?,?,?,?)";
	private final String QUERY_GET_EXPERIENCE = "SELECT * FROM experience WHERE id_experience = ?";
	private final String QUERY_SELECT_ULTIMO_ID = "SELECT *  from experience WHERE id_user = ? ";

	public ExperienceDAO() {
	}

	
	public List<Experience> allExperiences() {
		List<Experience> experiences = new ArrayList();
		Experience e;
		Connection connection = ConnectionSingleton.getInstance();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(QUERY_ALL_EXPERIENCE);
			while (resultSet.next()) {
				int id_experience = resultSet.getInt("id_experience");
				int id_user = resultSet.getInt("id_user");
				String positivo = resultSet.getString("positivo");
				String negativo = resultSet.getString("negativo");
				String commento = resultSet.getString("commento");
				int score = resultSet.getInt("score");
				e = new Experience(id_experience, id_user, commento, positivo, negativo, score);
				experiences.add(e);
			}
		} catch (SQLException o) {
			o.printStackTrace();
		}
		return experiences;
	}

	public boolean insertExperience(Experience experience) {
		Connection connection = ConnectionSingleton.getInstance();
		try {
			PreparedStatement statement = connection.prepareStatement(QUERY_INSERT);
			statement.setInt(1, experience.getId_user());
			statement.setString(2, experience.getCommento());
			statement.setString(3, experience.getPositivo());
			statement.setString(4, experience.getNegativo());
			statement.setInt(5, experience.getScore());
			return statement.execute();
		} catch (SQLException e) {
			/* ((Object) GestoreEccezioni.getInstance()).gestisciEccezione(e); */
			return false;
		}
	}

	public Experience getExperience(int id_experience) {
		Connection connection = ConnectionSingleton.getInstance();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_GET_EXPERIENCE);
			preparedStatement.setInt(1, id_experience);
			ResultSet resultSet = preparedStatement.executeQuery();
			Experience experience = new Experience();
			if (resultSet.next()) {
				experience.setId_experience(resultSet.getInt("id_experience"));
				experience.setId_user(resultSet.getInt("id_user"));
				experience.setCommento(resultSet.getString("commento"));
				experience.setPositivo(resultSet.getString("positivo"));
				experience.setNegativo(resultSet.getString("negativo"));
				experience.setScore(resultSet.getInt("score"));
				preparedStatement.close();
				return experience;
			}
		} catch (Exception e) {
			/*
			 * GestoreEccezioni.getInstance().gestisciEccezione(e);
			 * System.out.println("Errore nella ricerca dell' utente");
			 */
			return null;
		}
		return null;
	}

	public List<Experience> getAllExperiencesByUser(int userId) {
		Connection connection = ConnectionSingleton.getInstance();
		List<Experience> experiences = new ArrayList<Experience>();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_SELECT_ULTIMO_ID);
			preparedStatement.setInt(1, userId);
			ResultSet resultSet = preparedStatement.executeQuery();
			Experience experience = new Experience();
			while (resultSet.next()) {
				experience.setId_experience(resultSet.getInt("id_experience"));
				experience.setId_user(resultSet.getInt("id_user"));
				experience.setCommento(resultSet.getString("commento"));
				experience.setPositivo(resultSet.getString("positivo"));
				experience.setNegativo(resultSet.getString("negativo"));
				experience.setScore(resultSet.getInt("score"));
				experiences.add(experience);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(experiences);
		return experiences;

	}

}
