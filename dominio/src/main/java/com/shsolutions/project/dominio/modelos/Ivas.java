package com.shsolutions.project.dominio.modelos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ivas", catalog = "shsolutions")
public class Ivas {

    private Integer idIva;
    private Double valorPorcentaje;
    private Boolean indicadorHabilitado;

    public Ivas() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdIva")
    public Integer getIdIva() {
        return idIva;
    }

    public void setIdIva(Integer idIva) {
        this.idIva = idIva;
    }

    @Basic
    @Column(name = "ValorPorcentaje")
    public Double getValorPorcentaje() {
        return valorPorcentaje;
    }

    public void setValorPorcentaje(Double valorPorcentaje) {
        this.valorPorcentaje = valorPorcentaje;
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
        Ivas ivas = (Ivas) o;
        return Objects.equals(getIdIva(), ivas.getIdIva()) &&
                Objects.equals(getValorPorcentaje(), ivas.getValorPorcentaje()) &&
                Objects.equals(getIndicadorHabilitado(), ivas.getIndicadorHabilitado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdIva(), getValorPorcentaje(), getIndicadorHabilitado());
    }
}
