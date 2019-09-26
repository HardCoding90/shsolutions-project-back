package com.shsolutions.project.dominio.repositorios;

import com.shsolutions.project.dominio.modelos.Departamentos;
import com.shsolutions.project.dominio.modelos.OrdenesProductos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrdenesProductosRepository extends JpaRepository<OrdenesProductos,Integer> {

    List<OrdenesProductos> findAllByIndicadorHabilitadoTrue();

}
