package es.ieslosmontecillos.AppAgendaBE.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="PERSONA")
public class Persona  implements Serializable{

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Basic
    @Column(name = "NOMBRE", nullable = false, length = 20)
    private String nombre;

    @Basic
    @Column(name = "APELLIDOS", nullable = false, length = 40)
    private String apellidos;

    @Basic
    @Column(name = "TELEFONO", length = 15)
    private String telefono;

    @Basic
    @Column(name = "EMAIL", length = 30)
    private String email;

    @Basic
    @Column(name = "PROVINCIA", nullable = false)
    private Integer provincia;

    @Basic
    @Column(name = "FECHA_NACIMIENTO")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;

    @Basic
    @Column(name = "NUM_HIJOS")
    private Short numHijos;

    @Basic
    @Column(name = "ESTADO_CIVIL", length = 1)
    private Character estadoCivil;

    @Basic
    @Column(name = "SALARIO", precision = 9, scale = 2)
    private Double salario;

    @Basic
    @Column(name = "JUBILADO")
    private Boolean jubilado;

    @Basic
    @Column(name = "FOTO", length = 30)
    private String foto;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(id, persona.id) &&
                Objects.equals(nombre, persona.nombre) &&
                Objects.equals(apellidos, persona.apellidos) &&
                Objects.equals(telefono, persona.telefono) &&
                Objects.equals(email, persona.email) &&
                Objects.equals(provincia, persona.provincia) &&
                Objects.equals(fechaNacimiento, persona.fechaNacimiento) &&
                Objects.equals(numHijos, persona.numHijos) &&
                Objects.equals(estadoCivil, persona.estadoCivil) &&
                Objects.equals(salario, persona.salario) &&
                Objects.equals(jubilado, persona.jubilado) &&
                Objects.equals(foto, persona.foto);
    }


    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getProvincia() {
        return provincia;
    }

    public void setProvincia(Integer provincia) {
        this.provincia = provincia;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Short getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(Short numHijos) {
        this.numHijos = numHijos;
    }

    public Character getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(Character estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Boolean getJubilado() {
        return jubilado;
    }

    public void setJubilado(Boolean jubilado) {
        this.jubilado = jubilado;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellidos, telefono, email, provincia, fechaNacimiento, numHijos, estadoCivil, salario, jubilado, foto);
    }


}
