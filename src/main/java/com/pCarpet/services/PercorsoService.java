package com.pCarpet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pCarpet.converter.PercorsoConverter;
import com.pCarpet.converter.PrincipiConverter;
import com.pCarpet.converter.ExperienceConverter;
import com.pCarpet.dao.PercorsoDAO;
import com.pCarpet.dto.PercorsoDTO;
import com.pCarpet.dto.ExperienceDTO;
import com.pCarpet.dto.PrincipiDTO;
import com.pCarpet.model.Percorso;

@Service
public class PercorsoService {
	
	private PercorsoDAO percorsoDao;
	private ItemService itemService;
	
	@Autowired
	public WBSService(WBSDAO wbsDao, ItemService itemService) {
		this.wbsDao = wbsDao;
		this.itemService = itemService;
	}
	
	public boolean deleteWBS(int id) {
		wbsDao.deleteById(id);
		return true;
	}
	
	public WBSDTO insertWBS(WBSDTO wbsDTO) {
		WBS wbs = WBSConverter.convertToEntity(wbsDTO);
		wbs = wbsDao.save(wbs);
		wbsDao.flush();
		ItemDTO item = new ItemDTO();
		item.setIdWBS(wbs.getId());
		item.setName(wbs.getName());
		itemService.insertItem(item);
		return WBSConverter.convertToDto(wbs);
	}
	
	public List<WBSDTO> showWBS(int idUser){
		UserDTO user = new UserDTO();
		user.setId(idUser);
		List<WBS> wbs = wbsDao.findAllByUser(UserConverter.toEntity(user));
		return WBSConverter.toListDTO(wbs);
	}

}

