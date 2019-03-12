package com.virtualpairprogrammers.dto;

import java.util.List;

import com.virtualpairprogrammers.model.Principi;
import com.virtualpairprogrammers.model.User;

public class ExperienceUserFeedbackDTO {
	private String commento;
	private String nome;
	private String cognome;
	private int score;
	private int id_principi;
	
	public ExperienceUserFeedbackDTO() {
		
	}
	
	public ExperienceUserFeedbackDTO(String commento, String nome, String cognome, int score, int id_principi) {
		super();
		this.commento = commento;
		this.nome = nome;
		this.cognome = cognome;
		this.score = score;
		this.id_principi = id_principi;
	}
	
	public String getCommento() {
		return commento;
	}
	public void setCommento(String commento) {
		this.commento = commento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getId_principi() {
		return id_principi;
	}
	public void setId_principi(int id_principi) {
		this.id_principi = id_principi;
	}

	 
}
