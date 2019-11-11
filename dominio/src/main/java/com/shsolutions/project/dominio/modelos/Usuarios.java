package com.shsolutions.project.dominio.modelos;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "usuarios", catalog = "shsolutions")
public class Usuarios implements Serializable {

    private Integer idUsuario;
    private String usuario;
    private String contrasenia;
    private Integer idPersona;
    private Integer idSucursal;
    private Boolean indicadorNuevo;
    private Boolean indicadorHabilitado;

    public Usuarios() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdUsuario")
    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Basic
    @Column(name = "Usuario")
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Basic
    @Column(name = "Contrasenia")
    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
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
    @Column(name = "IdSucursal")
    public Integer getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Integer idSucursal) {
        this.idSucursal = idSucursal;
    }

    @Basic
    @Column(name = "IndicadorNuevo")
    public Boolean getIndicadorNuevo() {
        return indicadorNuevo;
    }

    public void setIndicadorNuevo(Boolean indicadorNuevo) {
        this.indicadorNuevo = indicadorNuevo;
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
        Usuarios usuarios = (Usuarios) o;
        return Objects.equals(getIdUsuario(), usuarios.getIdUsuario()) &&
                Objects.equals(getUsuario(), usuarios.getUsuario()) &&
                Objects.equals(getContrasenia(), usuarios.getContrasenia()) &&
                Objects.equals(getIdPersona(), usuarios.getIdPersona()) &&
                Objects.equals(getIndicadorHabilitado(), usuarios.getIndicadorHabilitado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdUsuario(), getUsuario(), getContrasenia(), getIdPersona(), getIndicadorHabilitado());
    }
}
