package com.shsolutions.project.dominio.repositorios;

import com.shsolutions.project.dominio.modelos.TelefonosProveedores;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TelefonosProveedoresRepository extends JpaRepository<TelefonosProveedores, Integer> {

    List<TelefonosProveedores> findAllByIndicadorHabilitadoTrue();

}
