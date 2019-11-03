package com.shsolutions.project.dominio.repositorios;

import com.shsolutions.project.dominio.modelos.ProductosProveedores;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductosProveedoresRepository extends JpaRepository<ProductosProveedores, Integer> {

    List<ProductosProveedores> findAllByIndicadorHabilitadoTrue();

}