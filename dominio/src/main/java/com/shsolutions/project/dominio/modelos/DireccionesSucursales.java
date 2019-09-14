package com.shsolutions.project.dominio.modelos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "direccionessucursales", catalog = "shsolutions")
public class DireccionesSucursales {

    private Integer idDireccionSucursal;
    private Integer idDireccion;
    private Integer idSucursal;
    private Boolean indicadorPrincipal;
    private Boolean indicadorHabilitado;

    public DireccionesSucursales() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdDireccionSucursal")
    public Integer getIdDireccionSucursal() {
        return idDireccionSucursal;
    }

    public void setIdDireccionSucursal(Integer idDireccionSucursal) {
        this.idDireccionSucursal = idDireccionSucursal;
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
        DireccionesSucursales that = (DireccionesSucursales) o;
        return Objects.equals(getIdDireccionSucursal(), that.getIdDireccionSucursal()) &&
                Objects.equals(getIdDireccion(), that.getIdDireccion()) &&
                Objects.equals(getIdSucursal(), that.getIdSucursal()) &&
                Objects.equals(getIndicadorPrincipal(), that.getIndicadorPrincipal()) &&
                Objects.equals(getIndicadorHabilitado(), that.getIndicadorHabilitado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdDireccionSucursal(), getIdDireccion(), getIdSucursal(), getIndicadorPrincipal(), getIndicadorHabilitado());
    }
}
