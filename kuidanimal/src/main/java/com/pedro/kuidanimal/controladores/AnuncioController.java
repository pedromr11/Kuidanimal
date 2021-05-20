package com.pedro.kuidanimal.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pedro.kuidanimal.dao.AnuncioDAO;
import com.pedro.kuidanimal.dao.ComboDAO;

@Controller
public class AnuncioController {
	
	@Autowired
	private ComboDAO combo;
	
	@Autowired
	private AnuncioDAO anuncioImpl;
	
	//private static final Logger logger = LoggerFactory.getILoggerFactory(AlumnoController.class);
	

//Insertar anuncios	
	@GetMapping(value = "insertaranuncio")
	public String formularioInsertarAnuncio(ModelMap model) {
		model.addAttribute("listaProvincias", combo.comboProvincias());
		
		return "vistas/insertarAnuncios";		
	}
	
	@PostMapping(value = "insertaranuncio")
	public String InsertarAlumno(
			@RequestParam(value = "id_anuncio", required = false) Integer id_anuncio, 
			@RequestParam(value = "animal") String animal,
			@RequestParam(value = "id_provincia") Integer id_provincia,
			@RequestParam(value = "telefono", required = false) Integer telefono,
			@RequestParam(value = "correo_electronico", required = false) String correo_electronico,
			@RequestParam(value = "precio", required = false) double precio,
			ModelMap model){
		
		
		model.addAttribute("resultado", anuncioImpl.insertarAnuncio(id_anuncio, animal, id_provincia, telefono, correo_electronico, precio));
		model.addAttribute("listaProvincias", combo.comboProvincias());
		
		return "vistas/insertarAnuncios";	
		
	}
	
	//Listado anuncios
	@GetMapping(value = "listadoanuncios")
	public String FormularioListadoAnuncios(ModelMap model) {
		return "vistas/listadoAnuncios";
	}
	
	
	@PostMapping(value = "listadoanuncios")
	public String listarAnuncios(
			@RequestParam(value = "id_anuncio", required = false) Integer id_anuncio, 
			@RequestParam("animal") String animal, 
			ModelMap model) {
		
		
		model.addAttribute("lista", anuncioImpl.obtenerAnuncioPorAnimalEId(id_anuncio, animal));
		return "vistas/listadoAnuncios";
	}
	
	//Borrar anuncios
	@GetMapping(value = "formularioeliminaranuncio")
	public String MostrarFormularioBorrarAnuncios() {
		return "vistas/eliminarAnuncios";
	}
	
	@PostMapping(value = "formularioeliminaranuncio")
	public String FormularioBorrarAnuncio(
			@RequestParam(value = "id_anuncio", required = false) Integer id_anuncio, 
			@RequestParam("animal") String animal, 
			ModelMap model) {
		
		model.addAttribute("lista", anuncioImpl.obtenerAnuncioPorAnimalEId(id_anuncio, animal));
		return "vistas/eliminarAnuncios";
	}
	
	@PostMapping(value = "eliminaranuncio")
	public String BorrarAnuncio(
			@RequestParam(value = "id_anuncio") Integer id_anuncio,
			ModelMap modelMap) {
		
		modelMap.addAttribute("resultado", anuncioImpl.eliminarAnuncio(id_anuncio));
		return "vistas/eliminarAnuncios";
	}
	
	
	//Actualizar anuncios
	@GetMapping(value = "formularioactualizaranuncio")
	public String FormularioActualizarAnuncio() {
		
		return "vistas/actualizarAnuncios";
	}
	
	@PostMapping(value = "formularioactualizaranuncio")
	public String FormularioActualizarAnuncio(
			@RequestParam(value = "id_anuncio", required = false) Integer id_anuncio, 
			@RequestParam("animal") String animal, 
			ModelMap model) {
		
		model.addAttribute("lista", anuncioImpl.obtenerAnuncioPorAnimalEId(id_anuncio, animal));
		model.addAttribute("listaProvincias", combo.comboProvincias());
		return "vistas/actualizarAnuncios";
	}
	
	@PostMapping(value = "actualizaranuncio")
	public String ActualizarAnuncio(
			@RequestParam(value = "id_anuncio", required = false) Integer id_anuncio,
			@RequestParam(value = "animal") String animal,
			@RequestParam(value = "id_provincia") Integer id_provincia,
			@RequestParam(value = "telefono", required = false) Integer telefono,
			@RequestParam(value = "correo_electronico", required = false) String correo_electronico,
			@RequestParam(value = "precio", required = false) double precio,
			ModelMap modelMap) {		
		
		modelMap.addAttribute("listaProvincias", combo.comboProvincias());		
		modelMap.addAttribute("resultado", anuncioImpl.actualizarAnuncio(id_anuncio, animal, id_provincia, telefono, correo_electronico, precio));		
		
		return "vistas/actualizarAlumnos";
	}
}