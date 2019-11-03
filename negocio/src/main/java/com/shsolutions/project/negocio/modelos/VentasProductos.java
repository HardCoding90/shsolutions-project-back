package com.shsolutions.project.negocio.modelos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class VentasProductos {

    private Integer idVentaProducto;
    private Integer idVenta;
    private Integer idInventario;
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

    public Integer getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(Integer idInventario) {
        this.idInventario = idInventario;
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
