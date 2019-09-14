package com.shsolutions.project.negocio.modelos;

public class DireccionesProveedores {

    private Integer idDireccionProveedor;
    private Integer idDireccion;
    private Integer idProveedor;
    private Boolean indicadorPrincipal;
    private Boolean indicadorHabilitado;

    public Integer getIdDireccionProveedor() {
        return idDireccionProveedor;
    }

    public void setIdDireccionProveedor(Integer idDireccionProveedor) {
        this.idDireccionProveedor = idDireccionProveedor;
    }

    public Integer getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Integer idDireccion) {
        this.idDireccion = idDireccion;
    }

    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
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
