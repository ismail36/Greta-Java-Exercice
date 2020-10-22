package fr.greta.java.Day5;

public class Etable {

    private static final int MAX_VOLUME_FUT = 50;

    private Fut[]  futs = new Fut[3];

    public void rentrerVache(Vache[] vaches) {
        for(int i=0; i<futs.length; i++) {
            for (Vache inek: vaches) {
                if(inek.type.equals(futs[i].type)) {
                    if ((futs[i].volume + inek.lait)>MAX_VOLUME_FUT) {
                        System.out.println("Fut de " + futs[i].type + " est plein.");
                        futs[i].volume = MAX_VOLUME_FUT;
                    }else {
                        futs[i].volume += inek.lait;
                    }
                }
            }
        }
        //TODO
    }

    public void initFuts() {
        VacheType[] vacheArr = {VacheType.NORMANDE,VacheType.HOSLTEIN,VacheType.JERSAISE};
        for(int i = 0; i < futs.length; i++) {
            futs[i] = new Fut();
            futs[i].type = vacheArr[i];
        }
    }

    public void afficherEtatFuts() {
        for(Fut eachFut : futs) {
            if(eachFut.estRempli()) {
                System.out.println("Fut: " + eachFut.type + " - Volume: " + eachFut.volume);
            }
        }
    }

    public void fabriquerFromage(Fromage[] fromage) {

        int camembert = 0;
        int reblochon = 0;
        int comte = 0;

        for (Fromage peynir: fromage) {
            if (peynir.equals(Fromage.CAMEMBERT)) {
                if (futs[0].volume>=2 && futs[2].volume>=1) {
                    futs[0].volume -= 2;
                    futs[2].volume -= 1;
                    ++camembert;
                } else {
                    System.out.println("Pour plus Camemebert il faut rentrer vache !!!");
                }
            } else if(peynir.equals(Fromage.REBLOCHON)) {
                if (futs[1].volume>=2 && futs[0].volume>=1) {
                    futs[1].volume -= 2;
                    futs[0].volume -= 1;
                    ++reblochon;
                } else {
                    System.out.println("Pour plus Reblochon il faut rentrer vache !!!");
                }
            } else if (peynir.equals(Fromage.COMTE)) {
                if (futs[0].volume>=1 && futs[1].volume>=1 && futs[2].volume>=1) {
                    futs[0].volume -= 1;
                    futs[1].volume -= 1;
                    futs[2].volume -= 1;
                    ++comte;
                } else {
                    System.out.println("Pour plus Comté il faut rentrer vache !!!");
                }
            }
        }
        System.out.println("Vous avez fabriqué Camembert : " + camembert);
        System.out.println("Vous avez fabriqué Reblochon : " + reblochon);
        System.out.println("Vous avez fabriqué Comté : " + comte);
    }
}
