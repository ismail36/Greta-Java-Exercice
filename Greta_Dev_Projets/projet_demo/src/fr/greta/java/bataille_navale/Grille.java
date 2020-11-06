package fr.greta.java.bataille_navale;

public class Grille {

    int nbCasePlateau = 11;
    public String[][] grille = new String[nbCasePlateau][nbCasePlateau];
    Position position = new Position();

    public void defaultGrill() {
        String nullGrille = " ";
        int y = 0;
        for (int i=0; i<nbCasePlateau; i++) {
            while (y<nbCasePlateau) {
                grille[i][y] = Integer.toString(y);
                y++;
            }
            grille[i][0] = Integer.toString(i);
        }
        for (int i=1; i<nbCasePlateau; i++) {
            for (int x=1; x<nbCasePlateau; x++) {
                grille[i][x] = nullGrille;
            }
            System.out.println();
        }
        showGrill();
    }

    public void showGrill() {
        for (int i=0; i<nbCasePlateau; i++) {
            for (int x=0; x<nbCasePlateau; x++) {
                if (x == 0) {
                    System.out.print("|\t");
                }
                if (x == nbCasePlateau-1) {
                    System.out.print(grille[i][x] + "\t|");
                }else {
                    System.out.print(grille[i][x] + "\t|\t");
                }
            }
            System.out.println();
        }
    }

    public void placer(int hv, BateauType type) {
        if (hv==1) {
            horizontal(type);
        }else {
            vertical(type);
        }
    }

    public void horizontal(BateauType type) {
        int lengthType = type.name().length();

    }

    public void vertical(BateauType type) {
        int lengthType = type.name().length();

    }

    public void disponible() {

    }

    public void indisponible() {

    }

}
