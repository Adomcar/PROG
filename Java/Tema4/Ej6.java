import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double g = 9.81, t, h;

        System.out.print("Introduce la altura: ");
        h = sc.nextDouble();
        sc.nextLine();

        t = Math.sqrt((2 * h)/g);

        System.out.println("El tiempo que tardaria en caer el objeto es: " + t);

        sc.close();

    }
}
