package com.shsolutions.project.dominio.repositorios;

import com.shsolutions.project.dominio.modelos.Departamentos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartamentosRepository extends JpaRepository<Departamentos,Integer> {

    List<Departamentos> findAllByIndicadorHabilitado();

}
