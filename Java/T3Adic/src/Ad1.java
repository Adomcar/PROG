import java.util.Scanner;

public class Ad1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        String Nombre,Descripcion;
        Double Cantidad, PrecioU;
        Double Total_Sin_Imp, Total, Imp;

        System.out.print("Introduze tu nombre y apellidos: ");
        Nombre = sc.nextLine();

        System.out.print("Introduce la descripcion del producto: ");
        Descripcion = sc.nextLine();

        System.out.println("Introduce la cantidad del producto que deseas comprar: ");
        Cantidad = sc.nextDouble();
        sc.nextLine();

        System.out.println("Introduce el precio unitario del producto: ");
        PrecioU = sc.nextDouble();
        sc.nextLine();

        Total_Sin_Imp = Cantidad * PrecioU;
        Imp = Total_Sin_Imp * 0.21;
        Total = Total_Sin_Imp + Imp;


        System.out.printf("%-10s \n","Cliente:                     " + Nombre);        
        System.out.printf("%-10s \n","Producto:                    " + Descripcion);
        System.out.printf("%-10s   %8.2f\n","Cantidad:                ", Cantidad);
        System.out.printf("%-10s   %8.2f\n","Precio Unitario:         ", PrecioU);
        System.out.printf("%-10s   %8.2f\n","Total sin impuestos:     ", Total_Sin_Imp);
        System.out.printf("%-10s   %8.2f\n","Impuesto:                ", Imp);
        System.out.printf("%-10s   %8.2f\n","Total con impuestos:     ", Total);

    }
}
