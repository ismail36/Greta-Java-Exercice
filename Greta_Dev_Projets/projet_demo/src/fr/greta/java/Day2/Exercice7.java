package fr.greta.java.Day2;

public class Exercice7 {
    public static void main(String[] args) {
        FloatNum obj = new FloatNum();
        obj.number(4.2f,6);
    }
}

class FloatNum {
    void number(float num, int a) {
        int result = (int)num + a;
        System.out.println("result = " + result);
    }
}
