package fr.greta.java.Day6.Distributeur_cafe_v2;

public class Machine {

    private static final String PANNEAU_VALEUR_ANNULER = "A";
    private static final String PANNEAU_VALEUR_CAFE = "1";
    private static final String PANNEAU_VALEUR_DECA = "2";
    private static final String PANNEAU_VALEUR_DOUBLE_CAFE = "3";

    private MachineUserInterface ui = new MachineUserInterface();

    private Boisson boissonSelectionne;

    private double argentEnAttente;

    public void run() {
        init();
        while(true) {
            UserAction action = ui.waitAndScan();
            switch (action.type) {
                case PANNEAU:
                    actionPanneau(action.valeur);
                    break;
                case MONNAIE:
                    actionMonnaie(action.valeur);
                    break;
            }
        }
    }

    private void init() {
        argentEnAttente = 0;
        boissonSelectionne = null;
        ui.demanderBoisson();
    }

    private void actionPanneau(String valeur) {
        if(valeur.equals(PANNEAU_VALEUR_ANNULER)) {
            rendreTout();
            init();
        } else if(argentEnAttente == 0) {
            Boisson boisson = choisirBoisson(valeur);
            if(boisson != Boisson.INCONNUE) {
                boissonSelectionne = boisson;
                ui.demanderArgent(resteAPayer());
            }
        }
    }

    private Boisson choisirBoisson(String valeur) {
        switch (valeur) {
            case PANNEAU_VALEUR_CAFE:
                return Boisson.CAFE;
            case PANNEAU_VALEUR_DECA:
                return Boisson.DECA;
            case PANNEAU_VALEUR_DOUBLE_CAFE:
                return Boisson.DOUBLE_CAFE;
            default:
                return Boisson.INCONNUE;
        }
    }

    private void actionMonnaie(String valeur) {
        argentEnAttente += Double.parseDouble(valeur);
        if(boissonSelectionne != null) {
            if(argentEnAttente >= prixBoisson()) {
                ui.distribuer(boissonSelectionne);
                if(argentEnAttente > prixBoisson()) {
                    ui.rendre(argentEnAttente - prixBoisson());
                }
                init();
            } else {
                ui.demanderArgent(resteAPayer());
            }
        }
    }

    private void rendreTout() {
        if(argentEnAttente > 0) {
            ui.rendre(argentEnAttente);
        }
    }

    private double resteAPayer() {
        return prixBoisson() - argentEnAttente;
    }

    private double prixBoisson() {
        switch (boissonSelectionne) {
            case CAFE:
                return 1;
            case DECA:
                return 0.85;
            case DOUBLE_CAFE:
                return 1.6;
            default:
                return 0;
        }
    }
}
