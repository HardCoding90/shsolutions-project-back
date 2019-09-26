package com.shsolutions.project.dominio.repositorios;

import com.shsolutions.project.dominio.modelos.Departamentos;
import com.shsolutions.project.dominio.modelos.Facturas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FacturasRepository extends JpaRepository<Facturas,Integer> {

    List<Facturas> findAllByIndicadorHabilitadoTrue();

}
