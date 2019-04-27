package it.contrader.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TokenDTO {
	
	private String jwt;
	private int server;
}
