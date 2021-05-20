package com.pedro.kuidanimal.dtos;

public class AnuncioDTO {
	
	
	private Integer id_anuncio;
	private String animal;
	private String provincia;
	private Integer id_provincia;
	private Integer telefono;
	private String correo_electronico;
	private double precio;
	
	
	
	public AnuncioDTO(Integer id_anuncio, String animal, String provincia, Integer id_provincia, Integer telefono,
			String correo_electronico, double precio) {
		super();
		this.id_anuncio = id_anuncio;
		this.animal = animal;
		this.provincia = provincia;
		this.id_provincia = id_provincia;
		this.telefono = telefono;
		this.correo_electronico = correo_electronico;
		this.precio = precio;
	}
	
	



	public AnuncioDTO(Integer id_anuncio, String animal, String provincia, Integer id_provincia, Integer telefono,
			String correo_electronico) {
		super();
		this.id_anuncio = id_anuncio;
		this.animal = animal;
		this.provincia = provincia;
		this.id_provincia = id_provincia;
		this.telefono = telefono;
		this.correo_electronico = correo_electronico;
	}


	


	public AnuncioDTO(Integer id_anuncio, String animal, String provincia, Integer id_provincia, Integer telefono) {
		super();
		this.id_anuncio = id_anuncio;
		this.animal = animal;
		this.provincia = provincia;
		this.id_provincia = id_provincia;
		this.telefono = telefono;
	}

	
	



	public AnuncioDTO(Integer id_anuncio, String animal, String provincia, Integer id_provincia) {
		super();
		this.id_anuncio = id_anuncio;
		this.animal = animal;
		this.provincia = provincia;
		this.id_provincia = id_provincia;
	}	
	
	



	public AnuncioDTO(Integer id_anuncio, String animal, String provincia) {
		super();
		this.id_anuncio = id_anuncio;
		this.animal = animal;
		this.provincia = provincia;
	}

	
	
	public AnuncioDTO(Integer id_anuncio, String animal) {
		super();
		this.id_anuncio = id_anuncio;
		this.animal = animal;
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



	public String getProvincia() {
		return provincia;
	}



	public void setProvincia(String provincia) {
		this.provincia = provincia;
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