package com.shsolutions.project.dominio.repositorios;

import com.shsolutions.project.dominio.modelos.BodegasProductos;
import com.shsolutions.project.dominio.modelos.Departamentos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BodegasProductosRepository extends JpaRepository<BodegasProductos,Integer> {

    List<BodegasProductos> findAllByIndicadorHabilitadoTrue();

}
