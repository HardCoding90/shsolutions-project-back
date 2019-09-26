package com.shsolutions.project.dominio.repositorios;

import com.shsolutions.project.dominio.modelos.Ventas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VentasRepository extends JpaRepository<Ventas, Integer> {

    List<Ventas> findAllByIndicadorHabilitadoTrue();

}
