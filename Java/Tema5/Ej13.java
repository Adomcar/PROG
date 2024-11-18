import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeros, pos = 0, neg = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce un numero: ");
            numeros = sc.nextInt();
            sc.nextLine();

            if (numeros > 0) {
                pos += 1;
            } else {
                neg += 1;
            }
        }
        System.out.println("En la lista hay " + pos + " positivos y " + neg + " negativos.");

        sc.close();
    }
}
