package com.shsolutions.project.dominio.repositorios;

import com.shsolutions.project.dominio.modelos.Ordenes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrdenesRepository extends JpaRepository<Ordenes,Integer> {

    List<Ordenes> findAllByIndicadorHabilitadoTrue();

}
