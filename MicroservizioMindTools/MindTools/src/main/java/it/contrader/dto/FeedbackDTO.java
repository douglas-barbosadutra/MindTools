package it.contrader.dto;

import it.contrader.model.Experience;
import it.contrader.model.Feedback;
import it.contrader.model.Imagen;
import it.contrader.model.Principi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class FeedbackDTO {

	private Integer idFeedback;
	private Experience experience;
	private Principi principi;
	private Integer secondario;
	private Imagen imagen;
	}