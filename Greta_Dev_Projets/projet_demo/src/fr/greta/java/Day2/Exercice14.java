package fr.greta.java.Day2;

import java.util.Scanner;

public class Exercice14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Entrez une valeur alphanumérique: ");
        String str = scan.nextLine();

        Longeur ins = new Longeur();

        ins.alphnumerique(str);
    }
}

class Longeur {

    void alphnumerique(String str) {
        if (str.length()>10) {
            System.out.println(str.substring(0,8));
        } else {
            System.out.println(str);
        }
    }
}
