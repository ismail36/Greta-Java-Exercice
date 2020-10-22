package fr.greta.java.Day2;

import java.util.Scanner;

public class Exercice8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entrez une valeur alphanumérique: ");
        String str = scan.nextLine();

        Scan obj = new Scan();
        obj.message(str);

    }
}

class Scan {
    void message(String str) {
        System.out.println("Vous avez entré: " + str);
    }
}
