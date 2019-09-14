package com.shsolutions.project.dominio.repositorios;

import com.shsolutions.project.dominio.modelos.DireccionesSucursales;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DireccionesSucursalesRepository extends JpaRepository<DireccionesSucursales, Integer> {

    List<DireccionesSucursales> findAllByIndicadorHabilitadoTrue();

}
