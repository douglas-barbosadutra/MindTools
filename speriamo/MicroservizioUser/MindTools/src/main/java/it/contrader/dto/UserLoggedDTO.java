package it.contrader.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class UserLoggedDTO {
	
	private String jwt;
	private int rank;
	
}
