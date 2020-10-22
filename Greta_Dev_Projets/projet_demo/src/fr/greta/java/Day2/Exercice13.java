package fr.greta.java.Day2;

import java.util.Scanner;

public class Exercice13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Message13 msg = new Message13();

        System.out.print("Entrez une valeur alphanumérique: ");
        String str = scan.nextLine();

        msg.salut(str);
    }
}
class Message13 {
    void salut(String str) {
        if(str.equals("Merci")) {
            System.out.println("De rien");
        }
    }
}
