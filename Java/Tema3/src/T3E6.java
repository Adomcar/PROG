import java.util.Scanner;

public class T3E6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float base, altura, area;

        System.out.println("Introduce la altura del triangulo");
        altura = sc.nextFloat();

        System.out.println("Introduce la base del triangulo");
        base = sc.nextFloat();

        area = (base * altura)/2;

        System.out.print("El area del triangulo es: " + area);

    }
}
