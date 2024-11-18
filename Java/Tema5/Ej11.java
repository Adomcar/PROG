import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Introduzca un numero: ");
        numero = sc.nextInt();
        sc.nextLine();

        for (int i = numero; i <= numero + 5; i++) {
            System.out.println(i + " " + Math.pow(i, 2) + " " + Math.pow(i, 3));
        }

        sc.close();
    }
}
