package com.shsolutions.project.negocio.modelos;

import java.time.LocalDateTime;
import java.util.List;

public class Ventas {

    private Integer idVenta;
    private Integer idSucursal;
    private Integer idPersonaVenta;
    private LocalDateTime fechaVenta;
    private Boolean indicadorHabilitado;

    private List<ProductosVentasDTO> productosVentasDTOList;

    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public Integer getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Integer idSucursal) {
        this.idSucursal = idSucursal;
    }

    public Integer getIdPersonaVenta() {
        return idPersonaVenta;
    }

    public void setIdPersonaVenta(Integer idPersonaVenta) {
        this.idPersonaVenta = idPersonaVenta;
    }

    public LocalDateTime getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDateTime fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    public List<ProductosVentasDTO> getProductosVentasDTOList() {
        return productosVentasDTOList;
    }

    public void setProductosVentasDTOList(List<ProductosVentasDTO> productosVentasDTOList) {
        this.productosVentasDTOList = productosVentasDTOList;
    }
}
