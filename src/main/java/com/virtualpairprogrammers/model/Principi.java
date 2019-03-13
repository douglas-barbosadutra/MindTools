package com.virtualpairprogrammers.model;

public class Principi {
	private int id_principi;
	private String nome;
	private String d_punti;
	private String d_numeri;
	private String p_chiave;
	private String nomeita;
	private String d_puntiIta;
	private String d_numeriIta;
	private String p_chiaveIta;
	
	
	public Principi() {}
	
	public Principi(int id_principi, String nome,  String d_punti, String d_numeri,
			String p_chiave, String nomeita, String d_puntiIta, String d_numeriIta, String p_chiaveIta) {
		this.id_principi = id_principi;
		this.nome = nome;
		this.d_punti = d_punti;
		this.d_numeri = d_numeri;
		this.p_chiave=p_chiave;
		this.nomeita = nomeita;
		this.d_puntiIta = d_puntiIta;
		this.d_numeriIta = d_numeriIta;
		this.p_chiaveIta=p_chiaveIta;
	}
	

	


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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


	public int getId_principi() {
		return id_principi;
	}

	public void setId_principi(int id_principi) {
		this.id_principi = id_principi;
	}

	public String getP_chiave() {
		return p_chiave;
	}

	public void setP_chiave(String p_chiave) {
		this.p_chiave = p_chiave;
	}

	public String getNomeita() {
		return nomeita;
	}

	public void setNomeita(String nomeita) {
		this.nomeita = nomeita;
	}

	public String getD_puntiIta() {
		return d_puntiIta;
	}

	public void setD_puntiIta(String d_puntiIta) {
		this.d_puntiIta = d_puntiIta;
	}

	public String getD_numeriIta() {
		return d_numeriIta;
	}

	public void setD_numeriIta(String d_numeriIta) {
		this.d_numeriIta = d_numeriIta;
	}

	public String getP_chiaveIta() {
		return p_chiaveIta;
	}

	public void setP_chiaveIta(String p_chiaveIta) {
		this.p_chiaveIta = p_chiaveIta;
	}

	@Override
	public String toString() {
		return "Principi [id_principi=" + id_principi + ", nome=" + nome + ", d_punti=" + d_punti + ", d_numeri="
				+ d_numeri + ", p_chiave=" + p_chiave + ", nomeita=" + nomeita + ", d_puntiIta=" + d_puntiIta
				+ ", d_numeriIta=" + d_numeriIta + ", p_chiaveIta=" + p_chiaveIta + "]";
	}

	
	


}
