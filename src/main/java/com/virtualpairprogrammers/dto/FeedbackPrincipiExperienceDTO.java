package com.virtualpairprogrammers.dto;

import com.virtualpairprogrammers.model.Experience;
import com.virtualpairprogrammers.model.Principi;
import java.util.ArrayList;

public class FeedbackPrincipiExperienceDTO {

	private int id_experience;
	private int id_principi;
	private int secondario;

	public FeedbackPrincipiExperienceDTO() {}
	
	public FeedbackPrincipiExperienceDTO(int id_experience, int id_principi, int secondario ) {	
	super();
	this.id_experience = id_experience;
	this.id_principi = id_principi;
	this.secondario = secondario;	
}
	public int getSecondario() {
		return secondario;
	}

	public void setSecondario(int secondario) {
		
		this.secondario = secondario;
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

    public boolean equals (int secondario) {
    	
    	//this.secondario = secondario;
        if (secondario == 1) return true;
        else
        	return false;
    }
}
