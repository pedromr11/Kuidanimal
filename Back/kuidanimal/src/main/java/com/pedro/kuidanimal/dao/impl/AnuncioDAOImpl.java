package com.pedro.kuidanimal.dao.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedro.kuidanimal.dao.AnuncioDAO;
import com.pedro.kuidanimal.dtos.AnuncioDTO;
import com.pedro.kuidanimal.entities.AnuncioEntity;
import com.pedro.kuidanimal.repositorios.AnuncioRepository;

@Service
public class AnuncioDAOImpl implements AnuncioDAO {
	
	@Autowired
	private AnuncioRepository anuncioRepository;

	@Override
	public List<AnuncioDTO> obtenerAnuncioPorAnimalEId(Integer id_anuncio, String animal) {
		return anuncioRepository.buscaAnuncioPorIdYAnimal(id_anuncio, animal);
	}

	@Override
	public Integer insertarAnuncio(Integer id_anuncio, String animal, Integer id_provincia, Integer telefono, String correo_electronico, double precio) {
		
		AnuncioEntity anuncio = new AnuncioEntity(id_anuncio, animal, id_provincia, telefono, correo_electronico, precio);		
		anuncioRepository.save(anuncio);
		
		return 1;  
	}

	@Override
	public Integer actualizarAnuncio(Integer id_anuncio, String animal, Integer id_provincia, Integer telefono, String correo_electronico, double precio) {
	
		
		AnuncioEntity anuncio = new AnuncioEntity(id_anuncio, animal, id_provincia, telefono, correo_electronico, precio);	
		anuncioRepository.save(anuncio);
		
		return 1;
	}

	@Override
	public Integer eliminarAnuncio(Integer id_anuncio) {
		anuncioRepository.deleteById(id_anuncio);
		return 1;
	}

	
}