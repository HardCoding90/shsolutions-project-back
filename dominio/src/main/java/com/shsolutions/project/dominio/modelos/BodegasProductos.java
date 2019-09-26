package com.shsolutions.project.dominio.modelos;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bodegasproductos", catalog = "shsolutions")
public class BodegasProductos {

    private Integer idBodegaProducto;
    private Integer idBodega;
    private Integer idProveedorProducto;
    private Integer stockMinimo;
    private Integer stockMaximo;
    private Integer cantidadExistente;
    private Double valor;
    private Boolean indicadorHabilitado;

    public BodegasProductos() {
    }

    public Integer getIdBodegaProducto() {
        return idBodegaProducto;
    }

    public void setIdBodegaProducto(Integer idBodegaProducto) {
        this.idBodegaProducto = idBodegaProducto;
    }

    public Integer getIdBodega() {
        return idBodega;
    }

    public void setIdBodega(Integer idBodega) {
        this.idBodega = idBodega;
    }

    public Integer getIdProveedorProducto() {
        return idProveedorProducto;
    }

    public void setIdProveedorProducto(Integer idProveedorProducto) {
        this.idProveedorProducto = idProveedorProducto;
    }

    public Integer getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(Integer stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public Integer getStockMaximo() {
        return stockMaximo;
    }

    public void setStockMaximo(Integer stockMaximo) {
        this.stockMaximo = stockMaximo;
    }

    public Integer getCantidadExistente() {
        return cantidadExistente;
    }

    public void setCantidadExistente(Integer cantidadExistente) {
        this.cantidadExistente = cantidadExistente;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }
}
