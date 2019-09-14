package com.shsolutions.project.dominio.repositorios;

import com.shsolutions.project.dominio.modelos.Personas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonasRepository extends JpaRepository<Personas, Integer> {

    List<Personas> findAllByIndicadorHabilitado();

}
