package Java.Tema6;

import java.util.Scanner;

public class Ej31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dinero, dado1, dado2, suma = 0, aux = 0;

        System.out.print("Introduce la cantidad de dinero que quieres apostar: ");
        dinero = sc.nextInt();
        sc.nextLine();

        dado1 = (int) (Math.random() * 6) + 1;
        dado2 = (int) (Math.random() * 6) + 1;


        suma = dado1 + dado2;

        switch (suma) {
            case 7,11:
                System.out.println("Felicidades has ganado la partida.");
                dinero *= 2;
                System.out.println("Ahora tienes " + dinero + " euros.");
                break;
            case 2,3,12:
                System.out.println("Suerte para la proxima vez.");
                dinero = 0;
                System.out.println("Ahora tienes " + dinero + " euros.");
                break;

            case 4,5,6,8,9,10:
                aux = suma;
                suma = 0;
                while (suma != aux) {
                    dado1 = (int) (Math.random() * 6) + 1;
                    dado2 = (int) (Math.random() * 6) + 1;

                    suma = dado1 + dado2;

                    if (suma == aux) {
                        System.out.println("Felicidades has ganado la partida.");
                        suma = aux;
                    } else if(suma == 7){
                        System.out.println("Suerte para la proxima vez.");
                        suma = aux;
                    }
                }

                break;
        }

        sc.close();

    }
}
