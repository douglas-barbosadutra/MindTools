package it.contrader.converter;

import it.contrader.dto.MatrixDTO;
import it.contrader.model.Matrix;

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
			
		}
		
		return matrixDTO;
	}

}
