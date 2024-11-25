package Java.Tema6;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            System.out.println((int)(Math.random()*6+20));
        }
    }
}
