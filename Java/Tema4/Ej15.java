import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Introduzca un numero: ");
        numero = sc.nextInt();
        sc.close();

        if (((numero % 2) == 0) && ((numero % 5) == 0)) {

            System.out.println("El numero es par y divisble entre 5.");

        } else if ((numero % 2) == 0) {
            System.out.println("El numero es par.");

        } else if ((numero % 5) == 0) {
            System.out.println("El numero es divisible entre 5.");

        } else {
            System.out.println("El numero no es ni par ni divisible entre 5.");
            
        }

        sc.close();
    }
}
