package com.pCarpet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrincipiDTO {

	private Integer idPrincipi;
	private String nome;
	private String dPunti;
	private String dPumeri;
	private String pChiave;
	private String nomeIta;
	private String dPuntiIta;
	private String dNumeriIta;
	private String pChiaveIta;
}