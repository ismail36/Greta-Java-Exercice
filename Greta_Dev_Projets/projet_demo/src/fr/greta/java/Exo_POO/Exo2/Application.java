package fr.greta.java.Exo_POO.Exo2;

public class Application {

    Utilisateur[] utilisateurs;

    public Utilisateur creerUtilisateur(String surname, String name) {
        return new Utilisateur(surname,name);
    }

    public Administrateur creerAdministrateur(String surname, String name, Administrateur creePar) {
        return new Administrateur(surname,name,creePar);

    }
}
