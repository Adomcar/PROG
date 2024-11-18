import java.util.Scanner;

public class Ej17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, suma = 0;

        do {
            System.out.print("Introduzca un número entero positivo: ");
            numero = sc.nextInt();
            sc.nextLine();
            
            if(numero < 0) {
              System.out.print("El número introducido no es correcto,");
              System.out.println(" debe introducir un número positivo.");
            }
          } while (numero < 0);

        if (numero >= 0) {
            for (int i = numero; i <= numero + 100; i++) {
                suma +=i;
            }

            System.out.println("La suma es: " + suma);
        } else {
            System.out.println("No se permiten numeros negativos");
        }

        sc.close();
    }
}
