package com.pCarpet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FeedbackDTO {

	private Integer idFeedback;
	private Integer idExperience;
	private Integer idPrincipi;
	private Integer secondario;
}