package com.virtualpairprogrammers.dto;

import com.virtualpairprogrammers.model.Experience;
import com.virtualpairprogrammers.model.Principi;

public class FeedbackDTO 
{
	private int id_feedback;
	private int id_experience;
	private int id_principi;
	//private boolean secondario;
	private Experience experience;
	private Principi principi;
	
	public FeedbackDTO () {}		

	public FeedbackDTO (int id_feedback,int id_experience, int id_principi, boolean secondario ) {
		this.id_feedback = id_feedback;
		this.id_experience = experience.getId_experience();
		this.id_principi = principi.getId_principio();
        //secondario = false;	
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

	public Experience getExperience() {
		return experience;
	}

	public void setExperience(Experience experience) {
		this.experience = experience;
	}

	public Principi getPrincipi() {
		return principi;
	}

	public void setPrincipi(Principi principi) {
		this.principi = principi;
	}
	
    public boolean equals (int secondario) {
    	
    	//this.secondario = secondario;
        if (secondario == 1) return true;
        else
        	return false;
    }
	
}