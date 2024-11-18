import java.util.Scanner;
public class T3E2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        double euro, peseta;
    
        System.out.println("Introduzca la cantidad de euros a convertir: ");
        euro = sc.nextDouble();

        peseta = euro / 0.006;
    
        System.out.println(peseta);

    }
}
