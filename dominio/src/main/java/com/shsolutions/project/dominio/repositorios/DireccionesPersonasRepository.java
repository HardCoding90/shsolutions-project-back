package com.shsolutions.project.dominio.repositorios;

import com.shsolutions.project.dominio.modelos.DireccionesPersonas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DireccionesPersonasRepository extends JpaRepository<DireccionesPersonas, Integer> {

    List<DireccionesPersonas> findAllByIndicadorHabilitadoTrue();

}
