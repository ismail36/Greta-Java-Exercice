package fr.greta.java.bataille_navale;

public class Position {

    public boolean positionHorizontal(int horizontale, int verticale, String[][] grille, BateauType type) {
        int lengthBateauType = type.name().length();
        for (int i=0; i<lengthBateauType; i++) {
            if (grille[horizontale][verticale].equals(" ")) {
                return false;
            }
            verticale++;
            if (verticale>10) {
                return false;
            }
        }
        return true;
    }

    public boolean positionVertical(int horizontale, int verticale, String[][] grille, BateauType type) {
        int lengthBateauType = type.name().length();
        for (int i=0; i<lengthBateauType; i++) {
            if (grille[horizontale][verticale].equals(" ")) {
                return false;
            }
            horizontale++;
            if (horizontale>10) {
                return false;
            }
        }
        return true;
    }

}
