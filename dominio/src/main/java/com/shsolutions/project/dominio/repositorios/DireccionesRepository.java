package com.shsolutions.project.dominio.repositorios;

import com.shsolutions.project.dominio.modelos.Direcciones;
import com.shsolutions.project.dominio.modelos.Paises;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DireccionesRepository extends JpaRepository<Direcciones,Integer> {

    List<Direcciones> findAllByIndicadorHabilitadoTrue();

}
