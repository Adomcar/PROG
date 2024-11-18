import java.util.Scanner;

public class Ej18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min, max;

        System.out.print("Introduce el limite minimo: ");
        min = sc.nextInt();
        sc.nextLine();

        System.out.print("Introduce el limite maximo: ");
        max = sc.nextInt();
        sc.nextLine();

        if ((max < min) || (min == max)) {
            System.out.println("Has introducido los numero de forma erronea.");
        } else {
            for (int i = min; i < max; i += 7) {
                System.out.println(i + " ");
            }
        }

        sc.close();
    
    }
}
