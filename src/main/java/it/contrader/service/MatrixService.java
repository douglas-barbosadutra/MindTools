package it.contrader.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.contrader.dto.MatrixDTO;
import it.contrader.converter.MatrixConverter;
import it.contrader.dao.MatrixRepository;
import it.contrader.model.Matrix;

@Service
public class MatrixService {
	private MatrixRepository matrixRepository;
	
	@Autowired
	public MatrixService(MatrixRepository matrixRepository) {
		this.matrixRepository = matrixRepository;
	}
	
	public List<MatrixDTO> getMatrix()
	{
		return MatrixConverter.toListDTO((List<Matrix>) matrixRepository.findAll());
	}
	
	
	
	
}


