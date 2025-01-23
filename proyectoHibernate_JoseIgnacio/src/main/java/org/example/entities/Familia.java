package org.example.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Familia implements Serializable {

    /*
    * datos de la familia que acoge un animal (nombre, edad, ciudad).
    * */

    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int Id;
    private String Nombre;


    private int Edad;

    private String Ciudad;

    //constrcutor vacio
    public Familia(){}

    //constructor con atributos


    public Familia(int id, String nombre, int edad, String ciudad) {
        Id = id;
        this.Nombre = nombre;
        this.Edad = edad;
        this.Ciudad = ciudad;
    }

    //getters y setters


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }
}
