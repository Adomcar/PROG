import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int n1, n2, n3;
        
        System.out.print("Introduce el primer numero: ");
        n1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Introduce el segundo numero: ");
        n2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Introduce el tercer numero: ");
        n3 = sc.nextInt();
        sc.nextLine();

        if ((n1<=n2) && (n1<=n3)) {
            if (n2<=n3) {
                System.out.println("El orden es: " + n1 + ", " + n2 + ", " + n3);
            } else {
                System.out.println("El orden es: " + n1 + ", " + n3 + ", " + n2);
            }
        } else {
            if ((n2<=n1) && (n2<=n3)) {
                if (n1<=n3) {
                    System.out.println("El orden es: " + n2 + ", " + n1 + ", " + n3);
                } else {
                    System.out.println("El orden es: " + n2 + ", " + n3 + ", " + n1);
                }
            } else {
               if (n2<=n1) {
                System.out.println("El orden es: " + n3 + ", " + n2 + ", " + n1);
               } else {
                System.out.println("El orden es: " + n3 + ", " + n1 + ", " + n2);
               } 
            }
        }

        sc.close();
    }

}
