package it.contrader.dto;

//import com.mysql.jdbc.Blob;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImagenDTO {
	private Integer idImagen;
	private byte[] archivo;
	private String nome;

}