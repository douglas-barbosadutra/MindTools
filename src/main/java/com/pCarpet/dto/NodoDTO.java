package com.pCarpet.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class NodoDTO {
	
	private int id;
	private String nome;
	private int idFather;
	private int idPercorso;
	public List<NodoDTO> nodoChildrenDTO;
}
