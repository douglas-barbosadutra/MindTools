package com.pCarpet.dto;

import java.util.List;

import com.pCarpet.model.Principi;
import com.pCarpet.model.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.pCarpet.model.Experience;
import com.pCarpet.model.Imagen;

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
