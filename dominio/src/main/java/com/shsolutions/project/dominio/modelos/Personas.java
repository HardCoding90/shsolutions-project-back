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
    private String genero;
    private LocalDate fechaNacimiento;
    private String numeroDocumento;
    private String email;
    private String telefono;
    private String celular;
    private String direccion;
    private String barrio;
    private Integer idMunicipio;
    private Boolean indicadorCliente;
    private LocalDateTime fechaRegistro;
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
    @Column(name = "Genero")
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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
    @Column(name = "IndicadorCliente")
    public Boolean getIndicadorCliente() {
        return indicadorCliente;
    }

    public void setIndicadorCliente(Boolean indicadorCliente) {
        this.indicadorCliente = indicadorCliente;
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
                Objects.equals(getGenero(), personas.getGenero()) &&
                Objects.equals(getFechaNacimiento(), personas.getFechaNacimiento()) &&
                Objects.equals(getNumeroDocumento(), personas.getNumeroDocumento()) &&
                Objects.equals(getEmail(), personas.getEmail()) &&
                Objects.equals(getTelefono(), personas.getTelefono()) &&
                Objects.equals(getCelular(), personas.getCelular()) &&
                Objects.equals(getDireccion(), personas.getDireccion()) &&
                Objects.equals(getBarrio(), personas.getBarrio()) &&
                Objects.equals(getIdMunicipio(), personas.getIdMunicipio()) &&
                Objects.equals(getIndicadorCliente(), personas.getIndicadorCliente()) &&
                Objects.equals(getFechaRegistro(), personas.getFechaRegistro()) &&
                Objects.equals(getIndicadorHabilitado(), personas.getIndicadorHabilitado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdPersona(), getPrimerNombre(), getSegundoNombre(), getPrimerApellido(), getSegundoApellido(), getGenero(), getFechaNacimiento(), getNumeroDocumento(), getEmail(), getTelefono(), getCelular(), getDireccion(), getBarrio(), getIdMunicipio(), getIndicadorCliente(), getFechaRegistro(), getIndicadorHabilitado());
    }
}
