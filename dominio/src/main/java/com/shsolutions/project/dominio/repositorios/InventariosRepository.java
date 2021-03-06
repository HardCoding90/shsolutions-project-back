package com.shsolutions.project.dominio.repositorios;

import com.shsolutions.project.dominio.modelos.Inventarios;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InventariosRepository extends JpaRepository<Inventarios,Integer> {

    List<Inventarios> findAllByIndicadorHabilitadoTrue();

    List<Inventarios> findAllByIndicadorHabilitadoTrueAndIdSucursalAndIdProductoProveedorIn(Integer idSucursal,List<Integer> idsProductoProveedorList);

    List<Inventarios> findAllByIndicadorHabilitadoTrueAndIdSucursalAndProductosProveedores_Productos_IdProductoIn(Integer idSucursal,List<Integer> ids);

    List<Inventarios> findAllByIndicadorHabilitadoTrueAndIdSucursal(Integer idSucursal);
}
