import java.util.Scanner;

public class Ej20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int altura;

        System.out.print("Introduce una altura: ");
        altura = sc.nextInt();
        sc.nextLine();

        for (int fila = 1; fila <= altura; fila++) {

            for (int espacio = fila; espacio <= altura - 1; espacio++) {
                System.out.print(" ");
            }
            
            if (fila > 1) {

                System.out.print("*");

                for (int espacio2 = 1; espacio2 < (2*fila-1); espacio2++) {
                    System.out.print(" ");

                }

                System.out.print("*");
                
            }else{
                System.out.print("*");
            }

            
            System.out.println(" ");
        }

        sc.close();
    }
}
