package com.shsolutions.project.dominio.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "inventarios", catalog = "shsolutions")
public class Inventarios implements Serializable {

    private Integer idInventario;
    private Integer idSucursal;
    private Integer idProductoProveedor;
    private Integer cantidadExistente;
    private BigDecimal valor;
    private Boolean indicadorHabilitado;

    private ProductosProveedores productosProveedores;
    private Integer idProducto;
    private String producto;

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

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "IdProductoProveedor", referencedColumnName = "IdProductoProveedor", insertable = false, updatable = false)
    public ProductosProveedores getProductosProveedores() {
        return productosProveedores;
    }

    public void setProductosProveedores(ProductosProveedores productosProveedores) {
        this.productosProveedores = productosProveedores;
    }

    @Transient
    public Integer getIdProducto() {
        return productosProveedores != null ? productosProveedores.getIdProducto() : null;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    @Transient
    public String getProducto() {
        return productosProveedores != null ? (productosProveedores.getProductos() != null ? productosProveedores.getProductos().getProducto() + " - " + productosProveedores.getProductos().getMarca() + " - " + productosProveedores.getProductos().getReferencia(): null) : null ;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inventarios that = (Inventarios) o;
        return Objects.equals(getIdInventario(), that.getIdInventario()) &&
                Objects.equals(getIdSucursal(), that.getIdSucursal()) &&
                Objects.equals(getIdProductoProveedor(), that.getIdProductoProveedor()) &&
                Objects.equals(getCantidadExistente(), that.getCantidadExistente()) &&
                Objects.equals(getValor(), that.getValor()) &&
                Objects.equals(getIndicadorHabilitado(), that.getIndicadorHabilitado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdInventario(), getIdSucursal(), getIdProductoProveedor(), getCantidadExistente(), getValor(), getIndicadorHabilitado());
    }
}
