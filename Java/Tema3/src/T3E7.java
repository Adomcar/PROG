import java.util.Scanner;
public class T3E7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double baseimponible;

        System.out.println("Introduzca la base imponible (Precio sin IVA)");
        baseimponible = sc.nextFloat();

        baseimponible = baseimponible * 1.21;

        System.out.println("Esta es el total de la factura: " + baseimponible);

        sc.close();
    }
}
