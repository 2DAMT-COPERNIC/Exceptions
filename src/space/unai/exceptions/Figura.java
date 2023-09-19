package space.unai.exceptions;

import java.util.ArrayList;
import java.util.Scanner;

public class Figura {
    private static int costats;
    private ArrayList<Double> longitudsCostats;

    public Figura(int numCostats, ArrayList<Double> longitudsCostats) throws IllegalArgumentException {
        if (numCostats < 3) {
            throw new IllegalArgumentException("El nombre de costats ha de ser com a mínim 3.");
        }

        if (numCostats != longitudsCostats.size()) {
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

            System.out.println("Cuants costats vols?");
            costats = sc.nextInt();

            Figura triangle = new Figura(costats, costatsTriangle);
            System.out.println("Perímetre del triangle: " + triangle.perímetre());

        } catch (IllegalArgumentException e) {
            System.out.println("[!]: " + e.getMessage());
        }
    }
}

