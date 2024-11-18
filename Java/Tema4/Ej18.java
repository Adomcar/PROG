import java.util.Scanner;

public class Ej18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, resultado;

        System.out.print("Introduce un numero entero: ");
        numero = sc.nextInt();
        sc.nextLine();

        if ((numero >= 1) && (numero <= 9)) {
            System.out.println("El primer numero es: " + numero);

        } else if ((numero >= 10) && (numero <= 99)) {
            resultado = numero / 10;
            System.out.println("El primer numero es: " + resultado);

        } else if ((numero >= 100) && (numero <= 999)) {
            resultado = numero / 100;
            System.out.println("El primer numero es: " + resultado);

        } else if ((numero >= 1000) && (numero <= 9999)) {
            resultado = numero / 1000;
            System.out.println("El primer numero es: " + resultado);

        } else if ((numero >= 10000) && (numero <= 99999)) {
            resultado = numero / 10000;
            System.out.println("El primer numero es: " + resultado);
            
        } else {
            System.out.println("El numero introducido no es valido");
        }

        sc.close();
    }
}
