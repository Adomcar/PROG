import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int nota1, nota2, nota3, media;

        System.out.println("Introduce la primera nota: ");
        nota1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce la segunda nota: ");
        nota2 = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce la tercera nota: ");
        nota3 = sc.nextInt();
        sc.nextLine();

        media = (nota1 + nota2 + nota3)/3;



        switch (media) {
            case 1,2,3,4:
                System.out.println(media + " Insuficiente");
                break;

            case 5:
                System.out.println(media +" Suficiente");
                break;

            case 6:
                System.out.println(media + " Bien");
                break;

            case 7,8:
                System.out.println(media + " Notable");
                break;

            case 9,10:
                System.out.println(media + " Sobresaliente");
                break;
        
            default:
                System.out.println("Has introducido algun valor mal");                      
                break;
        }
        sc.close();
    }
}
