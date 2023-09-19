package space.unai.exceptions;

import java.util.ArrayList;
import java.util.Scanner;

public class Figura {
    private static int costats; // Num costats pedido por usuario
    private ArrayList<Double> longitudsCostats; // ArrayList

    public Figura(int numCostats, ArrayList<Double> longitudsCostats) throws IllegalArgumentException {
        if (numCostats < 3) { // Si el nombre de lados es menor de 3
            throw new IllegalArgumentException("El nombre de costats ha de ser com a mínim 3."); // IllegalException
        }

        if (numCostats != longitudsCostats.size()) { // Si el nombre de lados no es el mismo de la arraylist
            throw new IllegalArgumentException("El nombre de costats no correspon amb el nombre de segments proporcionats.");
        }

        costats = numCostats;
        this.longitudsCostats = longitudsCostats;
    }

    public double perímetre() {
        double perímetre = 0;
        for (double longitud : longitudsCostats) {
            perímetre += longitud;
        }
        return perímetre;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            ArrayList<Double> costatsTriangle = new ArrayList<>();
            costatsTriangle.add(3.0);
            costatsTriangle.add(4.0);
            costatsTriangle.add(5.0);
            // Se pueden seguir añadiendo aqui

            System.out.println("[^] Cuants costats vols?");
            costats = sc.nextInt();

            Figura triangle = new Figura(costats, costatsTriangle);
            System.out.println("[^] Perímetre del triangle: " + triangle.perímetre());

        } catch (IllegalArgumentException e) {
            System.out.println("[!] ERROR -> " + e.getMessage());
        }
    }
}

