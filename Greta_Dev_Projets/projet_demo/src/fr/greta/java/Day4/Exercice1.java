package fr.greta.java.Day4;

import java.util.Arrays;

public class Exercice1 {
    public static void main(String[] args) {

        System.out.println("valeurPoisitif(-5) = " + valeurPoisitif(-5));
        System.out.println("valeurPoisitif(10) = " + valeurPoisitif(10));

        System.out.println("plusGrand(10,5) = " + plusGrand(10, 5));
        System.out.println("plusGrand(34,58) = " + plusGrand(34, 58));

        int[] arr = {4,8,5,8,8,2};
        System.out.println("plusGrandValeur(arr) = " + Arrays.toString(plusGrandValeur(arr)));
    }

    public static boolean valeurPoisitif(int num) {
        boolean bool = false;
        if (num>=0) bool = true;
        return bool;
    }

    public static int plusGrand(int a, int b) {
        /*
        if(a>b) {
            return a;
        }
        return b;
         */

        return Math.max(a, b);
    }

    public static int plusGrandInArray(int[] arr) {
        int a = 0;
        for (int array: arr) {
            if (array>a) {
                a = array;
            }
        }
        return a;
    }

    public static int[] plusGrandValeur(int[] arr) {
        int a = 0;
        for (int i:arr) {
            if (i>a) a=i;
        }
        int num=0;
        for (int i:arr) {
            if (i==a) num++;
        }
        int[] array = new int[num];
        int b = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i]==a) {
                array[b] = i;
                b++;
            }
            if (b==num) {
                break;
            }
        }
        return array;
    }
}
