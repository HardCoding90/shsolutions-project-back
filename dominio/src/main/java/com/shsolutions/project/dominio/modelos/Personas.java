package com.shsolutions.project.dominio.modelos;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "personas", catalog = "shsolutions")
public class Personas {

    private Integer idPersona;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private Integer idGenero;
    private LocalDate fechaNacimiento;
    private Integer idTipoDocumento;
    private String numeroDocumento;
    private String email;
    private LocalDateTime fechaRegistro;
    private Boolean indicadorAdministrativo;
    private Boolean indicadorHabilitado;

    public Personas() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPersona")
    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    @Basic
    @Column(name = "PrimerNombre")
    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    @Basic
    @Column(name = "SegundoNombre")
    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    @Basic
    @Column(name = "PrimerApellido")
    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    @Basic
    @Column(name = "SegundoApellido")
    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    @Basic
    @Column(name = "IdGenero")
    public Integer getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Integer idGenero) {
        this.idGenero = idGenero;
    }

    @Basic
    @Column(name = "FechaNacimiento")
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Basic
    @Column(name = "IdTipoDocumento")
    public Integer getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(Integer idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    @Basic
    @Column(name = "NumeroDocumento")
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    @Basic
    @Column(name = "Email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "FechaRegistro")
    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Basic
    @Column(name = "IndicadorAdministrativo")
    public Boolean getIndicadorAdministrativo() {
        return indicadorAdministrativo;
    }

    public void setIndicadorAdministrativo(Boolean indicadorAdministrativo) {
        this.indicadorAdministrativo = indicadorAdministrativo;
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
        Personas personas = (Personas) o;
        return Objects.equals(getIdPersona(), personas.getIdPersona()) &&
                Objects.equals(getPrimerNombre(), personas.getPrimerNombre()) &&
                Objects.equals(getSegundoNombre(), personas.getSegundoNombre()) &&
                Objects.equals(getPrimerApellido(), personas.getPrimerApellido()) &&
                Objects.equals(getSegundoApellido(), personas.getSegundoApellido()) &&
                Objects.equals(getIdGenero(), personas.getIdGenero()) &&
                Objects.equals(getFechaNacimiento(), personas.getFechaNacimiento()) &&
                Objects.equals(getIdTipoDocumento(), personas.getIdTipoDocumento()) &&
                Objects.equals(getNumeroDocumento(), personas.getNumeroDocumento()) &&
                Objects.equals(getEmail(), personas.getEmail()) &&
                Objects.equals(getFechaRegistro(), personas.getFechaRegistro()) &&
                Objects.equals(getIndicadorAdministrativo(), personas.getIndicadorAdministrativo()) &&
                Objects.equals(getIndicadorHabilitado(), personas.getIndicadorHabilitado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdPersona(), getPrimerNombre(), getSegundoNombre(), getPrimerApellido(), getSegundoApellido(), getIdGenero(), getFechaNacimiento(), getIdTipoDocumento(), getNumeroDocumento(), getEmail(), getFechaRegistro(), getIndicadorAdministrativo(), getIndicadorHabilitado());
    }
}
