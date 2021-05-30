package com.pedro.kuidanimal.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pedro.kuidanimal.dtos.ComboDTO;
import com.pedro.kuidanimal.entities.ProvinciaEntity;

@Repository
public interface ProvinciaRepository extends CrudRepository<ProvinciaEntity, Integer>{
	
	@Query(value = "select new com.pedro.kuidanimal.dtos.ComboDTO (p.id_provincia, p.nombre) "
			+ "FROM com.pedro.kuidanimal.entities.ProvinciaEntity  p "
			+ "WHERE (p.id_provincia LIKE CONCAT('%',:id_provincia,'%') or :id_provincia is null) "
			+ "AND p.nombre LIKE CONCAT ('%',:nombre,'%') ")
			  List<ComboDTO>buscaProvinciaPorIdNombre(@Param("id_provincia") Integer id_provincia, @Param("nombre")String nombre);
}