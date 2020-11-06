package fr.greta.java.Exo_POO.Exo4;

public class TestStatic {

    public int myProp = 10;

    static public   int myPropStatic = 15;

    public static void main(String[] args) {
        TestStatic A = new TestStatic();
        TestStatic B = new TestStatic();

        A.myProp = 5;
        A.myPropStatic = 20;

         System.out.println("B.myProp = " + B.myProp);
        System.out.println("B.myPropStatic = " + B.myPropStatic);
    }

}
