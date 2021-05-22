package com.pedro.kuidanimal.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "anuncios")
public class AnuncioEntity {
	
	@Id
	@Column(name = "id_anuncio")
	private Integer id_anuncio;
	
	@Column(name = "animal")
	private String animal;
	
	@Column(name = "id_provincia")
	private Integer	 id_provincia;
	
	@Column(name = "telefono")
	private Integer telefono;
	
	@Column(name = "correo_electronico")
	private String correo_electronico;
	
	@Column(name = "precio")
	private double precio;

	public AnuncioEntity() {
		super();
	}
	
	

	public AnuncioEntity(Integer id_anuncio) {
		super();
		this.id_anuncio = id_anuncio;
	}



	public AnuncioEntity(Integer id_anuncio, String animal, int id_provincia, Integer telefono, String correo_electronico, double precio) {
		super();
		this.id_anuncio = id_anuncio;
		this.animal = animal;
		this.id_provincia = id_provincia;
		this.telefono = telefono;
		this.correo_electronico = correo_electronico;
		this.precio = precio;
	}



	public Integer getId_anuncio() {
		return id_anuncio;
	}



	public void setId_anuncio(Integer id_anuncio) {
		this.id_anuncio = id_anuncio;
	}



	public String getAnimal() {
		return animal;
	}



	public void setAnimal(String animal) {
		this.animal = animal;
	}



	public Integer getId_provincia() {
		return id_provincia;
	}



	public void setId_provincia(Integer id_provincia) {
		this.id_provincia = id_provincia;
	}



	public Integer getTelefono() {
		return telefono;
	}



	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}



	public String getCorreo_electronico() {
		return correo_electronico;
	}



	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
	
	
}