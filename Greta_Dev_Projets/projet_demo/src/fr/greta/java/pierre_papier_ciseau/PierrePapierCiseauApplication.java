package fr.greta.java.pierre_papier_ciseau;

public class PierrePapierCiseauApplication {

    public PierrePapierCiseau PierrePapierCiseauResultat(PierrePapierCiseau valeur1, PierrePapierCiseau valeur2) {

        PierrePapierCiseau pierre = PierrePapierCiseau.PIERRE;
        PierrePapierCiseau papier = PierrePapierCiseau.PAPIER;
        PierrePapierCiseau ciseau = PierrePapierCiseau.CISEAU;
        PierrePapierCiseau egalite = PierrePapierCiseau.EGALITE;

        if ((valeur1.equals(pierre) && valeur2.equals(papier)) || (valeur1.equals(papier) && valeur2.equals(pierre))) {
            return papier;
        } else if ((valeur1.equals(pierre) && valeur2.equals(ciseau)) || (valeur1.equals(ciseau) && valeur2.equals(pierre))) {
            return pierre;
        } else if ((valeur1.equals(papier) && valeur2.equals(ciseau)) || (valeur1.equals(ciseau) && valeur2.equals(papier))) {
            return ciseau;
        }else {
            return egalite;
        }
    }

}
