import java.util.Scanner;

public class Ej21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        float n1, n2, nota_Final;
        String recuperacion;

        System.out.print("Introduzca la nota del primer examen: ");
        n1 = sc.nextFloat();
        sc.nextLine();

        System.out.print("Introduzca la nota del segundo examen: ");
        n2 = sc.nextFloat();
        sc.nextLine();

        nota_Final = (n1 + n2)/2;

        if (nota_Final >= 5) {
            
            System.out.print("Tu nota de programacion es " + nota_Final);

        } else {

            System.out.print("¿Cual ha sido el resultado de la recuperacion? (apto / no apto): ");
            recuperacion = sc.nextLine();
            
            if (recuperacion.equals("apto")) {
                nota_Final = 5;
                System.out.print("Tu nota de programacion es " + nota_Final);
            } else {
                System.out.print("Tu nota de programacion es " + nota_Final);
            }
        }

        sc.close();

    }
}
