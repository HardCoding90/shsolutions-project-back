package com.shsolutions.project.dominio.modelos;

import com.shsolutions.project.dominio.configuracion.LocalDateConverter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "facturas", catalog = "shsolutions")
public class Facturas {

    private Integer idFactura;
    private Integer idVenta;
    private LocalDateTime fechaFactura;
    private Integer idIva;
    private Boolean indicadorPagada;
    private Boolean indicadorHabilitado;

    public Facturas() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdFactura")
    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
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
    @Convert(converter = LocalDateConverter.class)
    @Column(name = "FechaFactura")
    public LocalDateTime getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(LocalDateTime fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    @Basic
    @Column(name = "IdIva")
    public Integer getIdIva() {
        return idIva;
    }

    public void setIdIva(Integer idIva) {
        this.idIva = idIva;
    }

    @Basic
    @Column(name = "IndicadorPagada")
    public Boolean getIndicadorPagada() {
        return indicadorPagada;
    }

    public void setIndicadorPagada(Boolean indicadorPagada) {
        this.indicadorPagada = indicadorPagada;
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
        Facturas facturas = (Facturas) o;
        return Objects.equals(getIdFactura(), facturas.getIdFactura()) &&
                Objects.equals(getIdVenta(), facturas.getIdVenta()) &&
                Objects.equals(getFechaFactura(), facturas.getFechaFactura()) &&
                Objects.equals(getIdIva(), facturas.getIdIva()) &&
                Objects.equals(getIndicadorPagada(), facturas.getIndicadorPagada()) &&
                Objects.equals(getIndicadorHabilitado(), facturas.getIndicadorHabilitado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdFactura(), getIdVenta(), getFechaFactura(), getIdIva(), getIndicadorPagada(), getIndicadorHabilitado());
    }
}
