package com.pCarpet.model;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.lang.Nullable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity


public class Experience {
	@Id
	@Column(name = "idExperience")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idExperience;
	
	@ManyToOne
	@JoinColumn(name="idUser")
	private User user;
	
	@Column(name = "commento")
	private String commento;
	
	@Column(name = "positivo")
	private String positivo;
	
	@Column(name = "negativo")
	private String negativo;
	
	@Column(name = "score")
	@NotNull
	private Integer score;
	
	@OneToMany(mappedBy="experience")
	@OnDelete(action=OnDeleteAction.CASCADE)
	private List<Feedback> feedback;
	
	
	
	



}
