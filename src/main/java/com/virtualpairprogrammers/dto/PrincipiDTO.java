package com.virtualpairprogrammers.dto;

public class PrincipiDTO {
	private int id_principi;
	private String nome;
	private String descrizione;
	private String d_punti;
	private String d_numeri;
	private String p_chiave;
	
	public PrincipiDTO(int id_principi, String nome, String descrizione, String d_punti, String d_numeri,
			String p_chiave) {
		
		this.id_principi = id_principi;
		this.nome = nome;
		this.descrizione = descrizione;
		this.d_punti = d_punti;
		this.d_numeri = d_numeri;
		this.p_chiave = p_chiave;
	}

	public PrincipiDTO() {

	}

	public int getId_principi() {
		return id_principi;
	}

	public void setId_principi(int id_principi) {
		this.id_principi = id_principi;
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

	public String getP_chiave() {
		return p_chiave;
	}

	public void setP_chiave(String p_chiave) {
		this.p_chiave = p_chiave;
	}

}
