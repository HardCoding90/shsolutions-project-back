package com.shsolutions.project.dominio.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "ordenesproductos", catalog = "shsolutions")
public class OrdenesProductos implements Serializable {

    private Integer idOrdenProducto;
    private Integer idProductoProveedor;
    private Integer idOrden;
    private BigDecimal valorCompraUnidad;
    private Integer cantidad;
    private Boolean indicadorHabilitado;

    private ProductosProveedores productosProveedores;
    private Integer idProducto;
    private String producto;
    private String marca;
    private String referencia;

    private Integer idProveedor;

    public OrdenesProductos() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdOrdenProducto")
    public Integer getIdOrdenProducto() {
        return idOrdenProducto;
    }

    public void setIdOrdenProducto(Integer idOrdenProducto) {
        this.idOrdenProducto = idOrdenProducto;
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
    @Column(name = "IdOrden")
    public Integer getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(Integer idOrden) {
        this.idOrden = idOrden;
    }

    @Basic
    @Column(name = "ValorCompraUnidad")
    public BigDecimal getValorCompraUnidad() {
        return valorCompraUnidad;
    }

    public void setValorCompraUnidad(BigDecimal valorCompraUnidad) {
        this.valorCompraUnidad = valorCompraUnidad;
    }

    @Basic
    @Column(name = "Cantidad")
    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
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
        return productosProveedores != null ? productosProveedores.getProducto() : null;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    @Transient
    public String getMarca() {
        return productosProveedores != null ? productosProveedores.getMarca() : null;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Transient
    public String getReferencia() {
        return productosProveedores != null ? productosProveedores.getReferencia() : null;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    @Transient
    public Integer getIdProveedor() {
        return productosProveedores != null ? productosProveedores.getIdProveedor() : null;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdenesProductos that = (OrdenesProductos) o;
        return Objects.equals(getIdOrdenProducto(), that.getIdOrdenProducto()) &&
                Objects.equals(getIdProductoProveedor(), that.getIdProductoProveedor()) &&
                Objects.equals(getIdOrden(), that.getIdOrden()) &&
                Objects.equals(getValorCompraUnidad(), that.getValorCompraUnidad()) &&
                Objects.equals(getCantidad(), that.getCantidad()) &&
                Objects.equals(getIndicadorHabilitado(), that.getIndicadorHabilitado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdOrdenProducto(), getIdProductoProveedor(), getIdOrden(), getValorCompraUnidad(), getCantidad(), getIndicadorHabilitado());
    }
}
