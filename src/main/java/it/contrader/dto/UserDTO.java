package it.contrader.dto;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

	
	private int userId;

	private String userPass;

	private String userType;

	private String userUser;
	
}
