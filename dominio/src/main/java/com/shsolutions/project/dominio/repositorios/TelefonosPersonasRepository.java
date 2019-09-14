package com.shsolutions.project.dominio.repositorios;

import com.shsolutions.project.dominio.modelos.TelefonosPersonas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TelefonosPersonasRepository extends JpaRepository<TelefonosPersonas, Integer> {

    List<TelefonosPersonas> findAllByIndicadorHabilitadoTrue();

}
