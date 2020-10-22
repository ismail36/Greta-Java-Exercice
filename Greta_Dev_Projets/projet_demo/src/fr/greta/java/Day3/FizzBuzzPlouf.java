package fr.greta.java.Day3;
import java.util.Scanner;

public class FizzBuzzPlouf {

    // Question
    /*
        --- FizzBuzzPlouf

        Énoncée: Je récupère une valeur entière via la console.
        Si mon nombre est supérieur à 50, j’affiche “Fizz”
        Si mon nombre est pair, j’affiche “Buzz”
        Si mon nombre n’est multiple à 5, j’affiche “Plouf”
        Sinon j’affiche le nombre que j’ai saisie
        L’affichage est cumulatif

        Exemples:
        55 -> “Fizz”
        40 -> “Buzz”
        41 -> “Plouf”
        35 -> “35”
        60 -> “FizzBuzz”
        4 -> “BuzzPlouf”
        62 -> “FizzBuzzPlouf”
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entrez un nombre: ");
        int num = scan.nextInt();

        if(num>50 && num%5!=0 && num%2==0) {
            System.out.println("FizzBuzzPlouf");
        } else if(num>50 && num%2==0) {
            System.out.println("FizzBuzz");
        } else if(num<50 && num%5!=0 && num%2==0) {
            System.out.println("BuzzPlouf");
        } else if(num<50 && num%5==0 && num%2!=0) {
            System.out.println(num);
        } else if(num<50 && num%5!=0 && num%2!=0) {
            System.out.println("Plouf");
        } else if(num<50 && num%2==0) {
            System.out.println("Buzz");
        } else System.out.println("Fizz");
    }
}

