package com.portfolio.jach.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.portfolio.jach.entidad.Experiencia;

public interface RExperiencia  extends JpaRepository<Experiencia, Integer>{
	public Optional<Experiencia> findByNombreE(String nombreE);
    public boolean existsByNombreE(String nombreE);
}
