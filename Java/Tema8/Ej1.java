package PROG.Java.Tema8;

import java.util.Scanner;

public class Ej1 {
    
    public static boolean esCapicua(int num, int volteado){
        while (num > 0) {
            volteado = (volteado * 10) + (num % 10);
            num /= 10;
        }

        return (volteado == num); // si es verdadero devolvera true y si no devolvera false
    }

    public static boolean esPrimo(int num, int div){

        for (int i = 0; i < Math.sqrt(num); i++) {
            if ((num % i) == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean siguientePrimo(int num, int div){
        return true;
    }
}
