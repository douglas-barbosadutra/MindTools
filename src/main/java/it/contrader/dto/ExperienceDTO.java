package it.contrader.dto;

import it.contrader.model.Imagen;
import it.contrader.model.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExperienceDTO {
	private int idExperience;
	private User user;
	private String commento;
	private String positivo;
	private String negativo;
	private int score;
	private Imagen imagen;

}
