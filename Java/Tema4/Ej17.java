import java.util.Scanner;

public class Ej17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int numero,cifra;

        System.out.print("Introduzca el numero: ");
        numero = sc.nextInt();
        sc.nextLine();

        cifra = numero % 10;

        System.out.print("La ultima cifra del numero es: " + cifra);

        sc.close();
    }
}
