import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;

        do {

            if (i % 5 == 0) {
                System.out.println(i + " ");
            }

            i++;
        } while (i <= 100);

        sc.close();
    }
}
