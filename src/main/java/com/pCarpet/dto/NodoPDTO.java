package com.pCarpet.dto;

import com.pCarpet.model.Feedback;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NodoPDTO {
	private Integer idnodop;
	private String nome;
	private String descrizione;
	private Feedback feedback;

}
