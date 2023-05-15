package com.portfolio.jach.entidad;

import jakarta.persistence.Entity;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(of="id")
@Getter
@Setter
@Entity(name = "Persona")
@Table(name = "persona")


public class Persona {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;
	
	private String nombre;
	
	private String apellido;

	private String img;
	
	

	public Persona(Long id, String nombre, String apellido, String img) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.img = img;
	}

	public Persona() {
	}

	public Persona(DatosRegistroPersona datos) {
		this.nombre = datos.nombre();
		this.apellido = datos.apellido();
		this.img = datos.img();
	}

	public void setNombre(String nuevoNombre) {
		// TODO Auto-generated method stub
		
	}

	public void setApellido(String nuevoApellido) {
		// TODO Auto-generated method stub
		
	}

	public void setImg(String nuevoImg) {
		// TODO Auto-generated method stub
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getImg() {
		return img;
	}
	
}


