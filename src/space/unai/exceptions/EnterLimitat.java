package space.unai.exceptions;

import lombok.Getter;

import java.util.Scanner;

/*

 * AUTHOR: UNAI MEDINA FERNÁNDEZ
 * CURSO: 2DAM
 * FECHA: 20/09/2023

 */

@Getter
public class EnterLimitat {

    // Declaración (estáticas) de las variables
    static int MAX, MIN, VALOR;
    private static Scanner sc;

    public static void main(String[] args) {
        EnterLimitat enterLimitat = new EnterLimitat(1, 100); // Instanciamos el constructor.
        sc = new Scanner(System.in);
        int input = 0; // Declaramos input.
        do {
            try {
                System.out.println("[!] Introduce un numero entre [" + MIN + "-" + MAX + "] (SE SALE CON EL 0): ");

                input = sc.nextInt(); // Guardamos en INPUT para poder hacer bucle
                VALOR = setValor(input); // Guardamos en VALOR el resultado del scanner.
            } catch (IllegalArgumentException ex) {
                if (input != 0) {
                    System.out.println("[!] ERROR: " + ex.getMessage());
                }
            }
        } while (input != 0); // Mientras que no sea 0 el input no se sale del programa
        System.out.println("[!] Cerrando programa...");
    }

    private EnterLimitat(int MIN, int MAX) {
        // Declarar variables de entorno.
        this.MIN = MIN;
        this.MAX = MAX;
    }

    private static int setValor(int v) {
        if (v < MIN) { // Si el valor es menor que MIN
            throw new IllegalArgumentException("No es pot posar menys de " + MAX + " (" + v + ")"); // Kaboom
        } else if (v > MAX) { // Si el valor es mayor que MAX
            throw new IllegalArgumentException("No es pot posar més de " + MAX + " (" + v + ")"); // Kaboom
        } else {
            return v; // Si no retornamos valor.
        }
    }
}
