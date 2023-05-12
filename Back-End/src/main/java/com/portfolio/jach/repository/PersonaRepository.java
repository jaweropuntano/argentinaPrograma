package com.portfolio.jach.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.jach.entidad.Persona;

@Repository

public interface PersonaRepository extends JpaRepository<Persona, Long>{
	
	

}
