package org.example.DAO;

import org.example.entities.Animales;
import org.example.entities.Familia;

import java.util.List;

public interface AnimalesDAO {

        /*
    *     List<persona> findAll();

    //@return devuelve un empleado por un id concreto
     persona findById(Integer id);

     //@return devuelve más de un empleado por nombre
    List<persona> findByNombre(String nombre);

    // Inserta un nuevo registro
    persona create(persona persona);

    // Actualizar
    persona  update (persona persona);

    *
    * */

    //crear animal
    Animales create(AnimalesImpDao Animales);

    //buscar animal por especia

    Animales create(Animales Animales);

    List<AnimalesImpDao> findByEspecie(String Especie);

    //Actualizar estado del animal
    AnimalesImpDao update(AnimalesImpDao Estado);
    //datos de familiaça
    Familia create (Familia Familia);

}
