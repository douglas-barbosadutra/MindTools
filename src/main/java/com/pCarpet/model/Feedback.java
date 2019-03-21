package com.pCarpet.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.springframework.lang.Nullable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity


public class Feedback {
	@Id
	@Column(name = "idFeedback")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idFeedback;
	
	@Column(name = "secondario")
	@NotNull
	private Integer secondario;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name="idPrincipi")
	private Principi principi;
	
	
	@NotNull
	@ManyToOne
	@JoinColumn(name="idExperience")
	private Experience experience;


	

}
