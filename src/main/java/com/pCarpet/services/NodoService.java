package com.pCarpet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pCarpet.converter.NodoConverter;
import com.pCarpet.converter.PercorsoConverter;
import com.pCarpet.dao.NodoDAO;
import com.pCarpet.dto.NodoDTO;
import com.pCarpet.dto.PercorsoDTO;
import com.pCarpet.model.Nodo;


@Service
public class NodoService {
	
	private NodoDAO nodoDAO;
	
	@Autowired
	public NodoService(NodoDAO nodoDAO) {
		this.nodoDAO = nodoDAO;
	}
	
	public NodoDTO getItemById(int id) {
		return (NodoConverter.convertToDto(nodoDAO.findNodoById(id)));
	}
	
	public ItemDTO insertItem(ItemDTO itemDTO) {
		Item item = ItemConverter.convertToEntity(itemDTO);
		if(itemDTO.getIdFather() != 0)
			itemDAO.insertItem(itemDTO.getName(), itemDTO.getIdFather(), itemDTO.getIdWBS());
		else
			itemDAO.insertItem(itemDTO.getName(), null, itemDTO.getIdWBS());
		return ItemConverter.convertToDto(item); 
	}
	
	public boolean deleteItem(int id) {
		itemDAO.deleteItem(id);
		return true;
	}
	
	public ItemDTO getItemByWBS(WBSDTO wbs){
		List<ItemDTO> list = (ItemConverter.toListDTO(itemDAO.findAllByWbs(WBSConverter.convertToEntity(wbs))));
		for(ItemDTO item: list) {
			if(item.getIdFather() == 0)
				return item;
		}
		return null;
	}
	
	public List<ItemDTO> getAllItem(){
		return ItemConverter.toListDTO(itemDAO.findAll());
	}
	
	public boolean insertInput(int idItem, int idTask) {
		itemDAO.insertInput(idItem, idTask);
		return true;
	}
}

