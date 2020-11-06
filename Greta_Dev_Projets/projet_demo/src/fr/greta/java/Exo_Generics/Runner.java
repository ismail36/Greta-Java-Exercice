package fr.greta.java.Exo_Generics;

public class Runner {

    public static void main(String[] args) {

        Paire<String> maPaire = new Paire<>("Hello","Bonjour");
        System.out.println(maPaire.getPaire(2));
        System.out.println(maPaire.sontJumeaux(maPaire.getPaire(1),maPaire.getPaire(2)));

        Paire<Integer> maPaire2 = new Paire<>(10,10);
        System.out.println(maPaire2.getPaire(2));
        System.out.println(maPaire.sontJumeaux(maPaire2.getPaire(1),maPaire2.getPaire(2)));

    }
}
