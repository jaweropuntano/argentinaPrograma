package com.portfolio.jach.entidad;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity


public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min=1, max=50, message= "No cumple con la lonfitud")
	private String nombre;
	
	@NotNull
	@Size(min=1, max=50, message= "No cumple con la lonfitud")
	private String apellido;

	@Size(min=1, max=50, message= "No cumple con la lonfitud")
	private String img;
	
	

	public void setNombre(String nuevoNombre) {
		// TODO Auto-generated method stub
		
	}

	public void setApellido(String nuevoApellido) {
		// TODO Auto-generated method stub
		
	}

	public void setImg(String nuevoImg) {
		// TODO Auto-generated method stub
		
	}


	
	}


