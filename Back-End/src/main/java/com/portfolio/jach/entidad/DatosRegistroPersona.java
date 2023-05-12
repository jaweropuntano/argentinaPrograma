package com.portfolio.jach.entidad;

import jakarta.validation.constraints.NotBlank;

public record DatosRegistroPersona(
		@NotBlank
		String nombre,
		@NotBlank
		String apellido,
		@NotBlank
		String img) {	

}
