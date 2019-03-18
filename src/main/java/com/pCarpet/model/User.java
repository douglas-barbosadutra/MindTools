package com.pCarpet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.springframework.lang.Nullable;

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

	@Column(name = "user")
	@NotNull
	private String user;

	@Column(name = "password")
	@NotNull
	private String password;

	@NotNull
	@Column(name = "nome")
	private String nome;

	@NotNull
	@Column(name = "cognome")
	private String cognome;
	
	@NotNull
	@Column(name = "email")
	private String email;
	
	@NotNull
	@Column(name = "lingua")
	private String lingua;
	
	

}
