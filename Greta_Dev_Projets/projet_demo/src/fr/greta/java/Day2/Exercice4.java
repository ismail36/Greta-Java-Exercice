package fr.greta.java.Day2;

public class Exercice4 {
    public static void main(String[] args) {

        System.out.println(additionPuisMultiplicationPuisSoustraction(3,5,10,68));
        System.out.println(additionPuisMultiplicationPuisSoustraction(30,45,20,35));
        System.out.println(additionPuisMultiplicationPuisSoustraction(13,57,1,20));


    }

    public static float additionPuisMultiplicationPuisSoustraction(int a, int b, int c, int d) {
        float e = additionPuisMultiplication(a,b,c)-d;
        return e;
    }

    public static float additionPuisMultiplication(int a, int b, int c) {
        float d = (a+b) * c;
        return d;
    }
}
