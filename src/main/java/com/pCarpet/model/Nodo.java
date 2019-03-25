package com.pCarpet.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.lang.Nullable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="nodo")
@ToString

public class Nodo {
	
	@Id
	@Column(name = "id_nodo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nome")
	private String nome;
	
	@ManyToOne
	@JoinColumn(name="id_percorso")
	private Percorso percorso;
	
	/*@OneToMany(mappedBy="output")
	@OnDelete(action=OnDeleteAction.CASCADE)
	private List<Manufacturing> manufacturings;*/
	
	@Nullable
	@ManyToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name="id_father")
	private Nodo father;
	
	@OneToMany(mappedBy="father")
	@OnDelete(action=OnDeleteAction.CASCADE)
	private List<Nodo> childsList=new ArrayList<>();
	
	/*@OneToMany(mappedBy="output")
	@OnDelete(action=OnDeleteAction.CASCADE)
	private List<TaskScheduled> listTaskScheduled;*/
	
}
