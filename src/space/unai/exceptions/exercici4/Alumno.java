package space.unai;
/*
 * AUTHOR: UNAI MEDINA FERNÁNDEZ
 * CURSO: 2 DAM
 * FECHA: 21/09/2023
 */

import java.util.ArrayList;
import java.util.List;


public class Alumno {

    private String matricula;
    private String nombre;
    private List<Integer> notas;

    public Alumno(String matricula, String nombre) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.notas = new ArrayList<>(8);
    }

    public void insertarNota(int nota) {
        notas.add(nota);
    }

    public double calcularMitjana() {
        if (notas.isEmpty()) {
            return 0.0;
        }

        int suma = 0;
        for (int nota : notas) {
            suma += nota;
        }

        return (double) suma / notas.size();
    }

    public String getNombre() {
        return nombre;
    }
}