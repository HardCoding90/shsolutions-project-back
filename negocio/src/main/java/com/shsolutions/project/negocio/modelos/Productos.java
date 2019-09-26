package com.shsolutions.project.negocio.modelos;

import java.util.Objects;

public class Productos {

    private Integer idProducto;
    private String producto;
    private String marca;
    private String descripcion;
    private Boolean indicadorServicio;
    private Boolean indicadorHabilitado;

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
}
