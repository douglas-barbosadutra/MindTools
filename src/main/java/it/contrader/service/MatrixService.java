package it.contrader.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.contrader.dto.MatrixDTO;
import it.contrader.dto.PrincipiDTO;
import it.contrader.converter.MatrixConverter;
import it.contrader.dao.MatrixRepository;
import it.contrader.model.Matrix;

@Service
public class MatrixService {
	private MatrixRepository matrixRepository;
	private PrincipiService principiService;
	
	@Autowired
	public MatrixService(MatrixRepository matrixRepository) {
		this.matrixRepository = matrixRepository;
	}
	
	public List<MatrixDTO> getMatrix()
	{
		return MatrixConverter.toListDTO((List<Matrix>) matrixRepository.findAll());
	}
	public List<PrincipiDTO> principiByParametri(String idmatrix, int parametro){
		List<PrincipiDTO> lista = new ArrayList();
		String p = matrixRepository.contradizione(idmatrix, parametro);
		if (p!= null && p!= "+") {
			String[] prin = p.split(".");
			for (String pri : prin) {
				lista.add(principiService.getPrincipio(Integer.parseInt(pri)));
			}
		}
		
		return lista;
	
	}
	
	
	
	
}


