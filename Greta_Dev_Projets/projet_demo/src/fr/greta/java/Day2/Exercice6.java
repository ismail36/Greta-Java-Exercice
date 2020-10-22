package fr.greta.java.Day2;

public class Exercice6 {
    public static void main(String[] args) {
/*
        MaDeuxiemeClasse ins = new MaDeuxiemeClasse();
        ins.creationMaPremiereClasse(5);

        MaDeuxiemeClasse ins2 = new MaDeuxiemeClasse();
        ins2.creationMaPremiereClasse(7);

        MaDeuxiemeClasse ins3 = new MaDeuxiemeClasse();
        ins3.creationMaPremiereClasse(58);

 */
        MaDeuxiemeClasse.creationMaPremiereClasse(50);
    }
}

class MaDeuxiemeClasse {
    public String str;
    public static void creationMaPremiereClasse(int val1) {
            MaPremiereClasse obj = new MaPremiereClasse();
            obj.val = val1;
            obj.maValeurEst();
    }
}

class MaPremiereClasse {
    public int val;
    public void maValeurEst() {
        System.out.println("Ma valeur est: " + this.val);
    }
}
