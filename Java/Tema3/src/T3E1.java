import java.util.Scanner;

public class T3E1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        int n1, n2, mult;

        System.out.println("Introduzca el primer numero");
        n1 = sc.nextInt();

        System.out.println("Introduzca enl primer numero");
        n2 = sc.nextInt();

        mult = n1 * n2;

        System.out.println("La multiplicacion de los dos numeros es: " + mult);

    }
}
