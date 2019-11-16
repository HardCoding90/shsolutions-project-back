package com.shsolutions.project.negocio.modelos;

import java.math.BigDecimal;
import java.util.Objects;

public class OrdenesProductos {

    private Integer idOrdenProducto;
    private Integer idProductoProveedor;
    private Integer idOrden;
    private BigDecimal valorCompraUnidad;
    private Integer cantidad;
    private Boolean indicadorHabilitado;
    private Integer idProducto;
    private String producto;
    private String marca;
    private String referencia;
    private Integer idProveedor;

    public Integer getIdOrdenProducto() {
        return idOrdenProducto;
    }

    public void setIdOrdenProducto(Integer idOrdenProducto) {
        this.idOrdenProducto = idOrdenProducto;
    }

    public Integer getIdProductoProveedor() {
        return idProductoProveedor;
    }

    public void setIdProductoProveedor(Integer idProductoProveedor) {
        this.idProductoProveedor = idProductoProveedor;
    }

    public Integer getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(Integer idOrden) {
        this.idOrden = idOrden;
    }

    public BigDecimal getValorCompraUnidad() {
        return valorCompraUnidad;
    }

    public void setValorCompraUnidad(BigDecimal valorCompraUnidad) {
        this.valorCompraUnidad = valorCompraUnidad;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }
}
