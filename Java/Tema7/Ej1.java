package PROG.Java.Tema7;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[12];

        array[0] = 39;
        array[1] = -2;
        array[4] = 0;
        array[6] = 14;
        array[8] = 5;
        array[9] = 120;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        sc.close();
    }
}
