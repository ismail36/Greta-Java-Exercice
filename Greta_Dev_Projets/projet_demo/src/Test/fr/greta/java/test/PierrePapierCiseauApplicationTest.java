package Test.fr.greta.java.test;

import fr.greta.java.pierre_papier_ciseau.PierrePapierCiseau;
import fr.greta.java.pierre_papier_ciseau.PierrePapierCiseauApplication;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PierrePapierCiseauApplicationTest {

    PierrePapierCiseauApplication app = new PierrePapierCiseauApplication();

    @Test
    public void verifyCiseauGagnePapier() {
        PierrePapierCiseau expect = PierrePapierCiseau.CISEAU;
        assertEquals(expect, app.PierrePapierCiseauResultat( PierrePapierCiseau.CISEAU,PierrePapierCiseau.PAPIER));
    }

    @Test
    public void verifyPapierGagnePierre() {
        PierrePapierCiseau expect = PierrePapierCiseau.PAPIER;
        assertEquals(expect, app.PierrePapierCiseauResultat( PierrePapierCiseau.PAPIER,PierrePapierCiseau.PIERRE));
    }

    @Test
    public void verifyPierreGagneCiseau() {
        PierrePapierCiseau expect = PierrePapierCiseau.PIERRE;
        assertEquals(expect, app.PierrePapierCiseauResultat( PierrePapierCiseau.PIERRE,PierrePapierCiseau.CISEAU));
    }

    @Test
    public void verifyEgalite() {
        PierrePapierCiseau expect = PierrePapierCiseau.EGALITE;
        assertEquals(expect, app.PierrePapierCiseauResultat( PierrePapierCiseau.PIERRE,PierrePapierCiseau.PIERRE));
        assertEquals(expect, app.PierrePapierCiseauResultat( PierrePapierCiseau.CISEAU,PierrePapierCiseau.CISEAU));
        assertEquals(expect, app.PierrePapierCiseauResultat( PierrePapierCiseau.PAPIER,PierrePapierCiseau.PAPIER));
    }

}
