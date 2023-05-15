package com.portfolio.jach.Security.Repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.jach.Security.entity.Rol;
import com.portfolio.jach.Security.enums.RolNombre;

@Repository

public interface iRolRepository extends JpaRepository<Rol, Integer> {
	 Optional<Rol> findByRolNombre(RolNombre rolNombre);

}
