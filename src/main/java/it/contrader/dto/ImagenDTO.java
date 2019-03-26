package com.pCarpet.dto;

import com.mysql.jdbc.Blob;
import com.pCarpet.model.User;

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
