/*package com.pCarpet.model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
@Table(name="Problema")

public class Problema {

	@Id
	@Column(name = "id_problema")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProblema;
	
	@ManyToOne
	@JoinColumn(name="id_feedback")
	private Feedback feedback;
	
	@ManyToOne
	@JoinColumn(name="id_scheduling")
	@OnDelete(action=OnDeleteAction.CASCADE)
	private Scheduling scheduling;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "task_scheduled_relations",
	joinColumns=@JoinColumn(name = "fatherId"),
	inverseJoinColumns=@JoinColumn(name = "childId"))
	@OnDelete(action=OnDeleteAction.CASCADE)
	private List<TaskScheduled> childsList=new ArrayList<>();
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "task_scheduled_relations",
	joinColumns=@JoinColumn(name = "childId"),
	inverseJoinColumns=@JoinColumn(name = "fatherId"))
	@OnDelete(action=OnDeleteAction.CASCADE)
	private List<TaskScheduled> fatherList=new ArrayList<>();
	
	@Nullable
	@ManyToOne
	@JoinColumn(name="id_item")
	private Item output;
	
	@ManyToMany
	@JoinTable(name="inputs",
		joinColumns={@JoinColumn(name="id_item")},
		inverseJoinColumns= {@JoinColumn(name="id_task")})
	private List<Item> inputs;
}*/