package com.shsolutions.project.dominio.modelos;

import javax.persistence.*;

@Entity
@Table(name = "departamentos", catalog = "shsolutions")
public class Departamentos {
    private Integer idDepartamento;
    private Integer idPais;
    private String codigo;
    private String departamento;

    public Departamentos() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdDepartamento")
    public Integer getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Integer idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    @Basic
    @Column(name = "IdPais")
    public Integer getIdPais() {
        return idPais;
    }

    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
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
    @Column(name = "Departamento")
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Departamentos that = (Departamentos) o;

        if (idDepartamento != null ? !idDepartamento.equals(that.idDepartamento) : that.idDepartamento != null)
            return false;
        if (idPais != null ? !idPais.equals(that.idPais) : that.idPais != null) return false;
        if (codigo != null ? !codigo.equals(that.codigo) : that.codigo != null) return false;
        if (departamento != null ? !departamento.equals(that.departamento) : that.departamento != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idDepartamento != null ? idDepartamento.hashCode() : 0;
        result = 31 * result + (idPais != null ? idPais.hashCode() : 0);
        result = 31 * result + (codigo != null ? codigo.hashCode() : 0);
        result = 31 * result + (departamento != null ? departamento.hashCode() : 0);
        return result;
    }
}
