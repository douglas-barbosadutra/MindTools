package com.virtualpairprogrammers.model;


public class Experience {
	private int id_experience;
	private int id_user;
	private String commento;
	private String positivo;
	private String negativo;
	private int score;

	public Experience(int id_experience, String commento, String positivo,String negativo, int score, User user ) {
		this.id_experience = id_experience;
		this.id_user = user.getIduser();
		this.commento = commento;
		this.commento = commento;
		this.positivo = positivo;
		this.negativo = negativo;
		this.score= score;
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

	
}
