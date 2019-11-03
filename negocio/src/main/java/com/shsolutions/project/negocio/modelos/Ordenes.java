package com.shsolutions.project.negocio.modelos;

import java.time.LocalDateTime;

public class Ordenes {

    private Integer idOrden;
    private Integer idSucursal;
    private LocalDateTime fechaOrden ;
    private Boolean indicadorRecibida;
    private Boolean indicadorHabilitado;

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
}
