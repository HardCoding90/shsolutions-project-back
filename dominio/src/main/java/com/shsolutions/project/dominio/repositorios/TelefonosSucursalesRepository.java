package com.shsolutions.project.dominio.repositorios;

import com.shsolutions.project.dominio.modelos.TelefonosSucursales;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TelefonosSucursalesRepository extends JpaRepository<TelefonosSucursales, Integer> {

    List<TelefonosSucursales> findAllByIndicadorHabilitadoTrue();

}
