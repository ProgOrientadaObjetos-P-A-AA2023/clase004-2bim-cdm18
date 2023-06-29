/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {

    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    private int edadminima;
    private int edadMaxima;
    private String listaCiudadesEstudiantes;

    public void establecerEstudiante(ArrayList<Persona> lista) {
        estudiantes = lista;
    }

    public void establecerEdadMinima() {
        int aux = estudiantes.get(0).obtenerEdad();
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).obtenerEdad() < aux) {
                aux = estudiantes.get(i).obtenerEdad();

            }
        }
        edadminima = aux;
    }

    public void establecerEdadMaxima() {
        int aux = estudiantes.get(0).obtenerEdad();
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).obtenerEdad() > aux) {
                aux = estudiantes.get(i).obtenerEdad();

            }
        }
        edadMaxima = aux;

    }

    public ArrayList<Persona> obtenerEstudiante() {
        return estudiantes;
    }

    public void establecerPromedioEdades() {
        double suma = 0;
        for (Persona e : obtenerEstudiante()) {
            suma = suma + e.obtenerEdad();
        }
        promedioEdades = suma / obtenerEstudiante().size();
    }

    public void establecerListaCiudadesEstudiantes() {
        String mensaje = "";

        for (Persona e : estudiantes) {
            mensaje = String.format("%s%s\n", mensaje,
                    e.obtenerCiudad().obtenerNombreCiudad());
        }
        listaCiudadesEstudiantes = mensaje;
    }

    public String obtenerListaCiudadesEstudiantes() {
        return listaCiudadesEstudiantes;
    }

    public double obtenerPromedioEdades() {

        return promedioEdades;
    }

    public int obtenerEdadMinima() {
        return edadminima;
    }

    public int obtenerEdadMaxima() {
        return edadMaxima;
    }

}
