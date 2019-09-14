package com.shsolutions.project.dominio.repositorios;

import com.shsolutions.project.dominio.modelos.Generos;
import com.shsolutions.project.dominio.modelos.Paises;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GenerosRepository extends JpaRepository<Generos,Integer> {

    List<Generos> findAllByIndicadorHabilitadoTrue();

}
