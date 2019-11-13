package com.shsolutions.project.dominio.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "productosproveedores", catalog = "shsolutions")
public class ProductosProveedores implements Serializable {

    private Integer idProductoProveedor;
    private Integer idProducto;
    private Integer idProveedor;
    private BigDecimal valorUnidadCompra;
    private Boolean indicadorHabilitado;

    private Productos productos;
    private String producto;
    private String marca;
    private String referencia;

    public ProductosProveedores() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdProductoProveedor")
    public Integer getIdProductoProveedor() {
        return idProductoProveedor;
    }

    public void setIdProductoProveedor(Integer idProductoProveedor) {
        this.idProductoProveedor = idProductoProveedor;
    }

    @Basic
    @Column(name = "IdProducto")
    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    @Basic
    @Column(name = "IdProveedor")
    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    @Basic
    @Column(name = "ValorUnidadCompra")
    public BigDecimal getValorUnidadCompra() {
        return valorUnidadCompra;
    }

    public void setValorUnidadCompra(BigDecimal valorUnidadCompra) {
        this.valorUnidadCompra = valorUnidadCompra;
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
    @JoinColumn(name = "IdProducto", referencedColumnName = "IdProducto", insertable = false, updatable = false)
    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }

    @Transient
    public String getProducto() {
        return productos != null ? productos.getProducto() : null;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    @Transient
    public String getMarca() {
        return productos != null ? productos.getMarca() : null;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Transient
    public String getReferencia() {
        return productos != null ? productos.getReferencia() : null;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductosProveedores that = (ProductosProveedores) o;
        return Objects.equals(getIdProductoProveedor(), that.getIdProductoProveedor()) &&
                Objects.equals(getIdProducto(), that.getIdProducto()) &&
                Objects.equals(getIdProveedor(), that.getIdProveedor()) &&
                Objects.equals(getValorUnidadCompra(), that.getValorUnidadCompra()) &&
                Objects.equals(getIndicadorHabilitado(), that.getIndicadorHabilitado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdProductoProveedor(), getIdProducto(), getIdProveedor(), getValorUnidadCompra(), getIndicadorHabilitado());
    }
}
