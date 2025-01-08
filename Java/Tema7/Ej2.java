package PROG.Java.Tema7;

public class Ej2 {
    public static void main(String[] args) {
        
        char[] caracteres = new char[10];

        caracteres[0] = 'a';
        caracteres[1] = 'x';
        caracteres[4] = '@';
        caracteres[6] = ' ';
        caracteres[7] = '+';
        caracteres[8] = 'Q';

        for (int i = 0; i < caracteres.length; i++) {
            System.out.print(caracteres[i] + " ");
        }

    }
}
