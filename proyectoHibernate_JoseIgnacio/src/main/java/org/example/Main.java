package org.example;

import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);

        int op = 0;

        System.out.println("Hello world!");


        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        //System.out.println("");

        System.out.println("Bienvenido al Refugio de animales");
        System.out.println("Elija una opcion");

        op = S.nextInt();

        switch (op){

            case 1:
                System.out.println("Registrar animal");
                break;
            case 2:
                System.out.println("Buscar animal por especia");
                break;
            case 3:
                System.out.println("Actualizar estado del animal");
                break;
            case 4:
                System.out.println("Añadir datos de la familia que acoje el animal");
                break;
            case 5:
                System.out.println("Saliendo");
                break;
            default:

                break;
            
        } while (op !=5);

    }
}