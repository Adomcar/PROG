package PROG.Java.Tema7;

public class Ej4 {
    public static void main(String[] args) {
        
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        for (int i = 0; i < numero.length; i++) {
            numero[i] =(int) ((Math.random() * 100) + 1);
        }
    }
}
