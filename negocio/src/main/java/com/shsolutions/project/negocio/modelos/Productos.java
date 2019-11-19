package com.shsolutions.project.negocio.modelos;

import java.math.BigDecimal;
import java.util.Objects;

public class Productos {

    private Integer idProducto;
    private String producto;
    private String marca;
    private String referencia;
    private String descripcion;
    private BigDecimal valorUnidadVenta;
    private Boolean indicadorServicio;
    private Boolean indicadorHabilitado;
    private Integer cantidadExistente;

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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getIndicadorServicio() {
        return indicadorServicio;
    }

    public void setIndicadorServicio(Boolean indicadorServicio) {
        this.indicadorServicio = indicadorServicio;
    }

    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    public BigDecimal getValorUnidadVenta() {
        return valorUnidadVenta;
    }

    public void setValorUnidadVenta(BigDecimal valorUnidadVenta) {
        this.valorUnidadVenta = valorUnidadVenta;
    }

    public Integer getCantidadExistente() {
        return cantidadExistente;
    }

    public void setCantidadExistente(Integer cantidadExistente) {
        this.cantidadExistente = cantidadExistente;
    }
}
