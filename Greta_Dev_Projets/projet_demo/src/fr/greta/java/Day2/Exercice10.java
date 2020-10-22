package fr.greta.java.Day2;

import java.util.Scanner;

public class Exercice10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Valeur obj = new Valeur();

        System.out.print("Entrez une valeur numérique: ");
        int str = scan.nextInt();

        obj.str = str;
        obj.numero();
    }
}

class Valeur {
    int str;

    void numero() {
        if (str>0 && str<100) {
            System.out.println("La valeur est valide");
        } else {
            System.out.println("La valeur n'est pas valide");
        }
    }
}
