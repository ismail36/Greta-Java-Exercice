package fr.greta.java.Day5;

public class TPVacheRunner {

    public static void main(String[] arg) {

        Vache vache0 = new Vache();
        vache0.lait = 20;
        vache0.type = VacheType.NORMANDE;

        Vache vache1 = new Vache();
        vache1.lait = 10;
        vache1.type = VacheType.JERSAISE;

        Vache vache2 = new Vache();
        vache2.lait = 30;
        vache2.type = VacheType.NORMANDE;

        Vache vache3 = new Vache();
        vache3.lait = 20;
        vache3.type = VacheType.HOSLTEIN;

        Vache vache4 = new Vache();
        vache4.lait = 50;
        vache4.type = VacheType.HOSLTEIN;

        Vache vache5= new Vache();
        vache5.lait = 50;
        vache5.type = VacheType.NORMANDE;

        Vache[] vaches = new Vache[6];
        vaches[0] = vache0;
        vaches[1] = vache1;
        vaches[2] = vache2;
        vaches[3] = vache3;
        vaches[4] = vache4;
        vaches[5] = vache5;

        Fromage[] fromages = new Fromage[15];
        fromages[0] = Fromage.CAMEMBERT;
        fromages[1] = Fromage.COMTE;
        fromages[2] = Fromage.REBLOCHON;
        fromages[3] = Fromage.REBLOCHON;
        fromages[4] = Fromage.COMTE;
        fromages[5] = Fromage.CAMEMBERT;
        fromages[6] = Fromage.CAMEMBERT;
        fromages[7] = Fromage.CAMEMBERT;
        fromages[8] = Fromage.CAMEMBERT;
        fromages[9] = Fromage.COMTE;
        fromages[10] = Fromage.REBLOCHON;
        fromages[11] = Fromage.REBLOCHON;
        fromages[12] = Fromage.CAMEMBERT;
        fromages[13] = Fromage.CAMEMBERT;
        fromages[14] = Fromage.CAMEMBERT;

        Etable etable = new Etable();
        etable.initFuts();
        etable.rentrerVache(vaches);
        etable.afficherEtatFuts();
        etable.fabriquerFromage(fromages);
        etable.afficherEtatFuts();
    }


}
