import java.util.Scanner;
public class T3E8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float horas, precioh = 12, total;

        System.out.println("Introduce las horas trabajadas");
        horas = sc.nextFloat();

        total = horas * precioh;

        System.out.println("Su salario semanal es: " + total);

    }
}
