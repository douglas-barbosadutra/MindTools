package it.contrader.dto;

import java.util.List;

import it.contrader.model.Principi;
//import it.contrader.model.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import it.contrader.model.Experience;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExperienceDTOAggiornato {
	private int idExperience;
	private int idPrincipio;
	private String nomeUtente;
	private String commentoExperience;
	private int scoreExperience;
	private byte[] archivo;

}
