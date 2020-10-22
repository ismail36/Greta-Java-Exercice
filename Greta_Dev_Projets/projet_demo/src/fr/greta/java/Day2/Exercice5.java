package fr.greta.java.Day2;

import fr.greta.java.MaPremiereClass;

public class Exercice5 {

    public int val;
    static void maValeurEst(int val) {
        System.out.println("Ma valeur est: " + val);
    }

    public static void main(String[] args) {

        Exercice5 val = new Exercice5();

        val.val = 5;
        maValeurEst(val.val);

        val.val = 50;
        maValeurEst(val.val);

        val.val = 41;
        maValeurEst(val.val);



    }
}
