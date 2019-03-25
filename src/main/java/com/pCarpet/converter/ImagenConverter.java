package com.pCarpet.converter;

import com.pCarpet.dto.ImagenDTO;
import com.pCarpet.model.Imagen;

public class ImagenConverter {
	public static ImagenDTO toDTO(Imagen imagen) {
		ImagenDTO imagenDTO = null;
		if (imagen != null) {
			imagenDTO.setIdImagen(imagen.getIdImagen());
			imagenDTO.setNome(imagen.getNome());
			imagenDTO.setArchivo(imagen.getArchivo());
		}
		return imagenDTO;
	}
	
	public static Imagen toEntity(ImagenDTO imagenDTO) {
		Imagen imagen = null;
		if (imagenDTO != null) {
			imagen = new Imagen();
			imagen.setIdImagen(imagenDTO.getIdImagen());
			imagen.setNome(imagenDTO.getNome());
			imagen.setArchivo(imagenDTO.getArchivo());
		}
		return imagen;
	}

}
