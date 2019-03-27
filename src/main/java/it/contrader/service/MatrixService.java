package it.contrader.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.contrader.dao.MatrixRepository;

@Service
public class MatrixService {
	private MatrixRepository matrixRepository;
	
	@Autowired
	public MatrixService(MatrixRepository matrixRepository) {
		this.matrixRepository = matrixRepository;
	}
}
