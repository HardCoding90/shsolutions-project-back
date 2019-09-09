package com.shsolutions.project.dominio.repositorios;

import com.shsolutions.project.dominio.modelos.Paises;
import com.shsolutions.project.dominio.modelos.Sucursales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SucursalesRepository extends JpaRepository<Sucursales,Integer> {
}
