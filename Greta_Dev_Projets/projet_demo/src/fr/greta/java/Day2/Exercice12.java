package fr.greta.java.Day2;

import java.util.Scanner;

public class Exercice12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Message msg = new Message();

        System.out.print("Entrez une valeur alphanumérique: ");
        String str = scan.nextLine();

        msg.salut(str);
    }
}
class Message {
    void salut(String str) {
        if(str.equalsIgnoreCase("Merci")) {
            System.out.println("De rien");
        }
    }
}