package com.portfolio.jach.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

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

}