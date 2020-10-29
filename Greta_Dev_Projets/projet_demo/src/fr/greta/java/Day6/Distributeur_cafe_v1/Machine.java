package fr.greta.java.Day6.Distributeur_cafe_v1;

public class Machine {

    MachineInterface machineInterface = new MachineInterface();

    private EtatMachine etat;

    private Boisson boissonSelectionne;

    private double argentEnAttente;

    public void run() {
        init();
        while(true) {
            UserAction action = machineInterface.waitAndScan();
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
        boissonSelectionne = Boisson.INCONNUE;
        etat = EtatMachine.INIT;

        machineInterface.demanderArgent(resteAPayer());
        machineInterface.demanderBoisson();
    }

    private void actionPanneau(String valeur) {
        switch (etat) {
            case INIT:
                Boisson boisson = choisirBoisson(valeur);
                if(boisson != Boisson.INCONNUE) {
                    boissonSelectionne = boisson;
                    nextStep();
                }
                break;
        }
    }

    private Boisson choisirBoisson(String valeur) {
        switch (valeur) {
            case "1":
                return Boisson.CAFE;
            case "2":
                return Boisson.DECA;
            case "3":
                return Boisson.DOUBLE_CAFE;
            default:
                return Boisson.INCONNUE;
        }
    }

    private void actionMonnaie(String valeur) {
        switch (etat) {
            case DONNER_ARGENT:
                prendreArgent(valeur);
                break;
        }
    }

    private void prendreArgent(String valeur) {
        argentEnAttente += Double.parseDouble(valeur);
        if(argentEnAttente >= prixBoisson()) {
            nextStep();
        } else {
            machineInterface.demanderArgent(resteAPayer());
        }
    }

    private void nextStep() {
        switch (etat) {
            case INIT:
                etat = EtatMachine.DONNER_ARGENT;
                machineInterface.demanderArgent(resteAPayer());
                break;
            case DONNER_ARGENT:
                machineInterface.distribuer(boissonSelectionne);
                if(argentEnAttente > prixBoisson()) {
                    machineInterface.rendre(argentEnAttente - prixBoisson());
                }
                init();
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
