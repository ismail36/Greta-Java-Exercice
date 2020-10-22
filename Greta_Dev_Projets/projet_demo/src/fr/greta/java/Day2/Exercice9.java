package fr.greta.java.Day2;

import java.util.Scanner;

public class Exercice9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Numerique obj = new Numerique();

        System.out.print("Entrez une valeur numérique: ");
        int str = scan.nextInt();

        obj.str = str;
        obj.superieure();

    }
}

class Numerique {
    int str;

    void superieure() {
        if (str>10) {
            System.out.println("la valeur est supérieure à 10");
        } else {
            System.out.println("la valeur est inférieure à 10");
        }
    }
}
