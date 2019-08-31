package com.shsolutions.project.dominio.repositorios;

import com.shsolutions.project.dominio.modelos.Departamentos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentosRepository extends JpaRepository<Departamentos,Integer> {
}
