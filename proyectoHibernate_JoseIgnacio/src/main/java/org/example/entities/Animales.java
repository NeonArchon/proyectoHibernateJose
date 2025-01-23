package org.example.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Animales implements Serializable {

    /**
     * Tenemos un refugio de animales perdidos de todo tipo: Perros, gatos, pájaritos, cerdos vietnamitas, serpientes y camaleones y... ¡hasta arañas!
     * Cada animal tiene un nombre, especie, edad y una descripción de cómo se perdió
     *
     */

    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int Id;
    private String NombreAnimal;

    //HAY QUE PASAR EL ENUM A UN STRING
    private enum Especie{
        Perro, Gato, Pajaro, Cerdo, Serpiente, Lagarto, Tortuga, Anfibio, Aracnido
    }
    private String Especie;

    //HAY QUE PASAR EL ENUM A UN STRING
    private enum estado{
        abandonado, refiguado, acogido
    }
    private String estado;


    private int Edad;
    private String descripcion;

    //constructor vacio
    public Animales(){}

    //constructor con los atributos

    public Animales(int id, String nombreAnimal, String especie, String estado, int edad, String descripcion) {
        this.Id = id;
        this.NombreAnimal = nombreAnimal;
        Especie = especie;
        this.estado = estado;
        this.Edad = edad;
        this.descripcion = descripcion;
    }

    //getters y setters


    public String getEspecie() {
        return Especie;
    }

    public void setEspecie(String especie) {
        Especie = especie;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
