import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo = 1234, intento;

        for (int i = 4; i != 0; i--) {
            System.out.print("Introduce un intento: ");
            intento = sc.nextInt();
            sc.nextLine();

            if (intento == codigo) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
                i = 4;
            } else {
                System.out.println("“Lo siento, esa no es la combinación."); 
            }
        }
        sc.close();
    }
}
