/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Persona> lista = new ArrayList();
        Ciudad c1 = new Ciudad("Loja");
        Ciudad c2 = new Ciudad("Quito");

        Persona p1 = new Persona("Carlos Mejia", 10, c1);
        lista.add(p1);
        Persona p2 = new Persona("Renata Maria", 25, c2);
        lista.add(p2);

        OperacionesEstudiantes op1 = new OperacionesEstudiantes();
        op1.establecerEstudiante(lista);
        op1.establecerPromedioEdades();

        op1.establecerEdadMinima();
        op1.establecerEdadMaxima();
        op1.establecerListaCiudadesEstudiantes();
        System.out.printf("Promedio edades: %.2f\n"
                + "Edad minima: %d\n"
                + "Edad maxima: %d\n\n"
                + "Las ciudades son: \n%s", op1.obtenerPromedioEdades(),
                op1.obtenerEdadMinima(), op1.obtenerEdadMaxima(),
                op1.obtenerListaCiudadesEstudiantes());

    }
}
