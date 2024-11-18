import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hora;

        System.out.println("Introduzca la hora: ");
        hora = sc.nextInt();
        sc.nextLine();

        if ((hora >= 5) && (hora < 13)) {
            System.out.println("Buenos dias");

        } else if ((hora > 13) && (hora < 21)) {
            System.out.println("Buenas tardes");

        } else {
            System.out.println("Buenas noches");
            
        }

        sc.close();
    }
}
