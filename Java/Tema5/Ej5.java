import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 320;

        while (i >= 160) {
            System.out.print(i + " ");
            i -= 20;
        }
        sc.close();
    }
}
