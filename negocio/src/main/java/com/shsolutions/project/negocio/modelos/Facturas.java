package com.shsolutions.project.negocio.modelos;

import java.time.LocalDateTime;
import java.util.Objects;

public class Facturas {

    private Integer idFactura;
    private Integer idVenta;
    private LocalDateTime fechaFactura;
    private Integer idIva;
    private Boolean indicadorPagada;
    private Boolean indicadorHabilitado;

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public LocalDateTime getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(LocalDateTime fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public Integer getIdIva() {
        return idIva;
    }

    public void setIdIva(Integer idIva) {
        this.idIva = idIva;
    }

    public Boolean getIndicadorPagada() {
        return indicadorPagada;
    }

    public void setIndicadorPagada(Boolean indicadorPagada) {
        this.indicadorPagada = indicadorPagada;
    }

    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }
}
