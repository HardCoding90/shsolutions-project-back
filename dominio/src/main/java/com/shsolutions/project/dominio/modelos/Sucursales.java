package com.shsolutions.project.dominio.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "sucursales", catalog = "shsolutions")
public class Sucursales {

    private Integer idSucursal;
    private String email;
    private String telefono;
    private String celular;
    private String direccion;
    private String barrio;
    private Integer idMunicipio;
    private Boolean indicadorHabilitado;

    private Municipios municipios;
    private String municipio;

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
    @Column(name = "IndicadorHabilitado")
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Basic
    @Column(name = "Telefono")
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Basic
    @Column(name = "Celular")
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Basic
    @Column(name = "Direccion")
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Basic
    @Column(name = "Barrio")
    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    @Basic
    @Column(name = "IdMunicipio")
    public Integer getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    @Basic
    @Column(name = "Email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "IdMunicipio", referencedColumnName = "IdMunicipio", updatable = false, insertable = false)
    public Municipios getMunicipios() {
        return municipios;
    }

    public void setMunicipios(Municipios municipios) {
        this.municipios = municipios;
    }

    @Transient
    public String getMunicipio() {
        return municipios != null ? municipios.getMunicipio() : null;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sucursales that = (Sucursales) o;
        return Objects.equals(getIdSucursal(), that.getIdSucursal()) &&
                Objects.equals(getEmail(), that.getEmail()) &&
                Objects.equals(getTelefono(), that.getTelefono()) &&
                Objects.equals(getCelular(), that.getCelular()) &&
                Objects.equals(getDireccion(), that.getDireccion()) &&
                Objects.equals(getBarrio(), that.getBarrio()) &&
                Objects.equals(getIdMunicipio(), that.getIdMunicipio()) &&
                Objects.equals(getIndicadorHabilitado(), that.getIndicadorHabilitado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdSucursal(), getEmail(), getTelefono(), getCelular(), getDireccion(), getBarrio(), getIdMunicipio(), getIndicadorHabilitado());
    }
}
