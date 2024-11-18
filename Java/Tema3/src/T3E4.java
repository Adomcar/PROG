import java.util.Scanner;
public class T3E4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double n1, n2, suma, resta, mult, div;

        System.out.println("Introduce el primer numero: ");
        n1 = sc.nextDouble();


        System.out.println("Introduce el segundo numero: ");
        n2 = sc.nextDouble();

        suma = n1 + n2;
        resta = n1 - n2;
        mult = n1 * n2;
        div = n1 / n2;
        
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + mult);
        System.out.println("Division: " + div);

        
    }
}
