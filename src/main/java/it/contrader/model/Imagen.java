package it.contrader.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

//import com.mysql.jdbc.Blob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Imagen {
	@Id
	@Column(name = "idImagen")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idImagen;
	
	
	@Column(name = "nomeimg")
	@NotNull
	private String nome;
	
	
	@Column(name = "archivo")
	@Lob
	@NotNull
	private byte[] archivo;
	
	@OneToOne(mappedBy = "imagen")
	@OnDelete(action=OnDeleteAction.CASCADE)
    private Experience experience;
	
	  

}
