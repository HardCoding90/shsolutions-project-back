package com.shsolutions.project.negocio.modelos;

public class Roles {

    private Integer idRol;
    private String codigo;
    private String rol;
    private Boolean indicadorAdministrativo;
    private Boolean indicadorHabilitado;

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    public Boolean getIndicadorAdministrativo() {
        return indicadorAdministrativo;
    }

    public void setIndicadorAdministrativo(Boolean indicadorAdministrativo) {
        this.indicadorAdministrativo = indicadorAdministrativo;
    }
}
