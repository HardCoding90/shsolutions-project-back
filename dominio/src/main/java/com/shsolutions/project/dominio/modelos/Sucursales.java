package com.shsolutions.project.dominio.modelos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "sucursales", catalog = "shsolutions")
public class Sucursales {

    private Integer idSucursal;
    private Integer idDireccion;
    private Boolean indicadorHabilitado;

    public Sucursales() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdSucursal")
    public Integer getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Integer idSucursal) {
        this.idSucursal = idSucursal;
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
        Sucursales that = (Sucursales) o;
        return Objects.equals(getIdSucursal(), that.getIdSucursal()) &&
                Objects.equals(getIdDireccion(), that.getIdDireccion()) &&
                Objects.equals(getIndicadorHabilitado(), that.getIndicadorHabilitado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdSucursal(), getIdDireccion(), getIndicadorHabilitado());
    }
}
