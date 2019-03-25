package com.pCarpet.dto;

import com.pCarpet.model.Experience;
import com.pCarpet.model.Feedback;
import com.pCarpet.model.Principi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NodoFDTO {
	private Integer idnodof;
	private String nome;
	private String descrizione;
	private Feedback feedback;

}
