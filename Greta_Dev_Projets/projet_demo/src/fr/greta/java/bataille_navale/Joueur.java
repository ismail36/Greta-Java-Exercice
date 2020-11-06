package fr.greta.java.bataille_navale;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Joueur {

    public final Scanner scanner = new Scanner(System.in);

    public void run() {
        creeJoueurs();
    }


    public void creeJoueurs() {
        Map<Integer,String> joueurs = nomJoueurs();
        Map<String,Bateau> creeBateau = new HashMap<>();
        for (int i=1; i<=joueurs.size(); i++) {
            creeBateau.put(joueurs.get(i),new Bateau());
        }

        for (Integer joueurNum: joueurs.keySet()) {
            creeBateau.get(joueurs.get(joueurNum)).menu();

            while (creeBateau.get(joueurs.get(joueurNum)).bateauTypes.size()!= BateauType.values().length) {
                System.out.print(joueurs.get(joueurNum) + " choisisez le bateau: ");
                creeBateau.get(joueurs.get(joueurNum)).selectionerBateau(scanner.nextLine());

                if (creeBateau.get(joueurs.get(joueurNum)).bateauTypes.size()>0) {
                    demanderCoordene(creeBateau, joueurs.get(joueurNum));
                }
            }
        }
    }

    public Map<Integer,String> nomJoueurs() {
        final int nombreDeJoueurs = 2;

        Map<Integer, String > joueurs = new HashMap<>();
        for (int i=1; i<=nombreDeJoueurs; i++) {
            System.out.print("Nom de joueur " + i + ": ");
            joueurs.put(i, scanner.nextLine());
        }
        return joueurs;
    }


    private void demanderCoordene(Map<String,Bateau> creeBateau, String joueurName) {
        System.out.println("Place le bateau");
        System.out.println("1 - Pour Horizontalement");
        System.out.println("2 - Pour Verticalement");
        int coordene = scanner.nextInt();
        System.out.print("Entrez votre coordénné horizontal: ");
        int horizantal = scanner.nextInt();
        System.out.print("Entrez votre coordénné vertical: ");
        int vertical = scanner.nextInt();
        creeBateau.get(joueurName).placer(scanner.nextInt());
    }


}
