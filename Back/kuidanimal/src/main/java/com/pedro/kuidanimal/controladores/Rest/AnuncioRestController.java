package com.pedro.kuidanimal.controladores.Rest;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.pedro.kuidanimal.entities.AnuncioEntity;
import com.pedro.kuidanimal.entities.ProvinciaEntity;
import com.pedro.kuidanimal.repositorios.AnuncioRepository;
import com.pedro.kuidanimal.repositorios.ProvinciaRepository;

@RestController
@RequestMapping("/v1")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class AnuncioRestController {
	
	@Autowired
	private AnuncioRepository anuncioRepository;
	
	@Autowired
	private ProvinciaRepository provinciaRepository;
	

	
	//Insertar anuncios
		
	@PostMapping(value = "/anuncios")
	public ResponseEntity <String> insertarAnuncio(@RequestBody AnuncioEntity anuncio){
		
		
		anuncioRepository.save(anuncio);
		
		return new ResponseEntity<>("Inserción correcta!", HttpStatus.OK);	
		
	}
	
	//Obtener todos los anuncios
	
	@GetMapping(value = "/anuncios")
	public Iterable<AnuncioEntity> listarTodosAnuncios() {
		return anuncioRepository.findAll();
	}
	
	
	//Obtener todas las provincias
	
	@GetMapping(value = "/provincias")
	public Iterable<ProvinciaEntity> listarTodasProvincias() {
		return provinciaRepository.findAll();
	}
	
	
	//Actualizar anuncio
	
	@PutMapping(value = "/anuncios/{id_anuncio}")
	public ResponseEntity<String> actulizarAnuncio(@RequestBody AnuncioEntity anuncio){
		
		anuncioRepository.save(anuncio);
		return new ResponseEntity<>("Actualizacion correcta!", HttpStatus.OK);
	}
	
	//Borrar anuncio
	
	@DeleteMapping(value = "/anuncios/{id_anuncio}")
	public ResponseEntity<String> MostrarFormularioBorrarAnuncios(@PathVariable("id_anuncio") Integer id_anuncio){
		
		anuncioRepository.deleteById(id_anuncio);
		return new ResponseEntity<>("Borrado correctamente!", HttpStatus.OK);
	}
	
	
	
}