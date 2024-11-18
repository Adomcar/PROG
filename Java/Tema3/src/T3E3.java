import java.util.Scanner;
public class T3E3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        double euro , peseta;

        System.out.println("Introduce la cantidad de psesetas a convertir: ");
        peseta = sc.nextDouble();

        euro = peseta * 0.006;

        System.out.println(euro + "euros");
    }
}
