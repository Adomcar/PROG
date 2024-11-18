import java.util.Scanner;

public class Ej19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int altura;

        System.out.print("Introduce una altura: ");
        altura = sc.nextInt();
        sc.nextLine();

        for (int fila = 1; fila <= altura; fila++) {
            for (int espacio = fila; espacio <= altura-1; espacio++) {
                System.out.print(" ");
            }
            for (int asterisco = 1; asterisco <= (2*fila)-1; asterisco++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
}
