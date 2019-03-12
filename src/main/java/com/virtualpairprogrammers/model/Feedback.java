package com.virtualpairprogrammers.model;

public class Feedback {
	private int id_feedback;
	private int id_experience;
	private int id_principi;
	private int secondario;

	public Feedback(int id_feedback, int id_experience, int id_principi, int secondario) {
		this.id_feedback = id_feedback;
		this.id_experience = id_experience;
		this.id_principi = id_principi;
		this.secondario = secondario;

	}
	public Feedback() {}

	
	public int getSecondario() {
		return secondario;
	}

	public void setSecondario(int secondario) {
		this.secondario = secondario;
	}

	public int getId_feedback() {
		return id_feedback;
	}

	public void setId_feedback(int id_feedback) {
		this.id_feedback = id_feedback;
	}

	public int getId_experience() {
		return id_experience;
	}

	public void setId_experience(int id_experience) {
		this.id_experience = id_experience;
	}

	public int getId_principi() {
		return id_principi;
	}

	public void setId_principi(int id_principi) {
		this.id_principi = id_principi;
	}

	public boolean equals(int secondario) {

		// this.secondario = secondario;
		if (secondario == 1)
			return true;
		else
			return false;
	}

	/*
	 * public String toString() {
	 * 
	 * return "Feedback: " + id_feedback + "\nExperience: " + id_experience +
	 * "\nPrincipi: " + id_principi + "; }
	 */

}