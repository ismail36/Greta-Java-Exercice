package fr.greta.java.Day5.MachineDeBoisson;

import java.util.Scanner;

public class MachineBoisson {
    static Scanner scan = new Scanner(System.in);
    static String keyChoi= "PANNEAU:";
    static char annulation = 'A';
    static String[] nombreBoisson = {"1","2","3"};
    static String[] lesBoisson = {"CAFE", "DECA", "DOUBLE-CAFE"};
    static double[] lesPrix = {1.4, 3.2, 2.9};

    public static void main(String[] args) {

        for (int i=0; i<nombreBoisson.length; i++) {
            System.out.println(nombreBoisson[i] + " " + lesBoisson[i] + ". Le prix: " + lesPrix[i]);
        }
        System.out.println("A: Pour Annuler");

        boolean bool = verifyChoi();
        if (bool) {
            montant();
        } else {
            System.out.println("Non");
        }

    }

    public static boolean verifyChoi() {
        String leChoi = scan.nextLine();
        boolean annuler = true;

        while (annuler) {
            System.out.print("Bonjour. Choisissez votre choi: ");
            leChoi = scan.nextLine();
            if (leChoi.equals("A")) {
                return false;
            }
            boolean bool = false;
            char[] arrChoi = new char[leChoi.length()];
            if (leChoi.length()==9) {
                for (int i=0; i<leChoi.length(); i++) {
                    arrChoi[i] = leChoi.charAt(i);
                }
            }

            int num =0;
            if (leChoi.length()>keyChoi.length()) {
                for (int i=0; i<keyChoi.length(); i++) {
                    if (leChoi.charAt(i)==arrChoi[i]) {
                        ++num;
                        if (num==keyChoi.length()) {
                            bool = true;
                            break;
                        }
                    }
                }
            }

            String[] inputChoi = leChoi.split(":");
            if (bool) {
                for (String nombreBoi:nombreBoisson) {
                    if (inputChoi[1].equals(nombreBoi)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void montant() {

    }

}
