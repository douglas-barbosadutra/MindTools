package com.virtualpairprogrammers.model;

public class User {
	
	private int iduser;
	private String user, password, nome, cognome, email, tipouser, lingua;
	
	public User () {
		
	}
	public User( int iduser,String user, String password, String nome, String cognome, String email, String lingua, String tipouser) 
	{	
		this.iduser = iduser;
		this.user = user;
		this.password = password;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.lingua = lingua;
		this.tipouser = tipouser;
	}
	

	public String getLingua() {
		return lingua;
	}
	public void setLingua(String lingua) {
		this.lingua = lingua;
	}
	public User(int iduser, String user, String password, String nome, String cognome, String email, String tipouser) {
	
		this.iduser = iduser;
		this.user = user;
		this.password = password;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.tipouser = tipouser;
		
	}
	public User( String user, String password, String nome, String cognome, String email, String tipouser) {
		
		
		this.user = user;
		this.password = password;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.tipouser = tipouser;
		
	}
	public User(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		
	}
	
	
	
	
	/* public User(int iduser, String user, String password, String nome, String cognome, String email) {
		
		this.iduser = iduser;
		this.user = user;
		this.password = password;
		this.nome = nome;
		this.cognome = cognome;
	this.email = email;
		
		
	} */

	public int getIduser() {
		return iduser;
	}

	public void setIduser(int iduser) {
		this.iduser = iduser;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTipoUser() {
		return tipouser;
	}

	public void setTipoUser(String tipouser) {
		this.tipouser = tipouser;
	}
	@Override
	public String toString() {
		return "User [iduser=" + iduser + ", user=" + user + ", password=" + password + ", nome=" + nome + ", cognome="
				+ cognome + ", email=" + email + ", tipouser=" + tipouser + ", lingua=" + lingua + "]";
	}

	
	
	}
	

	
