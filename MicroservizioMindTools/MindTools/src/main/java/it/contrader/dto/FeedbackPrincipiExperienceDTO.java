package it.contrader.dto;

import it.contrader.model.Experience;

import it.contrader.model.Principi;
//import it.contrader.model.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FeedbackPrincipiExperienceDTO {

	private int id_experience;
	private int id_principi;
	private String nome_principioITA;
	private String nome_principiING;
	private int secondario;
	
	List<PrincipiDTO> secondari;
	
	public List<PrincipiDTO> getSecondari() {
		return secondari;
	}

	public void setSecondari(List<PrincipiDTO> secondari) {
		this.secondari = secondari;
	}

	public int getSecondario() {
		return secondario;
	}

	public void setSecondario(int secondario) {
		
		this.secondario = secondario;
	}


	public String getNome_principioITA() {
		return nome_principioITA;
	}

	public void setNome_principioITA(String nome_principioITA) {
		this.nome_principioITA = nome_principioITA;
	}

	public String getNome_principiING() {
		return nome_principiING;
	}

	public void setNome_principiING(String nome_principiING) {
		this.nome_principiING = nome_principiING;
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
