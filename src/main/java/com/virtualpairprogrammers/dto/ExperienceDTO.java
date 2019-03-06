package com.virtualpairprogrammers.dto;

import com.virtualpairprogrammers.model.Principi;
import com.virtualpairprogrammers.model.User;

public class ExperienceDTO {
	private int id_experience;
	private int id_user;
	private String commento;
	private String positivo;
	private String negativo;
	private int score;
	private User user;
	private Principi principio;
	
	public ExperienceDTO( int id_experience, int id_user, String commento, String positivo, String negativo, int score) {
		this.id_experience = id_experience;
		this.id_user = id_user;
		this.commento = commento;
		this.positivo = positivo;
		this.negativo = negativo;
		this.score = score;
		
	}

	public int getId_experience() {
		return id_experience;
	}

	public void setId_experience(int id_experience) {
		this.id_experience = id_experience;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public String getCommento() {
		return commento;
	}

	public void setCommento(String commento) {
		this.commento = commento;
	}

	public String getPositivo() {
		return positivo;
	}

	public void setPositivo(String positivo) {
		this.positivo = positivo;
	}

	public String getNegativo() {
		return negativo;
	}

	public void setNegativo(String negativo) {
		this.negativo = negativo;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public String toString() {
		return commento + "+" + positivo + "-" + negativo  + "Punteggio" + score;
	}

}
