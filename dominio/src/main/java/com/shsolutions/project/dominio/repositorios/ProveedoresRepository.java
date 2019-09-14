package com.shsolutions.project.dominio.repositorios;

import com.shsolutions.project.dominio.modelos.Proveedores;
import com.shsolutions.project.dominio.modelos.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProveedoresRepository extends JpaRepository<Proveedores, Integer> {

    List<Proveedores> findAllByIndicadorHabilitadoTrue();

}
