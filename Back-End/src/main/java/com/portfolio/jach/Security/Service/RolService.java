package com.portfolio.jach.Security.Service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.jach.Security.Repository.iRolRepository;
import com.portfolio.jach.Security.entity.Rol;
import com.portfolio.jach.Security.enums.RolNombre;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol> getbyRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}
