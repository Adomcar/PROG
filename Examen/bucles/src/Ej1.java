import java.util.Scanner;

public class Ej1 {
    public static final String RED_BRIGHT = "\033[0;91m"; // RED
    public static final String GREEN_BRIGHT = "\033[0;92m"; // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String RESET = "\033[0m"; // Text Reset

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //Declaro las variables
        String contraseña = "";
        boolean caracEsp, minuscula, mayuscula, numero, espacio;
        int intentos = 1;

        System.out.print("Ingrese una contraseña: ");
        contraseña = sc.nextLine();

        //Compruebo si la contraseña esta vacia
        if (contraseña.equals("")) {
            System.out.println(RED_BRIGHT + "La contraseña debe tener al menos 8 caracteres" + RESET);
        } else {
            while (intentos < 4) {
                //Invoco cada funcion
                caracEsp = contieneCaracEsp(contraseña);
                mayuscula = contieneMayuscula(contraseña);
                minuscula = contieneMinuscula(contraseña);
                numero = contieneNumeros(contraseña);
                espacio = contieneEspacios(contraseña);
                //Compruebo cada validacion
                if ((caracEsp == true) && (mayuscula == true) && (minuscula == true) && (numero == true) && (espacio == false)) {
                    System.out.println(GREEN_BRIGHT + "Contraseña segura." + RESET);
                    intentos = 4;
                } else if (mayuscula == false) {
                    System.out
                            .println(RED_BRIGHT + "Error: La contraseña debe contener al menos un mayuscula." + RESET);
                    intentos++;
                } else if (caracEsp == false) {
                    System.out.println(
                            RED_BRIGHT + "Error: La contraseña debe contener al menos un caracter especial." + RESET);
                    intentos++;
                } else if (minuscula == false) {
                    System.out
                            .println(RED_BRIGHT + "Error: La contraseña debe contener al menos una minuscula." + RESET);
                    intentos++;
                } else if (numero == false) {
                    System.out.println(RED_BRIGHT + "Error: La contraseña debe contener al menos un numero." + RESET);
                    intentos++;
                } else if(espacio == true){
                    System.out.println(RED_BRIGHT + "La contraseña no puede contener ningun espacio" + RESET);
                }else{
                    System.out.println(RED_BRIGHT + "La contraseña debe tener al menos 8 caracteres" + RESET);
                    intentos++;
                }

                //Compruebo los intentos
                if (intentos < 4) {
                    System.out.print("Ingrese una contraseña: ");
                    contraseña = sc.nextLine();
                } else{
                    System.out.println(YELLOW_BRIGHT + "Numero maximo de intentos alcanzado." + RESET);
                }

            }
        }
        //Cierro el escaner
        sc.close();
    }

    public static boolean contieneCaracEsp(String contraseña) {
        String caracteresEspeciales = "!@#$%^&*()-_+=<>?/.,;:";
        for (int i = 0; i < contraseña.length(); i++) {
            if (caracteresEspeciales.indexOf(contraseña.charAt(i)) != -1) {
                return true;
            }
        }
        return false;
    }

    public static boolean contieneMayuscula(String contraseña) {
        for (int i = 0; i < contraseña.length(); i++) {
            if (Character.isUpperCase(contraseña.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean contieneMinuscula(String contraseña) {
        for (int i = 0; i < contraseña.length(); i++) {
            if (Character.isLowerCase(contraseña.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean contieneNumeros(String contraseña) {
        for (int i = 0; i < contraseña.length(); i++) {
            if (Character.isDigit(contraseña.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean contieneEspacios(String contraseña) {
        for (int i = 0; i < contraseña.length(); i++) {
            if (contraseña.charAt(i) == ' ') {
                return true;
            }
        }
        return false;
    }

}
