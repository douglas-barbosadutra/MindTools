package it.contrader.dto;

import java.util.List;


//import it.contrader.model.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExperienceDTO {
	private int idExperience;
	//private User user;
	private int idPrincipi;
	private String commento;
	private String positivo;
	private String negativo;
	private int score;
	private List<String> secon;
	private byte[] imagen;

}
