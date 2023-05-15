package com.portfolio.jach.interfaces;

import java.util.List;
import com.portfolio.jach.entidad.Persona;

public interface PersonaService {
	public List<Persona> getPersona();
	
	public void savePersona(Persona persona);
	
	public void deletePersona(Long id);
	
	public Persona findPersona(Long id);

}
