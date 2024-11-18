import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base, exponente;

        System.out.print("Introduce la base: ");
        base = sc.nextInt();
        sc.nextLine();

        System.out.print("Introduce el exponente: ");
        exponente = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i <= exponente; i++) {
            System.out.println("2^" + i + " = " + Math.pow(base, i));
        }

        sc.close();
    }
}
