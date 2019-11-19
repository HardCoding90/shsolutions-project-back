package com.shsolutions.project.dominio.modelos;

import com.shsolutions.project.dominio.configuracion.LocalDateTimeConverter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "ventasproductos", catalog = "shsolutions")
public class VentasProductos implements Serializable {

    private Integer idVentaProducto;
    private Integer idVenta;
    private Integer idInventario;
    private Integer cantidadVendida;
    private Double valorVentaUnidad;
    private LocalDateTime fechaAgenda;
    private Boolean indicadorHabilitado;

    public VentasProductos() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdVentaProducto")
    public Integer getIdVentaProducto() {
        return idVentaProducto;
    }

    public void setIdVentaProducto(Integer idVentaProducto) {
        this.idVentaProducto = idVentaProducto;
    }

    @Basic
    @Column(name = "IdVenta")
    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    @Basic
    @Column(name = "IdInventario")
    public Integer getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(Integer idInventario) {
        this.idInventario = idInventario;
    }

    @Basic
    @Column(name = "CantidadVendida")
    public Integer getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(Integer cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    @Basic
    @Column(name = "ValorVentaUnidad", columnDefinition="decimal", precision=18, scale=3)
    public Double getValorVentaUnidad() {
        return valorVentaUnidad;
    }

    public void setValorVentaUnidad(Double valorVentaUnidad) {
        this.valorVentaUnidad = valorVentaUnidad;
    }

    @Basic
    @Convert(converter = LocalDateTimeConverter.class)
    @Column(name = "FechaAgenda")
    public LocalDateTime getFechaAgenda() {
        return fechaAgenda;
    }

    public void setFechaAgenda(LocalDateTime fechaAgenda) {
        this.fechaAgenda = fechaAgenda;
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
        VentasProductos that = (VentasProductos) o;
        return Objects.equals(getIdVentaProducto(), that.getIdVentaProducto()) &&
                Objects.equals(getIdVenta(), that.getIdVenta()) &&
                Objects.equals(getIdInventario(), that.getIdInventario()) &&
                Objects.equals(getCantidadVendida(), that.getCantidadVendida()) &&
                Objects.equals(getValorVentaUnidad(), that.getValorVentaUnidad()) &&
                Objects.equals(getFechaAgenda(), that.getFechaAgenda()) &&
                Objects.equals(getIndicadorHabilitado(), that.getIndicadorHabilitado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdVentaProducto(), getIdVenta(), getIdInventario(), getCantidadVendida(), getValorVentaUnidad(), getFechaAgenda(), getIndicadorHabilitado());
    }
}
