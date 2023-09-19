package space.unai.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("[>] Introdueix el dividend: ");
                String d1 = scanner.nextLine(); // Leemos en STRING


                System.out.print("[>] Introdueix el divisor: ");
                String d2 = scanner.nextLine(); // Leemos en STRING

                if (d1.contains(" ") || d2.contains(" ")) { // Si el número contiene espacio throwea exception
                    throw new IllegalArgumentException("[!] El número no pot ser un espai!");
                } else if (Float.isNaN(Float.parseFloat((d1))) || Float.isNaN(Float.parseFloat(d2))) {
                    throw new ArithmeticException("[!] El numero ha de ser numero");
                }

                int dividend = Integer.parseInt(d1); // Convertir String
                int divisor = Integer.parseInt(d2); // Convertir String

                double resultat = divideix(dividend, divisor);
                System.out.println("[>] Resultat: " + resultat);
                break;
            } catch (InputMismatchException e) {
                System.out.println("[!] Introdueix dos nombres enters.");
                scanner.nextLine(); // Leemos la linea
            } catch (ArithmeticException | IllegalArgumentException ex) {
                System.out.println(ex.getMessage()); // Hacemos print a todos los Exception
            }
        }

        scanner.close(); // Cerramos scanner
    }

    public static double divideix(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("[!] Divisió per zero no permesa."); // Invoke a ArithmeticException
        }
        return (double) dividend / divisor; // Devolvemos valor
    }
}