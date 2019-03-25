package com.pCarpet.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class NodoP {
	@Id
	@Column(name = "idNodop")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idnodop;
	
	@Column(name = "nome")
	@NotNull
	private String nome;
	
	@Column(name = "descrizione")
	@NotNull
	private String descrizione;
	
	@OneToOne
	@JoinColumn(name = "idFeedback")
    private Feedback feedback;
	
	@OneToMany(mappedBy="nodoP")
	@OnDelete(action=OnDeleteAction.CASCADE)
	private List<Grafo> grafo;


}

