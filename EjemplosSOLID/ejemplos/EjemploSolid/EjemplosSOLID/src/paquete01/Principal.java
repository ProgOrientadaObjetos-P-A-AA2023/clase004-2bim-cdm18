/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;

/**
 *
 * @author SALA I
 */
public class Principal {

    public static void main(String[] args) {
        Persona p1 = new Persona("Carlos Mejia", 10);
        Persona p2 = new Persona("Renata Maria", 18);

        ArrayList<Persona> lista = new ArrayList();

        lista.add(p1);
        lista.add(p2);

        double promedio = p1.promedioEdades(lista);

        System.out.printf("Persona 1: %d\n"
                + "Persona 2: %d\n"
                + "Promedio de edades: %.2f\n", p1.obtenerEdad(), p2.obtenerEdad(),
                promedio);

    }

}
