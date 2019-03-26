package it.contrader.dto;

import java.util.List;

import it.contrader.model.Principi;
import it.contrader.model.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import it.contrader.model.Experience;
import it.contrader.model.Imagen;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ExperienceUserFeedbackDTO {
	private String commento;
	private String nome;
	private String cognome;
	private int score;
	private Principi principi;
	private Experience experience;
	private Imagen imagen;
	
	
	
}
