package com.shsolutions.project.dominio.modelos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "direccionespersonas", catalog = "shsolutions")
public class DireccionesPersonas {

    private Integer idDireccionPersona;
    private Integer idDireccion;
    private Integer idPersona;
    private Boolean indicadorPrincipal;
    private Boolean indicadorHabilitado;

    public DireccionesPersonas() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdDireccionPersona")
    public Integer getIdDireccionPersona() {
        return idDireccionPersona;
    }

    public void setIdDireccionPersona(Integer idDireccionPersona) {
        this.idDireccionPersona = idDireccionPersona;
    }

    @Basic
    @Column(name = "IdDireccion")
    public Integer getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Integer idDireccion) {
        this.idDireccion = idDireccion;
    }

    @Basic
    @Column(name = "IdPersona")
    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    @Basic
    @Column(name = "IndicadorPrincipal")
    public Boolean getIndicadorPrincipal() {
        return indicadorPrincipal;
    }

    public void setIndicadorPrincipal(Boolean indicadorPrincipal) {
        this.indicadorPrincipal = indicadorPrincipal;
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
        DireccionesPersonas that = (DireccionesPersonas) o;
        return Objects.equals(getIdDireccionPersona(), that.getIdDireccionPersona()) &&
                Objects.equals(getIdDireccion(), that.getIdDireccion()) &&
                Objects.equals(getIdPersona(), that.getIdPersona()) &&
                Objects.equals(getIndicadorPrincipal(), that.getIndicadorPrincipal()) &&
                Objects.equals(getIndicadorHabilitado(), that.getIndicadorHabilitado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdDireccionPersona(), getIdDireccion(), getIdPersona(), getIndicadorPrincipal(), getIndicadorHabilitado());
    }
}
