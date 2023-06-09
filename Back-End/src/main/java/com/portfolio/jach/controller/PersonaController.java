package com.portfolio.jach.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.jach.entidad.DatosRegistroPersona;
import com.portfolio.jach.entidad.Persona;
import com.portfolio.jach.interfaces.PersonaService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class PersonaController {
	@Autowired PersonaService personaService;
	
	@GetMapping("/personas/traer")
	public List<Persona> getPersona() {
		return personaService.getPersona();
	}
	@PostMapping("/personas/crear")
	public void createPersona(@RequestBody @Valid DatosRegistroPersona datosRegistroPersona) {
		personaService.savePersona(new Persona(datosRegistroPersona));
	}
	
	@DeleteMapping("/personas/borrar/{id}")
		public String deletePersona(@PathVariable Long id) {
			personaService.deletePersona(id);
			return "La persona se elimino Correctamente";
		}
	
	@PutMapping("/personas/editar/{id}")
		public Persona editPersona(@PathVariable Long id,
									@RequestParam ("nombre") String nuevoNombre,
									@RequestParam ("apellido") String nuevoApellido,
									@RequestParam ("img") String nuevoImg){		
		Persona persona = personaService.findPersona(id);
		
		persona.setNombre(nuevoNombre);
		persona.setApellido(nuevoApellido);
		persona.setImg(nuevoImg);
		
		personaService.savePersona(persona);
		return persona;		
		}	
		@GetMapping("/persona/traer/perfil")
		public Persona findPersona(){
			return personaService.findPersona((long)1);
		}

	}

