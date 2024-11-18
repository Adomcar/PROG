import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, div = 0;

        System.out.print("Introduce un numero: ");
        numero = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                div += 1;
            }
        }

        if (div == 1) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }

        sc.close();
    }
}
