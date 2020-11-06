package Test.fr.greta.java.test.testBatailleNavale;

import fr.greta.java.bataille_navale.Grille;
import org.junit.Test;

public class GrilleTest {

    Grille grille = new Grille();

    @Test
    public void showGrilleTest() {
        grille.showGrill();
    }

    @Test
    public void setGrilleTest() {
        grille.defaultGrill();
        grille.showGrill();
    }

}
