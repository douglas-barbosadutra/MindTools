package com.pCarpet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity


public class Percorso {
	@Id
	@Column(name = "idPercorso")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPercorso;
	
	@Column(name = "nome")
	@NotNull
	private String nome;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name="idPrincipi")
	private Principi principi;
	
	
	@NotNull
	@ManyToOne
	@JoinColumn(name="idExperience")
	private Experience experience;


	

}
