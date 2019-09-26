package com.shsolutions.project.negocio.modelos;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class VentasProductos {

    private Integer idVentaProducto;
    private Integer idVenta;
    private Integer idBodegaProducto;
    private Integer cantidadVendida;
    private BigDecimal valorVentaUnidad;
    private LocalDateTime fechaAgenda;
    private Boolean indicadorHabilitado;

    public Integer getIdVentaProducto() {
        return idVentaProducto;
    }

    public void setIdVentaProducto(Integer idVentaProducto) {
        this.idVentaProducto = idVentaProducto;
    }

    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public Integer getIdBodegaProducto() {
        return idBodegaProducto;
    }

    public void setIdBodegaProducto(Integer idBodegaProducto) {
        this.idBodegaProducto = idBodegaProducto;
    }

    public Integer getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(Integer cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public BigDecimal getValorVentaUnidad() {
        return valorVentaUnidad;
    }

    public void setValorVentaUnidad(BigDecimal valorVentaUnidad) {
        this.valorVentaUnidad = valorVentaUnidad;
    }

    public LocalDateTime getFechaAgenda() {
        return fechaAgenda;
    }

    public void setFechaAgenda(LocalDateTime fechaAgenda) {
        this.fechaAgenda = fechaAgenda;
    }

    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }
}
