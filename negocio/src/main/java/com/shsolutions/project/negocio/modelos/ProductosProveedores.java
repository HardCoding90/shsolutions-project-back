package com.shsolutions.project.negocio.modelos;

import java.math.BigDecimal;
import java.util.Objects;

public class ProductosProveedores {

    private Integer idProductoProveedor;
    private Integer idProducto;
    private Integer idProveedor;
    private BigDecimal valorUnidad;
    private Boolean indicadorHabilitado;
    public Integer getIdProductoProveedor() {
        return idProductoProveedor;
    }

    public void setIdProductoProveedor(Integer idProductoProveedor) {
        this.idProductoProveedor = idProductoProveedor;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public BigDecimal getValorUnidad() {
        return valorUnidad;
    }

    public void setValorUnidad(BigDecimal valorUnidad) {
        this.valorUnidad = valorUnidad;
    }

    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }
}
