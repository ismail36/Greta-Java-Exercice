package fr.greta.java.Day2;

import java.util.Scanner;

public class Exercice11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Dizaine obj = new Dizaine();
        System.out.print("Entrez une valeur numérique: ");
        int str = scan.nextInt();

        obj.num = str;
        obj.numbers();
    }
}

class Dizaine {
    int num;
    void numbers() {
        if (num >0 && num <100) {
            if (num >=10) {
                int unit = num %10;
                int dizaine = num /10;
                System.out.println("La valeur de la dizaine: "+ dizaine);
                System.out.println("la valeur de l'unité: " + unit);
            } else {
                System.out.println("La valeur de la dizaine: "+ 0);
                System.out.println("la valeur de l'unité: " + num);
            }
        } else {
            System.out.println("La valeur n'est pas valide");
        }
    }
}