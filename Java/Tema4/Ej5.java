import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        float a, b, x;

        System.out.print("Introduzca el valor de a: ");
        a = sc.nextFloat();
        sc.nextLine();

        System.out.print("Introduzca el valor de b: ");
        b = sc.nextFloat();
        sc.nextLine();

        x = -b/a;

        System.out.println("El valor de X es : " + x);

        sc.close();

    }
}
