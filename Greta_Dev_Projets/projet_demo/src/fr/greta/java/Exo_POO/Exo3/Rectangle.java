package fr.greta.java.Exo_POO.Exo3;

public class Rectangle implements Forme{
    protected int x;
    protected int y;
    public Rectangle(int longueur, int largeur) {
        x = longueur;
        y = largeur;
        dessiner();
    }


    @Override
    public void dessiner() {
        System.out.println("Un rectangle de longeuer " + x + " et de largeur " + y);
    }

}
