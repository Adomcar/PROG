import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <= 100; i++) {

            if (i % 5 == 0) {
                System.out.print(i + " ");
            }

        }

        sc.close();
    }
}
