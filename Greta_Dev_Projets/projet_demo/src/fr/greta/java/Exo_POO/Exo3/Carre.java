package fr.greta.java.Exo_POO.Exo3;

public class Carre implements Forme  {
    int z;

    public Carre(int cote) {
        z = cote;
        dessiner();
    }

    @Override
    public void dessiner() {
        System.out.println("Un carré de coté " + z);
    }
}
