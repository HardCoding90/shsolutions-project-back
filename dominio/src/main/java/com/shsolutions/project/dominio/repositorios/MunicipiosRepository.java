package com.shsolutions.project.dominio.repositorios;

import com.shsolutions.project.dominio.modelos.Municipios;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MunicipiosRepository extends JpaRepository<Municipios,Integer> {

    List<Municipios> findAllByIndicadorHabilitado();

}
