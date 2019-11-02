package com.shsolutions.project.dominio.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "municipios", catalog = "shsolutions")
public class Municipios {
    private Integer idMunicipio;
    private Integer idDepartamento;
    private String codigo;
    private String municipio;
    private Boolean indicadorHabilitado;

    private Departamentos departamentos;

    public Municipios() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdMunicipio")
    public Integer getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    @Basic
    @Column(name = "IdDepartamento")
    public Integer getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Integer idDepartamento) {
        this.idDepartamento = idDepartamento;
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
    @Column(name = "Municipio")
    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    @Basic
    @Column(name = "IndicadorHabilitado")
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "IdDepartamento", foreignKey = @ForeignKey(name = "IdDepartamento"), updatable = false, insertable = false)
    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Municipios that = (Municipios) o;
        return Objects.equals(getIdMunicipio(), that.getIdMunicipio()) &&
                Objects.equals(getIdDepartamento(), that.getIdDepartamento()) &&
                Objects.equals(getCodigo(), that.getCodigo()) &&
                Objects.equals(getMunicipio(), that.getMunicipio()) &&
                Objects.equals(getIndicadorHabilitado(), that.getIndicadorHabilitado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdMunicipio(), getIdDepartamento(), getCodigo(), getMunicipio(), getIndicadorHabilitado());
    }
}
