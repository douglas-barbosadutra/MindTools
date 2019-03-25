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
public class Grafo {
	@Id
	@Column(name = "idGrafo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idGrafo;
	
	
	@NotNull
	@ManyToOne
	@JoinColumn(name="idNodop")
	private NodoP nodoP;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name="idNodof")
	private NodoF nodoF;

}
