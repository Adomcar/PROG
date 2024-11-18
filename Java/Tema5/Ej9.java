import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero,contador = 0;

        System.out.print("Introduce un numero: ");
        numero = sc.nextInt();
        sc.nextLine();

        for (int i = 1; numero != 0; i++) {
            numero /=10;
            contador = i;
        }

        System.out.println(contador);

        sc.close();
    }
}
