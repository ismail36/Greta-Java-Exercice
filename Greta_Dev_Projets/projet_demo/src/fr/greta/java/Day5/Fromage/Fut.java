package fr.greta.java.Day5.Fromage;


import fr.greta.java.Day5.VacheType;

public class Fut {

    public int volume;

    public VacheType type;

    public boolean estRempli() {
        return volume > 0 && type != null;
    }
}
