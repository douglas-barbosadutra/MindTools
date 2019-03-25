package com.pCarpet.dto;

import com.pCarpet.model.Feedback;
import com.pCarpet.model.NodoF;
import com.pCarpet.model.NodoP;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GrafoDTO {
	private Integer idGrafo;
	private NodoP nodoP;
	private NodoF nodoF;

}
