package com.shsolutions.project.dominio.modelos;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "productos", catalog = "shsolutions")
public class Productos {

    private Integer idProducto;
    private String producto;
    private String marca;
    private String referencia;
    private String descripcion;
    private BigDecimal valorUnidadVenta;
    private Boolean indicadorServicio;
    private Boolean indicadorHabilitado;

    public Productos() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdProducto")
    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    @Basic
    @Column(name = "Producto")
    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    @Basic
    @Column(name = "Marca")
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Basic
    @Column(name = "Referencia")
    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    @Basic
    @Column(name = "ValorUnidadVenta")
    public BigDecimal getValorUnidadVenta() {
        return valorUnidadVenta;
    }

    public void setValorUnidadVenta(BigDecimal valorUnidadVenta) {
        this.valorUnidadVenta = valorUnidadVenta;
    }

    @Basic
    @Column(name = "Descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "IndicadorServicio")
    public Boolean getIndicadorServicio() {
        return indicadorServicio;
    }

    public void setIndicadorServicio(Boolean indicadorServicio) {
        this.indicadorServicio = indicadorServicio;
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
        Productos productos = (Productos) o;
        return Objects.equals(getIdProducto(), productos.getIdProducto()) &&
                Objects.equals(getProducto(), productos.getProducto()) &&
                Objects.equals(getMarca(), productos.getMarca()) &&
                Objects.equals(getDescripcion(), productos.getDescripcion()) &&
                Objects.equals(getIndicadorServicio(), productos.getIndicadorServicio()) &&
                Objects.equals(getIndicadorHabilitado(), productos.getIndicadorHabilitado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdProducto(), getProducto(), getMarca(), getDescripcion(), getIndicadorServicio(), getIndicadorHabilitado());
    }
}
