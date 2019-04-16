package it.contrader.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PrincipiDTO {

	private Integer idPrincipi;
	private String nome;
	private String dPunti;
	private String dNumeri;
	private String pChiave;
	private byte[] fronte;
	private byte[] retro;
}