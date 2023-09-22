package space.unai;
/*
 * AUTHOR: UNAI MEDINA FERNÁNDEZ
 * CURSO: 2 DAM
 * FECHA: 21/09/2023
 */

import java.util.Scanner;

public class GestionAlumnos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("PROGRAMA DE GESTIÓN DE ALUMNOS");
        System.out.println();

        Notas notes = new Notas();

        while (true) {
            System.out.println("Introduce los datos del alumno:");
            System.out.print("Matrícula (0 para acabar): ");
            String matricula = scanner.nextLine();

            if (matricula.equals("0")) {
                break;
            }

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            Alumno alumno = new Alumno(matricula, nombre);

            int count = 1;
            while (true) {
                System.out.print("Nota " + count + " (<0 para acabar): ");
                int nota = Integer.parseInt(scanner.nextLine());

                if (nota <= 0) {
                    break;
                }

                alumno.insertarNota(nota);
                count++;
            }

            double mitjana = alumno.calcularMitjana();
            System.out.println("La media de las notas de " + alumno.getNombre() + " es de " + mitjana);
            System.out.println();

            notes.afegirAlumne(alumno);
        }

        System.out.println("FIN");
        System.out.println("Mediana de las notas:");
        notes.mostrarMitjanes();

        scanner.close();
    }
}
