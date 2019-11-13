package com.shsolutions.project.negocio.modelos;

import java.math.BigDecimal;
import java.util.Objects;

public class ProductosProveedores {

    private Integer idProductoProveedor;
    private Integer idProducto;
    private Integer idProveedor;
    private BigDecimal valorUnidadCompra;
    private Boolean indicadorHabilitado;

    private String producto;
    private String marca;
    private String referencia;

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

    public BigDecimal getValorUnidadCompra() {
        return valorUnidadCompra;
    }

    public void setValorUnidadCompra(BigDecimal valorUnidadCompra) {
        this.valorUnidadCompra = valorUnidadCompra;
    }

    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
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
}
