package com.shsolutions.project.negocio.modelos;

import java.time.LocalDateTime;
import java.util.List;

public class Ordenes {

    private Integer idOrden;
    private Integer idSucursal;
    private LocalDateTime fechaOrden ;
    private Boolean indicadorRecibida;
    private Boolean indicadorHabilitado;

    private List<OrdenesProductos> ordenesProductos;

    public Integer getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(Integer idOrden) {
        this.idOrden = idOrden;
    }

    public Integer getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Integer idSucursal) {
        this.idSucursal = idSucursal;
    }

    public LocalDateTime getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(LocalDateTime fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public Boolean getIndicadorRecibida() {
        return indicadorRecibida;
    }

    public void setIndicadorRecibida(Boolean indicadorRecibida) {
        this.indicadorRecibida = indicadorRecibida;
    }

    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    public List<OrdenesProductos> getOrdenesProductos() {
        return ordenesProductos;
    }

    public void setOrdenesProductos(List<OrdenesProductos> ordenesProductos) {
        this.ordenesProductos = ordenesProductos;
    }
}
