package com.shsolutions.project.dominio.repositorios;

import com.shsolutions.project.dominio.modelos.UsuariosRoles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuariosRolesRepository extends JpaRepository<UsuariosRoles, Integer> {

    List<UsuariosRoles> findAllByIndicadorHabilitadoTrue();

}
