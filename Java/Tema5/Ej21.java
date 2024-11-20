import java.util.Scanner;

public class Ej21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean bandera = true;
        int numero, media = 0, numimpar = 0, maxpar = 0, contador = 0;

        for (int i = 0; bandera == false; i++) {
            
            System.out.print("Introduce un numero");
            numero = sc.nextInt();
            sc.nextLine();
            
            if (numero < 0 ) {
                bandera = false;
            } else if ((numero % 3) == 0) {
                numimpar++;
                media += numero;
            }else if ((numero % 2) == 0){
                if (numero > maxpar) {
                    maxpar = numero;    
                }
            }
            contador = i;
        }

        media /= numimpar;

        System.out.println("La cantidad de numeros introducida es: " + contador);
        System.out.println("La media de los impares es: " + media);
        System.out.println("El mayor de los pares es: " + maxpar);
        
        sc.close();
    
    }
    
}
