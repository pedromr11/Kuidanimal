package com.pedro.kuidanimal.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pedro.kuidanimal.dtos.AnuncioDTO;
import com.pedro.kuidanimal.entities.AnuncioEntity;

@Repository
public interface AnuncioRepository extends CrudRepository<AnuncioEntity, Integer>{
	
	@Query(value = "select new com.pedro.kuidanimal.dtos.AnuncioDTO (a.id_anuncio, a.animal, p.nombre, p.id_provincia, a.telefono, a.correo_electronico, a.precio) "
			+ "FROM com.pedro.kuidanimal.entities.AnuncioEntity a, com.pedro.kuidanimal.entities.ProvinciaEntity  p "
			+ "WHERE a.id_provincia = p.id_provincia "
			+ "AND (a.id_anuncio LIKE CONCAT('%',:id_anuncio,'%') or :id_anuncio is null) "
			+ "AND a.animal LIKE CONCAT ('%',:animal,'%') ")
			  List<AnuncioDTO>buscaAnuncioPorIdYAnimal(@Param("id_anuncio") Integer id_anuncio, @Param("animal")String animal);
	
}