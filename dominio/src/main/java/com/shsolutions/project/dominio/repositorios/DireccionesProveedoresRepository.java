package com.shsolutions.project.dominio.repositorios;

import com.shsolutions.project.dominio.modelos.DireccionesProveedores;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DireccionesProveedoresRepository extends JpaRepository<DireccionesProveedores, Integer> {

    List<DireccionesProveedores> findAllByIndicadorHabilitadoTrue();

}
