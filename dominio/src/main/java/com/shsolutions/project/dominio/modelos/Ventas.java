package com.shsolutions.project.dominio.modelos;

import com.shsolutions.project.dominio.configuracion.LocalDateTimeConverter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "ventas", catalog = "shsolutions")
public class Ventas implements Serializable {

    private Integer idVenta;
    private Integer idSucursal;
    private Integer idPersonaVenta;
    private LocalDateTime fechaVenta;
    private Boolean indicadorHabilitado;

    public Ventas() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdVenta")
    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
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
    @Column(name = "IdPersonaVenta")
    public Integer getIdPersonaVenta() {
        return idPersonaVenta;
    }

    public void setIdPersonaVenta(Integer idPersonaVenta) {
        this.idPersonaVenta = idPersonaVenta;
    }

    @Basic
    @Convert(converter = LocalDateTimeConverter.class)
    @Column(name = "FechaVenta")
    public LocalDateTime getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDateTime fechaVenta) {
        this.fechaVenta = fechaVenta;
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
        Ventas ventas = (Ventas) o;
        return Objects.equals(getIdVenta(), ventas.getIdVenta()) &&
                Objects.equals(getIdSucursal(), ventas.getIdSucursal()) &&
                Objects.equals(getIdPersonaVenta(), ventas.getIdPersonaVenta()) &&
                Objects.equals(getFechaVenta(), ventas.getFechaVenta()) &&
                Objects.equals(getIndicadorHabilitado(), ventas.getIndicadorHabilitado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdVenta(), getIdSucursal(), getIdPersonaVenta(), getFechaVenta(), getIndicadorHabilitado());
    }
}
