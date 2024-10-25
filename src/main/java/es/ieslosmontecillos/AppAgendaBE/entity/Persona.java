package es.ieslosmontecillos.AppAgendaBE.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="PERSONA")
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private long id;

    @Column(name = "NOMBRE", nullable = false, length = 20)
    private String nombre;

    @Column(name = "APELLIDOS", nullable = false, length = 40)
    private String apellidos;

    @Column(name = "TELEFONO", length = 15)
    private String telefono;

    @Column(name = "EMAIL", length = 30)
    private String email;

    @ManyToOne
    @JoinColumn(name = "PROVINCIA", nullable = false)
    private Provincia provincia;

    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_NACIMIENTO")
    private Date fechaNacimiento;

    @Column(name = "NUM_HIJOS")
    private short numHijos;

    @Column(name = "ESTADO_CIVIL", length = 1)
    private char estadoCivil;

    @Column(name = "SALARIO", precision = 9, scale = 2)
    private double salario;

    @Column(name = "JUBILADO")
    private byte jubilado;

    @Column(name = "FOTO", length = 30)
    private String foto;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o;
        return id == persona.id &&
                numHijos == persona.numHijos &&
                estadoCivil == persona.estadoCivil &&
                Double.compare(persona.salario, salario) == 0 &&
                jubilado == persona.jubilado &&
                Objects.equals(nombre, persona.nombre) &&
                Objects.equals(apellidos, persona.apellidos) &&
                Objects.equals(telefono, persona.telefono) &&
                Objects.equals(email, persona.email) &&
                Objects.equals(provincia, persona.provincia) &&
                Objects.equals(fechaNacimiento, persona.fechaNacimiento) &&
                Objects.equals(foto, persona.foto);
    }


    public long getId() {
        return id;
    }
    public void setId(long id) {
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
    public Provincia getProvincia() {
        return provincia;
    }
    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public short getNumHijos() {
        return numHijos;
    }
    public void setNumHijos(short numHijos) {
        this.numHijos = numHijos;
    }
    public char getEstadoCivil() {
        return estadoCivil;
    }
    public void setEstadoCivil(char estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public byte getJubilado() {
        return jubilado;
    }
    public void setJubilado(byte jubilado) {
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
