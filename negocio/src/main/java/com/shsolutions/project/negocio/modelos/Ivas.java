package com.shsolutions.project.negocio.modelos;

import java.math.BigDecimal;
import java.util.Objects;

public class Ivas {

    private Integer idIva;
    private BigDecimal valorPorcentaje;
    private Boolean indicadorHabilitado;

    public Integer getIdIva() {
        return idIva;
    }

    public void setIdIva(Integer idIva) {
        this.idIva = idIva;
    }

    public BigDecimal getValorPorcentaje() {
        return valorPorcentaje;
    }

    public void setValorPorcentaje(BigDecimal valorPorcentaje) {
        this.valorPorcentaje = valorPorcentaje;
    }

    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }
}
