package com.pCarpet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrincipiDTO {

	private Integer id_principi;
	private String nome;
	private String d_punti;
	private String d_numeri;
	private String p_chiave;
	private String nomeita;
	private String d_puntiIta;
	private String d_numeriIta;
	private String p_chiaveIta;
}