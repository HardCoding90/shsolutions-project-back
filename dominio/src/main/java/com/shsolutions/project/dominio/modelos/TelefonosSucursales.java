package com.shsolutions.project.dominio.modelos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "telefonossucursales", catalog = "shsolutions")
public class TelefonosSucursales {

    private Integer idTelefonoSucursal;
    private Integer idTelefono;
    private Integer idSucursal;
    private Boolean indicadorPrincipal;
    private Boolean indicadorHabilitado;

    public TelefonosSucursales() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTelefonoSucursal")
    public Integer getIdTelefonoSucursal() {
        return idTelefonoSucursal;
    }

    public void setIdTelefonoSucursal(Integer idTelefonoSucursal) {
        this.idTelefonoSucursal = idTelefonoSucursal;
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
    @Column(name = "IdSucursal")
    public Integer getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Integer idSucursal) {
        this.idSucursal = idSucursal;
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
        TelefonosSucursales that = (TelefonosSucursales) o;
        return Objects.equals(getIdTelefonoSucursal(), that.getIdTelefonoSucursal()) &&
                Objects.equals(getIdTelefono(), that.getIdTelefono()) &&
                Objects.equals(getIdSucursal(), that.getIdSucursal()) &&
                Objects.equals(getIndicadorPrincipal(), that.getIndicadorPrincipal()) &&
                Objects.equals(getIndicadorHabilitado(), that.getIndicadorHabilitado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdTelefonoSucursal(), getIdTelefono(), getIdSucursal(), getIndicadorPrincipal(), getIndicadorHabilitado());
    }
}
