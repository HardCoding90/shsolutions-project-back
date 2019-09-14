package com.shsolutions.project.dominio.modelos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "telefonospersonas", catalog = "shsolutions")
public class TelefonosPersonas {

    private Integer idTelefonoPersona;
    private Integer idTelefono;
    private Integer idPersona;
    private Boolean indicadorPrincipal;
    private Boolean indicadorHabilitado;

    public TelefonosPersonas() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTelefonoPersona")
    public Integer getIdTelefonoPersona() {
        return idTelefonoPersona;
    }

    public void setIdTelefonoPersona(Integer idTelefonoPersona) {
        this.idTelefonoPersona = idTelefonoPersona;
    }

    @Basic
    @Column(name = "IdTelefono")
    public Integer getIdTelefono() {
        return idTelefono;
    }

    public void setIdTelefono(Integer idTelefono) {
        this.idTelefono = idTelefono;
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
        TelefonosPersonas that = (TelefonosPersonas) o;
        return Objects.equals(getIdTelefonoPersona(), that.getIdTelefonoPersona()) &&
                Objects.equals(getIdTelefono(), that.getIdTelefono()) &&
                Objects.equals(getIdPersona(), that.getIdPersona()) &&
                Objects.equals(getIndicadorPrincipal(), that.getIndicadorPrincipal()) &&
                Objects.equals(getIndicadorHabilitado(), that.getIndicadorHabilitado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdTelefonoPersona(), getIdTelefono(), getIdPersona(), getIndicadorPrincipal(), getIndicadorHabilitado());
    }
}
