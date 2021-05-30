package com.pedro.kuidanimal.dtos;

public class ComboDTO {
	
	private Integer id_provincia;
	private String nombre;
	


	public ComboDTO(Integer id_provincia, String nombre) {
		super();
		this.id_provincia = id_provincia;
		this.nombre = nombre;
	}



	public ComboDTO(Integer id_provincia) {
		super();
		this.id_provincia = id_provincia;
	}



	public ComboDTO() {
		super();
	}



	public Integer getId_provincia() {
		return id_provincia;
	}



	public void setId_provincia(Integer id_provincia) {
		this.id_provincia = id_provincia;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
	
}