package org.example.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Animales implements Serializable {

    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int Id;
    private String NombreAnimal;

    //HAY QUE PASAR EL ENUM A UN STRING

    @Enumerated(EnumType.STRING)
    private Especie Especie;

    @Enumerated(EnumType.STRING)
    private Estado Estado;

    private int Edad;
    private String descripcion;

    //constructor vacio
    public Animales(){}

    //constructor con los atributos

    public Animales(int id, String nombreAnimal, Especie especie, Estado estado, int edad, String descripcion) {
        this.Id = id;
        this.NombreAnimal = nombreAnimal;
        this.Especie = especie;
        this.Estado = estado;
        this.Edad = edad;
        this.descripcion = descripcion;
    }

    //getters y setters


    public Especie getEspecie() {
        return Especie;
    }

    public void setEspecie(Especie especie) {
        Especie = especie;
    }

    public Estado getEstado() {
        return Estado;
    }

    public void setEstado(Estado estado) {
        this.Estado = estado;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombreAnimal() {
        return NombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        NombreAnimal = nombreAnimal;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
