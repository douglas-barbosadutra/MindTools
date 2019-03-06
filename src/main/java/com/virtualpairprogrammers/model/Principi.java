package com.virtualpairprogrammers.model;

public class Principi {
	private int id_principi;
	private String nome;
	private String descrizione;
	private String d_punti;
	private String d_numeri;
	private String p_chiave;
	
	public Principi() {}
	
	public Principi(int id_principio, String nome, String descrizione, String d_punti, String d_numeri, String parole_chiave ) {
		this.id_principi = id_principio;
		this.nome = nome;
		this.descrizione = descrizione;
		this.d_punti = d_punti;
		this.d_numeri = d_numeri;
		this.p_chiave=parole_chiave;
		
	}
	
	public Principi (int id_principio, String nome, String descrizione) {
		this.id_principi = id_principio;
		this.nome = nome;
		this.descrizione = descrizione;
	}
	

	public int getId_principio() {
		return id_principi;
	}

	public void setId_principio(int id_principio) {
		this.id_principi = id_principio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getD_punti() {
		return d_punti;
	}

	public void setD_punti(String d_punti) {
		this.d_punti = d_punti;
	}

	public String getD_numeri() {
		return d_numeri;
	}

	public void setD_numeri(String d_numeri) {
		this.d_numeri = d_numeri;
	}

	public String getParole_chiave() {
		return p_chiave;
	}

	public void setParole_chiave(String parole_chiave) {
		this.p_chiave = parole_chiave;
	}
	@Override
	public String toString() {
		return   id_principi+ ": "  + nome  ;
	}
	


}
