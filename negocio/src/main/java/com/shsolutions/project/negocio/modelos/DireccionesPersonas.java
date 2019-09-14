package com.shsolutions.project.negocio.modelos;

public class DireccionesPersonas {

    private Integer idDireccionPersona;
    private Integer idDireccion;
    private Integer idPersona;
    private Boolean indicadorPrincipal;
    private Boolean indicadorHabilitado;

    public DireccionesPersonas() {
    }

    public Integer getIdDireccionPersona() {
        return idDireccionPersona;
    }

    public void setIdDireccionPersona(Integer idDireccionPersona) {
        this.idDireccionPersona = idDireccionPersona;
    }

    public Integer getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Integer idDireccion) {
        this.idDireccion = idDireccion;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public Boolean getIndicadorPrincipal() {
        return indicadorPrincipal;
    }

    public void setIndicadorPrincipal(Boolean indicadorPrincipal) {
        this.indicadorPrincipal = indicadorPrincipal;
    }

    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }
}
