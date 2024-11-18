import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 320; i >= 160; i -= 20) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
