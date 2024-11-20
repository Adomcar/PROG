import java.util.Scanner;
public class T3E5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float base, altura, area;

        System.out.println("Introduce la altura del rectangulo");
        altura = sc.nextFloat();

        System.out.println("Introduce la base del rectangulo");
        base = sc.nextFloat();

        area = (base * altura);

        System.out.print("El area del rectangulo es: " + area);

        sc.close();
    }
}
