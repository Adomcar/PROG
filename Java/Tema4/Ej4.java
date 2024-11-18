import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horas, total = 0;

        System.out.print("Introduce la cantidad de horas trabajadas: ");
        horas = sc.nextInt();
        sc.nextLine();

        if (horas <=40) {
            total = horas * 12 ;
        } else {
            total = (40 * 12) + ((horas - 40) * 16); 
        }

        System.out.println("Su salario semanal es: " + total);

        sc.close();

    }
}
