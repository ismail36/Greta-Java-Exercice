package fr.greta.java.Day5.Fromage;

import fr.greta.java.Day5.VacheType;

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

    public Paquet[] fabriquerFromage(Fromage[] fromage) {

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

        Fromage[] peynirler = {Fromage.CAMEMBERT, Fromage.REBLOCHON, Fromage.COMTE};
        int[] peynirlerSayilari = {camembert, reblochon, comte};

        Paquet[] fromageNombre =  new Paquet[3];
        for (int i=0; i<3; i++) {
            fromageNombre[i] = new Paquet();
            fromageNombre[i].typeFromage = peynirler[i];
            fromageNombre[i].nombreFromage = peynirlerSayilari[i];
        }

        return fromageNombre;
    }

    public void empaqueter(Paquet[] nombreFrmoage) {

        Empaqueter[] packetCamembert = new Empaqueter[nombreFrmoage[0].nombreFromage/5];
        Empaqueter[] packetReblochon = new Empaqueter[nombreFrmoage[1].nombreFromage/5];
        Empaqueter[] packetComte = new Empaqueter[nombreFrmoage[2].nombreFromage/5];

        if (nombreFrmoage[0].nombreFromage>=5) {
            for (Empaqueter paketCamembert: packetCamembert) {
                paketCamembert.fromageType = Fromage.CAMEMBERT;
                --nombreFrmoage[0].nombreFromage;
            }
        }

        if (nombreFrmoage[1].nombreFromage>=5) {
            for (Empaqueter paketReblochon: packetReblochon) {
                paketReblochon.fromageType = Fromage.REBLOCHON;
                --nombreFrmoage[1].nombreFromage;
            }
        }

        if (nombreFrmoage[2].nombreFromage>=5) {
            for (Empaqueter paketComte: packetComte) {
                paketComte.fromageType = Fromage.COMTE;
                --nombreFrmoage[2].nombreFromage;
            }
        }

        if (nombreFrmoage[0].nombreFromage<5 || nombreFrmoage[1].nombreFromage<5 || nombreFrmoage[2].nombreFromage<5) {
            int totalFro = nombreFrmoage[0].nombreFromage + nombreFrmoage[1].nombreFromage + nombreFrmoage[2].nombreFromage;
            Empaqueter[] packetMelange = new Empaqueter[totalFro/5];
            packetMelange[0].numPacket=5;
            for (Empaqueter melange: packetMelange) {
                if (nombreFrmoage[0].nombreFromage>0) {
                    for (int i=0; i<nombreFrmoage[0].nombreFromage; i++) {

                    }

                }

                if (nombreFrmoage[1].nombreFromage>=5) {
                    for (Empaqueter paketReblochon: packetReblochon) {
                        paketReblochon.fromageType = Fromage.REBLOCHON;
                        --nombreFrmoage[1].nombreFromage;
                    }
                }

                if (nombreFrmoage[2].nombreFromage>=5) {
                    for (Empaqueter paketComte: packetComte) {
                        paketComte.fromageType = Fromage.COMTE;
                        --nombreFrmoage[2].nombreFromage;
                    }
                }
            }
        }

    }

    public void affichierLesFromage(Paquet[] arr) {
        for (int i=0; i<3; i++) {
            System.out.println("Vous avez fabriqué " + arr[i].typeFromage + ": " + arr[i].nombreFromage);
        }

    }
}
