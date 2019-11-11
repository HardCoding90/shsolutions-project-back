package com.shsolutions.project.dominio.modelos;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "roles", catalog = "shsolutions")
public class Roles implements Serializable {

    private Integer idRol;
    private String codigo;
    private String rol;
    private Boolean indicadorHabilitado;
    private Boolean indicadorAdministrativo;

    public Roles() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdRol")
    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    @Basic
    @Column(name = "Codigo")
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Basic
    @Column(name = "Rol")
    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Basic
    @Column(name = "IndicadorHabilitado")
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Basic
    @Column(name = "IndicadorAdministrativo")
    public Boolean getIndicadorAdministrativo() {
        return indicadorAdministrativo;
    }

    public void setIndicadorAdministrativo(Boolean indicadorAdministrativo) {
        this.indicadorAdministrativo = indicadorAdministrativo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Roles roles = (Roles) o;
        return Objects.equals(getIdRol(), roles.getIdRol()) &&
                Objects.equals(getCodigo(), roles.getCodigo()) &&
                Objects.equals(getRol(), roles.getRol()) &&
                Objects.equals(getIndicadorHabilitado(), roles.getIndicadorHabilitado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdRol(), getCodigo(), getRol(), getIndicadorHabilitado());
    }
}
