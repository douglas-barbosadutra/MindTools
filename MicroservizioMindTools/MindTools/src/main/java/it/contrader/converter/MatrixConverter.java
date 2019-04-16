package it.contrader.converter;

import it.contrader.dto.MatrixDTO;
import it.contrader.model.Matrix;
import java.util.ArrayList;
import java.util.List;

public class MatrixConverter {
	
	public static MatrixDTO toDTO(Matrix m) {
		MatrixDTO matrixDTO = null;
		if(m != null) {
			matrixDTO = new MatrixDTO();
			matrixDTO.setId(m.getId());
			matrixDTO.setP1(m.getP1());
			matrixDTO.setP2(m.getP2());
			matrixDTO.setP3(m.getP3());
			matrixDTO.setP4(m.getP4());
			matrixDTO.setP5(m.getP5());
			matrixDTO.setP6(m.getP6());
			matrixDTO.setP7(m.getP7());
			matrixDTO.setP9(m.getP9());
			matrixDTO.setP10(m.getP10());
			matrixDTO.setP11(m.getP11());
			matrixDTO.setP12(m.getP12());
			matrixDTO.setP13(m.getP13());
			matrixDTO.setP13(m.getP14());
			matrixDTO.setP14(m.getP15());
			matrixDTO.setP16(m.getP16());
			matrixDTO.setP17(m.getP17());
			matrixDTO.setP18(m.getP18());
			matrixDTO.setP19(m.getP19());
			matrixDTO.setP20(m.getP20());
			matrixDTO.setP21(m.getP21());
			matrixDTO.setP22(m.getP22());
			matrixDTO.setP23(m.getP23());
			matrixDTO.setP24(m.getP24());
			matrixDTO.setP25(m.getP25());
			matrixDTO.setP26(m.getP26());
			matrixDTO.setP27(m.getP27());
			matrixDTO.setP28(m.getP28());
			matrixDTO.setP29(m.getP29());
			matrixDTO.setP30(m.getP30());
			matrixDTO.setP31(m.getP31());
			matrixDTO.setP32(m.getP32());
			matrixDTO.setP33(m.getP33());
			matrixDTO.setP34(m.getP34());
			matrixDTO.setP35(m.getP35());
			matrixDTO.setP36(m.getP36());
			matrixDTO.setP37(m.getP37());
			matrixDTO.setP38(m.getP38());
			matrixDTO.setP39(m.getP39());
			matrixDTO.setNome(m.getNome());
			
		}
		
		return matrixDTO;
	}
	
	public static List<MatrixDTO> toListDTO(List<Matrix> list)
	{
		List<MatrixDTO> matrixDTO = new ArrayList<>();
		if(!list.isEmpty()) {
			for (Matrix m : list) {
				matrixDTO.add(MatrixConverter.toDTO(m));
			}
		}
		
		return matrixDTO;
	}
	
	
	public static Matrix toEntity(MatrixDTO m) {
		Matrix matrix = new Matrix();
		matrix.setId(m.getId());
		matrix.setP1(m.getP1());
		matrix.setP2(m.getP2());
		matrix.setP3(m.getP3());
		matrix.setP4(m.getP4());
		matrix.setP5(m.getP5());
		matrix.setP6(m.getP6());
		matrix.setP7(m.getP7());
		matrix.setP9(m.getP9());
		matrix.setP10(m.getP10());
		matrix.setP11(m.getP11());
		matrix.setP12(m.getP12());
		matrix.setP13(m.getP13());
		matrix.setP13(m.getP14());
		matrix.setP14(m.getP15());
		matrix.setP16(m.getP16());
		matrix.setP17(m.getP17());
		matrix.setP18(m.getP18());
		matrix.setP19(m.getP19());
		matrix.setP20(m.getP20());
		matrix.setP21(m.getP21());
		matrix.setP22(m.getP22());
		matrix.setP23(m.getP23());
		matrix.setP24(m.getP24());
		matrix.setP25(m.getP25());
		matrix.setP26(m.getP26());
		matrix.setP27(m.getP27());
		matrix.setP28(m.getP28());
		matrix.setP29(m.getP29());
		matrix.setP30(m.getP30());
		matrix.setP31(m.getP31());
		matrix.setP32(m.getP32());
		matrix.setP33(m.getP33());
		matrix.setP34(m.getP34());
		matrix.setP35(m.getP35());
		matrix.setP36(m.getP36());
		matrix.setP37(m.getP37());
		matrix.setP38(m.getP38());
		matrix.setP39(m.getP39());
		matrix.setNome(m.getNome());
		
		return matrix;
		
	}

}
