import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String dia;

        System.out.println("Introduce un dia de la semana");
        dia = sc.nextLine();

        switch (dia) {
            case "lunes","Lunes","LUNES":
                System.out.println("El " + dia + " toca Entornos de Desarrollo a primera");
                break;

            case "martes","Martes","MARTES":
                System.out.println("El " + dia + " toca Digitalizacion a primera");
                break;
            
            case "miercoles","Miercoles","MIERCOLES":
                System.out.println("El " + dia + " toca Lenguaje de Marcas a primera");
                break;

            case "jueves","Jueves","JUEVES":
                System.out.println("El " + dia + " toca Lenguaje de Marcas a primera");
                break;

            case "viernes","Viernes","VIERNES":
                System.out.println("El " + dia + " toca Base de Datos a primera");
                break;

            default:
                System.out.println("No ha metido el dia correctamente intentelo de nuevo");
                break;
        }
        sc.close();

    }
}
