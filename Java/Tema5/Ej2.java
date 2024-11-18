import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;

        while (i <= 100) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        sc.close();
    }
}
