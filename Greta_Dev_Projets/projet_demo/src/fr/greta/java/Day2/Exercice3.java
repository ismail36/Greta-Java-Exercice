package fr.greta.java.Day2;

public class Exercice3 {
    public static void main(String[] args) {

        System.out.println(additionPuisMultiplication(3,5,10));
        System.out.println(additionPuisMultiplication(34,45,9));
        System.out.println(additionPuisMultiplication(1,42,32));

    }

    public static float additionPuisMultiplication(int a, int b, int c) {
        float d = (a+b) * c;
        return d;
    }
}
