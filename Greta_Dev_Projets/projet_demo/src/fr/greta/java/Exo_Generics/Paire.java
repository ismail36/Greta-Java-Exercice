package fr.greta.java.Exo_Generics;

public class Paire <Type>{

    Type premiere;
    Type deuxieme;

    public Paire(Type premiere, Type deuxieme) {
        this.premiere = premiere;
        this.deuxieme = deuxieme;
    }

    public boolean sontJumeaux(String premiere, String deuxime) {
        return premiere.equals(deuxime);
    }

    public boolean sontJumeaux(int premiere, int deuxime) {
        return premiere == deuxime;
    }


    public Type getPaire(int num) {
        if (num == 1 ) {
            return premiere;
        } else if(num == 2) {
            return deuxieme;
        } else {
            return null;
        }
    }



}
