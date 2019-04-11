package it.contrader.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
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
public class Principi {

	@Id
	@Column(name = "idPrincipi")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPrincipi;

	@Column(name = "nome")
	@NotNull
	private String nome;

	@Column(name = "dPunti")
	@NotNull
	private String dPunti;

	@Column(name = "dNumeri")
	@NotNull
	private String dNumeri;

	@Column(name = "pChiave")
	@NotNull
	private String pChiave;
	
	@Column(name = "fronte")
	@Lob
	@NotNull
	private byte[] fronte;
	
	@Column(name = "retro")
	@Lob
	@NotNull
	private byte[] retro;
	
	
	@OneToMany(mappedBy="principi")
	@OnDelete(action=OnDeleteAction.CASCADE)
	private List<Feedback> feedback;

}

