package com.shsolutions.project.dominio.modelos;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "productosproveedores", catalog = "shsolutions")
public class ProductosProveedores {

    private Integer idProductoProveedor;
    private Integer idProducto;
    private Integer idProveedor;
    private BigDecimal valorUnidad;
    private Boolean indicadorHabilitado;

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
    @Column(name = "ValorUnidad")
    public BigDecimal getValorUnidad() {
        return valorUnidad;
    }

    public void setValorUnidad(BigDecimal valorUnidad) {
        this.valorUnidad = valorUnidad;
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
        ProductosProveedores that = (ProductosProveedores) o;
        return Objects.equals(getIdProductoProveedor(), that.getIdProductoProveedor()) &&
                Objects.equals(getIdProducto(), that.getIdProducto()) &&
                Objects.equals(getIdProveedor(), that.getIdProveedor()) &&
                Objects.equals(getValorUnidad(), that.getValorUnidad()) &&
                Objects.equals(getIndicadorHabilitado(), that.getIndicadorHabilitado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdProductoProveedor(), getIdProducto(), getIdProveedor(), getValorUnidad(), getIndicadorHabilitado());
    }
}
