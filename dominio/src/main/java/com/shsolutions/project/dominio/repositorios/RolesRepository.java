package com.shsolutions.project.dominio.repositorios;

import com.shsolutions.project.dominio.modelos.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RolesRepository extends JpaRepository<Roles, Integer> {

    List<Roles> findAllByIndicadorHabilitadoTrue();

}
