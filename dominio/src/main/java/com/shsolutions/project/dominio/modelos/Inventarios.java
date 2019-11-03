package com.shsolutions.project.dominio.modelos;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "inventarios", catalog = "shsolutions")
public class Inventarios {

    private Integer idInventario;
    private Integer idSucursal;
    private Integer idProductoProveedor;
    private Integer stockMinimo;
    private Integer stockMaximo;
    private Integer cantidadExistente;
    private BigDecimal valor;
    private Boolean indicadorHabilitado;

    public Inventarios() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdInventario")
    public Integer getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(Integer idInventario) {
        this.idInventario = idInventario;
    }

    @Basic
    @Column(name = "IdSucursal")
    public Integer getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Integer idSucursal) {
        this.idSucursal = idSucursal;
    }

    @Basic
    @Column(name = "IdProductoProveedor")
    public Integer getIdProductoProveedor() {
        return idProductoProveedor;
    }

    public void setIdProductoProveedor(Integer idProductoProveedor) {
        this.idProductoProveedor = idProductoProveedor;
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
        Inventarios that = (Inventarios) o;
        return Objects.equals(getIdInventario(), that.getIdInventario()) &&
                Objects.equals(getIdSucursal(), that.getIdSucursal()) &&
                Objects.equals(getIdProductoProveedor(), that.getIdProductoProveedor()) &&
                Objects.equals(getStockMinimo(), that.getStockMinimo()) &&
                Objects.equals(getStockMaximo(), that.getStockMaximo()) &&
                Objects.equals(getCantidadExistente(), that.getCantidadExistente()) &&
                Objects.equals(getValor(), that.getValor()) &&
                Objects.equals(getIndicadorHabilitado(), that.getIndicadorHabilitado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdInventario(), getIdSucursal(), getIdProductoProveedor(), getStockMinimo(), getStockMaximo(), getCantidadExistente(), getValor(), getIndicadorHabilitado());
    }
}
