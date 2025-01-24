package org.example.DAO;

import org.example.entities.Estado;
import org.example.entities.Familia;
import org.example.entities.Animales;
import org.example.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class AnimalesImpDao implements AnimalesDAO {

    /*registrar nuevo animal
    ingresar nombre, especie, edad, y descripcion,
    estado es automaticamente puesto en recien abandonado
    * */


    @Override
    public Animales create(AnimalesImpDao Animales) {
        return null;
    }

    @Override
    public Animales create(Animales Animales) {
        //inicio de sesion
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        Animales nuevoAnimal = new Animales();
        //  nuevoAnimal.setId(id);
        nuevoAnimal.setNombreAnimal(nombreAnimal);
        nuevoAnimal.setEspecie(especie);
        nuevoAnimal.setEdad(edad);
        nuevoAnimal.setDescripcion(descripcion);


        Animales.setEstado(Estado.Recien_Abandonado);

        session.save(Animales);

        session.getTransaction().commit();

        return null;
    }


    /*
    buscar animal por especie
    Se elije una especie de animal y muesar todos los animales
    de esa especie
    * */
    @Override
    public List<AnimalesImpDao> findByEspecie(String Especie) {



        return null;
    }

    /*
    Actualizar el estado del animal
    * */

    @Override
    public AnimalesImpDao update(AnimalesImpDao Estado) {



        return null;
    }

    @Override
    public Familia create(Familia Familia) {




        return null;
    }




}

