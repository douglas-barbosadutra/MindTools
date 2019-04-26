package it.contrader.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class User {

	@Id
	@Column(name = "idUser")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUser;
	
	@Column(name = "username")
	@NotNull
	private String username;

	@Column(name = "password")
	@NotNull
	private String password;

	
	@Column(name = "nome")
	@NotNull
	private String nome;

	
	@Column(name = "cognome")
	@NotNull
	private String cognome;
	
	@NotNull
	@Column(name = "email")
	private String email;
	
	
	@Column(name = "lingua")
	@NotNull
	private String lingua;
	
	
	@Column(name = "rank")
	@NotNull
	private Integer rank;
	
	
	

}
