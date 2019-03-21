package com.pCarpet.dto;

import com.pCarpet.model.Experience;
import com.pCarpet.model.Feedback;
import com.pCarpet.model.Principi;

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
	private Feedback secondario;
	}