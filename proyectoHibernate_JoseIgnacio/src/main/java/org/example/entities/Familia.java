package org.example.entities;

public class Familia {

    /*
    * datos de la familia que acoge un animal (nombre, edad, ciudad).
    * */

    //atributos
    private String Nombre;
    private int Edad;
    private String Ciudad;

    //constrcutor vacio
    public Familia(){}

    //constructor con atributos


    public Familia(String nombre, int edad, String ciudad) {
        this.Nombre = nombre;
        this.Edad = edad;
        this.Ciudad = ciudad;
    }

    //getters y setters


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
