package com.shsolutions.project.dominio.repositorios;

import com.shsolutions.project.dominio.modelos.Paises;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaisesRepository extends JpaRepository<Paises,Integer> {

    List<Paises> findAllByIndicadorHabilitado();

}
