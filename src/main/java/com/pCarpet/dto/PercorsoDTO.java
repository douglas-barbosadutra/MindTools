package com.pCarpet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PercorsoDTO {
	
	private Integer idPercorso;
	private String nome;
	private Integer idExperience;
	private Integer idPrincipi;
}
