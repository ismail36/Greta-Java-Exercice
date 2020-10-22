package fr.greta.java.Day3.Exercice1_GuessNumber;

import java.util.Scanner;

public class ClassDeJeu {

    Scanner scan = new Scanner(System.in);

    public int num;
    public int counter;
    public String joueur1;
    public String joueur2;

    public void jeu() {
        definiVariables();
        imagineNumber();
    }

    public void definiVariables() {
        System.out.print("Entrez votre nom (joueur 1): ");
        joueur1 = scan.nextLine();

        System.out.print("Entrez votre nom (joueur 2): ");
        joueur2 = scan.nextLine();

        System.out.print("Entrez votre essayer nombre: ");
        counter = scan.nextInt();

        System.out.print(joueur1 +  " saisi un nombre entre 0 et 50: ");
        num = scan.nextInt();

        System.out.println();
    }

    public void imagineNumber() {
        int dum = 0;
        if(num>0 && num<50) {
            for (int i=0; i<counter; i++) {
                System.out.print( joueur2 +" entrez votre num: ");
                int imagineNum = scan.nextInt();
                if (num==imagineNum) {
                    System.out.println("Le joueur " + joueur2 + " a gagné");
                    break;
                } else if (Math.abs(imagineNum-num)>=20) {
                    System.out.println("C'est froid");
                } else if (Math.abs(imagineNum-num)<20 && Math.abs(imagineNum-num)>5){
                    System.out.println("C'est frais");
                } else if (Math.abs(imagineNum-num)<=5 && Math.abs(imagineNum-num)>0) {
                    System.out.println("C'est chaud");
                }
                dum++;
            }
            if (dum==counter) {
                System.out.println("C'est le joueur " + joueur1);
            }
        } else {
            System.out.println("Invalid input. Game Over.");
        }
    }

}
