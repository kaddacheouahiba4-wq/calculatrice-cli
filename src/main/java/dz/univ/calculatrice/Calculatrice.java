package dz.univ.calculatrice;

import java.util.Scanner;

public class Calculatrice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Donner le premier nombre : ");
        double a = scanner.nextDouble();

        System.out.print("Donner le deuxieme nombre : ");
        double b = scanner.nextDouble();

        Operation addition = new Addition();

        System.out.println("Resultat de l'addition : "
                + addition.calculer(a, b));

        scanner.close();
    }
}