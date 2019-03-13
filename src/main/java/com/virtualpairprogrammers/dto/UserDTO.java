package com.virtualpairprogrammers.dto;


/**
 * Il DTO (Data transfer object) è un ponte che ci permette di nascondere le
 * informazioni principali del nostro model
 * 
 */


public class UserDTO {

	private Integer iduser;
	private String user;
	private String password;
	private String nome;
	private String cognome;
	private String tipouser;
	private String email;
	private String lingua;
	
	
	public UserDTO(Integer iduser, String user, String password, String nome,String cognome, String tipouser, String lingua) {
		super();
		this.iduser = iduser;
		this.user = user;
		this.password = password;
		this.nome = nome;
		this.cognome = cognome;
		this.tipouser = tipouser;
		this.lingua = lingua;
		
	}
	public String getLingua() {
		return lingua;
	}
	public void setLingua(String lingua) {
		this.lingua = lingua;
	}
	public UserDTO( String user, String password, String nome,String cognome, String email, String tipouser, String lingua) {
		super();
		this.iduser = iduser;
		this.user = user;
		this.password = password;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.tipouser = tipouser;
		this.lingua = lingua;
	}
	
	
	public UserDTO()
	{
		
	}

	public Integer getIduser() {
		return iduser;
	}

	public void setIduser(Integer iduser) {
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

	public String getTipouser() {
		return tipouser;
	}

	public void setTipoUser(String tipouser) {
		this.tipouser = tipouser;
	}

	
	
	@Override
	public String toString() {
		return "UserDTO [iduser=" + iduser + ", user=" + user + ", password=" + password + ", nome=" + nome
				+ ", cognome=" + cognome + ", tipouser=" + tipouser + ", email=" + email + ", lingua=" + lingua + "]";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setTipouser(String tipouser) {
		this.tipouser = tipouser;
	}
	
	
	
	
	
}





