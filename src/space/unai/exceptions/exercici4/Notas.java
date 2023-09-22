package space.unai;
/*
 * AUTHOR: UNAI MEDINA FERNÁNDEZ
 * CURSO: 2 DAM
 * FECHA: 21/09/2023
 */

import java.util.ArrayList;
import java.util.List;

public class Notas {

    private List<Alumno> alumnos;

    public Notas() {
        this.alumnos = new ArrayList<>();
    }

    public void afegirAlumne(Alumno alumne) {
        alumnos.add(alumne);
    }

    public void mostrarMitjanes() {
        for (Alumno alumne : alumnos) {
            double mitjana = alumne.calcularMitjana();
            System.out.println("La mitjana de les notes de " + alumne.getNombre() + " és de " + mitjana);
        }
    }
}