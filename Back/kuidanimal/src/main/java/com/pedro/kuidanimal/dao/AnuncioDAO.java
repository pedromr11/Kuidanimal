package com.pedro.kuidanimal.dao;

import java.util.List;

import com.pedro.kuidanimal.dtos.AnuncioDTO;

public interface AnuncioDAO {
	List<AnuncioDTO> obtenerAnuncioPorAnimalEId(Integer id_anuncio, String animal);
	Integer insertarAnuncio(Integer id_anuncio, String animal, Integer id_provincia, Integer telefono, String correo_electronico, double precio);
	Integer actualizarAnuncio(Integer id_anuncio, String animal, Integer id_provincia, Integer telefono, String correo_electronico, double precio);
	Integer eliminarAnuncio(Integer id_anuncio);
}