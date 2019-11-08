package com.shsolutions.project.dominio.repositorios;

import com.shsolutions.project.dominio.modelos.Productos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductosRepository extends JpaRepository<Productos, Integer> {

    List<Productos> findAllByIndicadorHabilitadoTrue();

    List<Productos> findByIndicadorHabilitadoTrueAndIdProductoIn(List<Integer> idList);

}
