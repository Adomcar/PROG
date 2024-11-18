import java.util.Scanner;

public class Ej19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, digitos;

        System.out.print("Introduce un numero: ");
        numero = sc.nextInt();

        if (((numero > 0) && (numero < 10)) || ((numero < 0) && (numero > -10))) {
            digitos = 1;
            System.out.println("El numero tiene " + digitos + " digitos");

        } else if (((numero >= 10) && (numero < 100)) || (((numero <= -10)) && ((numero > -100)))) {
            digitos = 2;
            System.out.println("El numero tiene " + digitos + " digitos");

        } else if (((numero >= 100) && (numero < 1000)) || ((numero <= -100) && (numero > -1000))) {
            digitos = 3;
            System.out.println("El numero tiene " + digitos + " digitos");

        } else if (((numero >= 1000) && (numero < 10000)) || ((numero <= -1000) && (numero > -10000))) {
            digitos = 4;
            System.out.println("El numero tiene " + digitos + " digitos");

        } else if (((numero >= 10000) && (numero < 100000)) || ((numero <= -10000) && (numero > -100000))) {
            digitos = 5;
            System.out.println("El numero tiene " + digitos + " digitos");
            
        } else {
            System.out.println("El numero introducido no es valido");
        }
        sc.close();
    }
}
