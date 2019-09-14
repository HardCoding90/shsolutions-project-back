package com.shsolutions.project.dominio.repositorios;

import com.shsolutions.project.dominio.modelos.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuariosRepository extends JpaRepository<Usuarios, Integer> {

    List<Usuarios> findAllByIndicadorHabilitadoTrue();

}
