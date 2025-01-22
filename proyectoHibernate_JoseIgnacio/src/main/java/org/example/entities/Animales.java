package org.example.entities;

public class Animales {

    /**
     * Tenemos un refugio de animales perdidos de todo tipo: Perros, gatos, pájaritos, cerdos vietnamitas, serpientes y camaleones y... ¡hasta arañas!
     * Cada animal tiene un nombre, especie, edad y una descripción de cómo se perdió
     *
     */

    //atributos

    private String NombreAnimal;
    private enum Especie{
        Perro, Gato, Pajaro, Cerdo, Serpiente, Lagarto, Tortuga, Anfibio, Aracnido
    }
    private int Edad;
    private String descripcion;

    //constructor vacio
    public Animales(){}

    //constructor con los atributos

    public Animales(String nombreAnimal, int edad, String descripcion) {
        this.NombreAnimal = nombreAnimal;
        this.Edad = edad;
        this.descripcion = descripcion;
    }

    //getters y setters
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
