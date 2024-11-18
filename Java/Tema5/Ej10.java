import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, total = 0, contador = 0, media;

        do {
            System.out.print("Introduce un numero: ");
            numero = sc.nextInt();
            sc.nextLine();

            if (numero >= 0) {
                total +=numero;
                contador++;
            }

            
        } while (numero >= 0);

        media = total / contador;

        System.out.println("La media de los nuemros es: " + media);

        sc.close();
    }
}
