import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float n1, n2, n3, media;

        System.out.print("Introduzca la primera nota: ");
        n1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Introduzca la primera nota: ");
        n2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Introduzca la primera nota: ");
        n3 = sc.nextInt();
        sc.nextLine();

        if ((n1 < 0) || (n2 < 0) || (n3 < 0)) {
            System.out.println("No se pueden obtener puntaciones negativas.");
        } else {
            media = (n1 + n2 + n3) / 3;
            System.out.println("La media de los tres examenes es: " + media);
        }

        sc.close();
    }
}
