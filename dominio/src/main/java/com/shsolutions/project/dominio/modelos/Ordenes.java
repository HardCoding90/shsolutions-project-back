package com.shsolutions.project.dominio.modelos;

import com.shsolutions.project.dominio.configuracion.LocalDateTimeConverter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "ordenes", catalog = "shsolutions")
public class Ordenes {

    private Integer idOrden;
    private Integer idBodega;
    private LocalDateTime fechaOrden;
    private Boolean indicadorRecibida;
    private Boolean indicadorHabilitado;

    public Ordenes() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdOrden")
    public Integer getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(Integer idOrden) {
        this.idOrden = idOrden;
    }

    @Basic
    @Column(name = "IdBodega")
    public Integer getIdBodega() {
        return idBodega;
    }

    public void setIdBodega(Integer idBodega) {
        this.idBodega = idBodega;
    }

    @Basic
    @Convert(converter = LocalDateTimeConverter.class)
    @Column(name = "FechaOrden")
    public LocalDateTime getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(LocalDateTime fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    @Basic
    @Column(name = "IndicadorRecibida")
    public Boolean getIndicadorRecibida() {
        return indicadorRecibida;
    }

    public void setIndicadorRecibida(Boolean indicadorRecibida) {
        this.indicadorRecibida = indicadorRecibida;
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
        Ordenes ordenes = (Ordenes) o;
        return Objects.equals(getIdOrden(), ordenes.getIdOrden()) &&
                Objects.equals(getIdBodega(), ordenes.getIdBodega()) &&
                Objects.equals(getFechaOrden(), ordenes.getFechaOrden()) &&
                Objects.equals(getIndicadorRecibida(), ordenes.getIndicadorRecibida()) &&
                Objects.equals(getIndicadorHabilitado(), ordenes.getIndicadorHabilitado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdOrden(), getIdBodega(), getFechaOrden(), getIndicadorRecibida(), getIndicadorHabilitado());
    }
}
