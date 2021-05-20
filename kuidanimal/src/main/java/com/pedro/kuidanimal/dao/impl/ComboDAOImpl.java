package com.pedro.kuidanimal.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedro.kuidanimal.dao.ComboDAO;
import com.pedro.kuidanimal.dtos.ComboDTO;
import com.pedro.kuidanimal.entities.ProvinciaEntity;
import com.pedro.kuidanimal.repositorios.ProvinciaRepository;



@Service
public class ComboDAOImpl implements ComboDAO {
	
	@Autowired
	private ProvinciaRepository provinciaRepository;
	
	

	@Override
	public List<ComboDTO> comboProvincias() {
		Iterable<ProvinciaEntity> listaEntidadesProvincias = provinciaRepository.findAll();
		List<ComboDTO> listaProvincias = mapeoEntidadProvinciaComboDTO(listaEntidadesProvincias);
		return listaProvincias;
	}


	//Métodos para recoger solo los campos que nos interesan de cada entidad
	private List<ComboDTO> mapeoEntidadProvinciaComboDTO(Iterable<ProvinciaEntity> lista){
		List<ComboDTO> listaProvincias = new ArrayList<ComboDTO>();
		
		for (ProvinciaEntity p : lista) {
			listaProvincias.add(new ComboDTO(p.getId_provincia(), p.getNombre()));
		}
		
		return listaProvincias;
	}
	
}