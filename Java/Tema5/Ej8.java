import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Introduce el numero del que quieras la tabla: ");
        numero = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i <=  10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        sc.close();
    }
}
