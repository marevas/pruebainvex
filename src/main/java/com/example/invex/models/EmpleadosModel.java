package com.example.invex.models;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "empleados")
public class EmpleadosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (unique = true, nullable = false)
    private Long id;

    private String primerNombre;
    private String segundoNombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;
    private String sexo;
    private LocalDate fechaNacimiento;
    private String puesto;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getPrimerNombre() {
        return primerNombre;
    }
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }
    public String getSegundoNombre() {
        return segundoNombre;
    }
    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

}
