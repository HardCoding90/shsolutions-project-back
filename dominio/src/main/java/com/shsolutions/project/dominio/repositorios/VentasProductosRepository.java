package com.shsolutions.project.dominio.repositorios;

import com.shsolutions.project.dominio.modelos.VentasProductos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VentasProductosRepository extends JpaRepository<VentasProductos, Integer> {

    List<VentasProductos> findAllByIndicadorHabilitadoTrue();

}
