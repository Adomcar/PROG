import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int DiaSemana;

        System.out.print("Introduce el dia de la semana: (1-Lunes/2-Martes/3-Miercoles/4-Jueves/5-Viernes/6-Sabado/7-Domingo)");
        DiaSemana = sc.nextInt();

        switch (DiaSemana) {
            case 1:
                System.out.println("Lunes");
                break;
            
            case 2:
                System.out.println("Martes");
                break;

            case 3:
                System.out.println("Miercoles");
                break;

            case 4:
                System.out.println("Jueves");
                break;

            case 5:
                System.out.println("Viernes");
                break;

            case 6:
                System.out.println("Sabado");
                break;

            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Ese numero no se corresponde con ningun dia de la semana");
                break;
        }
        sc.close();
    }
}
