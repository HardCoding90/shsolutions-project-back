package com.shsolutions.project.negocio.modelos;

public class TelefonosPersonas {

    private Integer idTelefonoPersona;
    private Integer idTelefono;
    private Integer idPersona;
    private Boolean indicadorPrincipal;
    private Boolean indicadorHabilitado;

    public Integer getIdTelefonoPersona() {
        return idTelefonoPersona;
    }

    public void setIdTelefonoPersona(Integer idTelefonoPersona) {
        this.idTelefonoPersona = idTelefonoPersona;
    }

    public Integer getIdTelefono() {
        return idTelefono;
    }

    public void setIdTelefono(Integer idTelefono) {
        this.idTelefono = idTelefono;
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
