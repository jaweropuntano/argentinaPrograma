package com.portfolio.jach.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.jach.entidad.Persona;
import com.portfolio.jach.interfaces.PersonaService;
import com.portfolio.jach.repository.PersonaRepository;

@Service

public class ImplePersonaService implements PersonaService {
	@Autowired PersonaRepository personaRepository;
	

	@Override
	public List<Persona> getPersona() {
		List<Persona> persona = personaRepository.findAll();
		return persona;
	}

	@Override
	public void savePersona(Persona persona) {
		personaRepository.save(persona);
		
	}

	@Override
	public void deletePersona(Long id) {
		personaRepository.deleteById(id);		
	}

	@Override
	public Persona findPersona(Long id) {
		Persona persona = personaRepository.findById(id).orElse(null);
		return persona;
	}
	
	

}
