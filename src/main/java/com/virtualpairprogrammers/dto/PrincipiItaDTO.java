package com.virtualpairprogrammers.dto;

public class PrincipiItaDTO {
	private int idprincipioita;
	private String nomeprincipio;
	private String domanda;
	private String percorso;
	private String parolachiave;
	
	public PrincipiItaDTO  () {};
	
	public PrincipiItaDTO(int idprincipioita, String nomeprincipio, String domanda, String percorso, String parolachiave) {
		
		this.idprincipioita = idprincipioita;
		this.nomeprincipio = nomeprincipio;
		this.domanda = domanda;
		this.percorso = percorso;
		this.parolachiave = parolachiave;
	}

	@Override
	public String toString() {
		return "PrincipiItaDTO [idprincipioita=" + idprincipioita + ", nomeprincipio=" + nomeprincipio + ", domanda="
				+ domanda + ", percorso=" + percorso + ", parolachiave=" + parolachiave + "]";
	}

	public int getIdprincipioita() {
		return idprincipioita;
	}

	public void setIdprincipioita(int idprincipioita) {
		this.idprincipioita = idprincipioita;
	}

	public String getNomeprincipio() {
		return nomeprincipio;
	}

	public void setNomeprincipio(String nomeprincipio) {
		this.nomeprincipio = nomeprincipio;
	}

	public String getDomanda() {
		return domanda;
	}

	public void setDomanda(String domanda) {
		this.domanda = domanda;
	}

	public String getPercorso() {
		return percorso;
	}

	public void setPercorso(String percorso) {
		this.percorso = percorso;
	}

	public String getParolachiave() {
		return parolachiave;
	}

	public void setParolachiave(String parolachiave) {
		this.parolachiave = parolachiave;
	}
	
}