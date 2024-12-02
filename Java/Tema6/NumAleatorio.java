package PROG.Java.Tema6;
import java.util.Scanner;

public class NumAleatorio {
    public static final String RED_BRIGHT = "\033[0;91m"; // RED
    public static final String GREEN_BRIGHT = "\033[0;92m"; // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String RESET = "\033[0m"; // Text Reset

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declaro las variables
        int dado1, dado2, suma, puntos1 = 0, puntos2 = 0, puntos3 = 0, puntObj = 2;

        System.out.println(YELLOW_BRIGHT + "CHICAGO" + RESET);

        // Realizo un for para las rondas
        for (int i = 1; i < 12; i++) {

            System.out.println(RED_BRIGHT + "Ronda " + i + " ; " + "Puntuacion objetivo: " + puntObj + RESET);

            // Dentro realizo otro for para mostrar la informacion de cada ronda
            for (int j = 1; j < 4; j++) {
                dado1 = (int) (Math.random() * 6) + 1;
                dado2 = (int) (Math.random() * 6) + 1;
                suma = dado1 + dado2;

                // Hago un switch para los diferentes juagadores
                switch (j) {
                    case 1:
                        if ((suma == puntObj) && (puntos1 == 1)) {
                            puntos1++;
                            System.out.println("Tirada del jugador " + j + ": " + dado1 + "-" + dado2 + " ; " + puntos1
                                    + " puntos");
                        } else if ((suma == puntObj)) {
                            puntos1++;
                            System.out.println("Tirada del jugador " + j + ": " + dado1 + "-" + dado2 + " ; " + puntos1
                                    + " punto");
                        } else {
                            System.out.println("Tirada del jugador " + j + ": " + dado1 + "-" + dado2 + " ; " + puntos1
                                    + " puntos");
                        }
                        break;
                    case 2:
                        if ((suma == puntObj) && (puntos2 == 1)) {
                            puntos2++;
                            System.out.println("Tirada del jugador " + j + ": " + dado1 + "-" + dado2 + " ; " + puntos2
                                    + " puntos");
                        } else if (suma == puntObj) {
                            puntos2++;
                            System.out.println("Tirada del jugador " + j + ": " + dado1 + "-" + dado2 + " ; " + puntos2
                                    + " punto");
                        } else {
                            System.out.println("Tirada del jugador " + j + ": " + dado1 + "-" + dado2 + " ; " + puntos2
                                    + " puntos");
                        }
                        break;

                    default:
                        if ((suma == puntObj) && (puntos3 == 1)) {
                            puntos3++;
                            System.out.println("Tirada del jugador " + j + ": " + dado1 + "-" + dado2 + " ; " + puntos3
                                    + " puntos");
                        } else if (suma == puntObj) {
                            puntos3++;
                            System.out.println("Tirada del jugador " + j + ": " + dado1 + "-" + dado2 + " ; " + puntos3
                                    + " punto");
                        } else {
                            System.out.println("Tirada del jugador " + j + ": " + dado1 + "-" + dado2 + " ; " + puntos3
                                    + " puntos");
                        }
                        break;
                }
                // Reinicio la variable "suma" para que no se acumule
                suma = 0;
            }

            // Finalmente incremento la puntuacion objetivo y muestro las puntuaciones
            // generales
            System.out.println("Puntuaciones generales: Jugador 1 - " + puntos1 + " puntos ; Jugador 2 - " + puntos2
                    + " puntos ; Jugador 3 - " + puntos3 + " puntos");

            puntObj++;

            if (i == 11) {
                System.out.println("");
                System.out.println("Fin de la partida");
            } else {
                System.out.println("Pulse INTRO para la siguiente ronda");
                sc.nextLine();
            }
        }
        sc.close();
    }
}
