package com.shsolutions.project.dominio.repositorios;

import com.shsolutions.project.dominio.modelos.Generos;
import com.shsolutions.project.dominio.modelos.Telefonos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TelefonosRepository extends JpaRepository<Telefonos,Integer> {

    List<Telefonos> findAllByIndicadorHabilitadoTrue();

}
