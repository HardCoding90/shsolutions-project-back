package com.shsolutions.project.dominio.modelos;

import javax.persistence.*;

@Entity
@Table(name = "municipios", catalog = "shsolutions")
public class Municipios {
    private Integer idMunicipio;
    private Integer idDepartamento;
    private String codigo;
    private String ciudad;

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
    @Column(name = "Ciudad")
    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Municipios that = (Municipios) o;

        if (idMunicipio != null ? !idMunicipio.equals(that.idMunicipio) : that.idMunicipio != null) return false;
        if (idDepartamento != null ? !idDepartamento.equals(that.idDepartamento) : that.idDepartamento != null)
            return false;
        if (codigo != null ? !codigo.equals(that.codigo) : that.codigo != null) return false;
        if (ciudad != null ? !ciudad.equals(that.ciudad) : that.ciudad != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idMunicipio != null ? idMunicipio.hashCode() : 0;
        result = 31 * result + (idDepartamento != null ? idDepartamento.hashCode() : 0);
        result = 31 * result + (codigo != null ? codigo.hashCode() : 0);
        result = 31 * result + (ciudad != null ? ciudad.hashCode() : 0);
        return result;
    }
}
