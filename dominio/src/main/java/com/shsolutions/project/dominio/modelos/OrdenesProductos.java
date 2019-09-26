package com.shsolutions.project.dominio.modelos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ordenesproductos", catalog = "shsolutions")
public class OrdenesProductos {

    private Integer idOrdenProducto;
    private Integer idProductoProveedor;
    private Integer idOrden;
    private Double valorCompraUnidad;
    private Integer cantidad;
    private Boolean indicadorHabilitado;

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
    public Double getValorCompraUnidad() {
        return valorCompraUnidad;
    }

    public void setValorCompraUnidad(Double valorCompraUnidad) {
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
