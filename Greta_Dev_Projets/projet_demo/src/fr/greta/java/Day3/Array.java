package fr.greta.java.Day3;

public class Array {
    public static void main(String[] args) {
        int[] arr = {-12,0,1,85,-65,-74,25,-47,85,96,23,-25,59};
        returnArray(arr);
    }

    static void returnArray(int[] arr) {
        int number=0;
        for (int j : arr) {
            if (j >= 0) number++;
        }
        int[] arr2 = new int[number];
        number=0;
        for (int j : arr) {
            if (j >= 0) {
                arr2[number]=j;
                System.out.println(arr2[number]);
                number++;
            }
        }
    }
}
