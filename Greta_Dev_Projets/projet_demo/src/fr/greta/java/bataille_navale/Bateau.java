package fr.greta.java.bataille_navale;

import java.util.ArrayList;

public class Bateau {


    public ArrayList<BateauType> bateauTypes = new ArrayList<>();

    Grille grille = new Grille();


    public void menu() {
        int num = 1;
        String format = "%-40s%s%n";
        for (BateauType eachType: BateauType.values()) {
            System.out.printf(format, num + ": " + eachType.name(),  "Case nombre: " + BateauType.nbCase(eachType));
        }
    }

    public void selectionerBateau(String  type) {
        BateauType bateauType = null;
        for (BateauType bateau: BateauType.values()) {
            if (bateau.name().equalsIgnoreCase(type)) {
                bateauType = bateau;
            }
        }
        if (bateauType != null && !bateauTypes.contains(bateauType)) {
            bateauTypes.add(bateauType);
        }else if (bateauType == null) {
            System.out.println("Invalid !!!");
        } else if (bateauTypes.contains(bateauType)) {
            System.out.println("Vous avez déja sélectionné: " + bateauType);
        }
        System.out.println("Vous avez sélectionné(e): " + bateauTypes.size() + " bateau.");
        if (bateauTypes.size()==1) {
            grille.defaultGrill();
        }
    }


    public void placer(int hv) {
        if (hv==1) {
            //grille.horizontal();
            // Branch Deneme
        }
    }


}
