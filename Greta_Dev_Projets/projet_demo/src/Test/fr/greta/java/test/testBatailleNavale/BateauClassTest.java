package Test.fr.greta.java.test.testBatailleNavale;

import fr.greta.java.bataille_navale.Bateau;
import fr.greta.java.bataille_navale.BateauType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BateauClassTest {

    Bateau bateau = new Bateau();


    @Test
    public void testSelectionerBateau5Element() {
        for (BateauType eachType: BateauType.values()) {
            bateau.selectionerBateau(eachType.name());
        }
        assertEquals(BateauType.values().length,bateau.bateauTypes.size());
    }

}
