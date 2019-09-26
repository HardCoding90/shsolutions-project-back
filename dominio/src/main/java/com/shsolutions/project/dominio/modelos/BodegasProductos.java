package com.shsolutions.project.dominio.modelos;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "bodegasproductos", catalog = "shsolutions")
public class BodegasProductos {

    private Integer idBodegaProducto;
    private Integer idBodega;
    private Integer idProveedorProducto;
    private Integer stockMinimo;
    private Integer stockMaximo;
    private Integer cantidadExistente;
    private BigDecimal valor;
    private Boolean indicadorHabilitado;

    public BodegasProductos() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdBodegaProducto")
    public Integer getIdBodegaProducto() {
        return idBodegaProducto;
    }

    public void setIdBodegaProducto(Integer idBodegaProducto) {
        this.idBodegaProducto = idBodegaProducto;
    }

    @Basic
    @Column(name = "IdBodega")
    public Integer getIdBodega() {
        return idBodega;
    }

    public void setIdBodega(Integer idBodega) {
        this.idBodega = idBodega;
    }

    @Basic
    @Column(name = "IdProveedorProducto")
    public Integer getIdProveedorProducto() {
        return idProveedorProducto;
    }

    public void setIdProveedorProducto(Integer idProveedorProducto) {
        this.idProveedorProducto = idProveedorProducto;
    }

    @Basic
    @Column(name = "StockMinimo")
    public Integer getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(Integer stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    @Basic
    @Column(name = "StockMaximo")
    public Integer getStockMaximo() {
        return stockMaximo;
    }

    public void setStockMaximo(Integer stockMaximo) {
        this.stockMaximo = stockMaximo;
    }

    @Basic
    @Column(name = "CantidadExistente")
    public Integer getCantidadExistente() {
        return cantidadExistente;
    }

    public void setCantidadExistente(Integer cantidadExistente) {
        this.cantidadExistente = cantidadExistente;
    }

    @Basic
    @Column(name = "Valor")
    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Basic
    @Column(name = "IndicadorHabilitado")
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BodegasProductos that = (BodegasProductos) o;
        return Objects.equals(getIdBodegaProducto(), that.getIdBodegaProducto()) &&
                Objects.equals(getIdBodega(), that.getIdBodega()) &&
                Objects.equals(getIdProveedorProducto(), that.getIdProveedorProducto()) &&
                Objects.equals(getStockMinimo(), that.getStockMinimo()) &&
                Objects.equals(getStockMaximo(), that.getStockMaximo()) &&
                Objects.equals(getCantidadExistente(), that.getCantidadExistente()) &&
                Objects.equals(getValor(), that.getValor()) &&
                Objects.equals(getIndicadorHabilitado(), that.getIndicadorHabilitado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdBodegaProducto(), getIdBodega(), getIdProveedorProducto(), getStockMinimo(), getStockMaximo(), getCantidadExistente(), getValor(), getIndicadorHabilitado());
    }
}
