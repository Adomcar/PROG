public class Empresa {
    public static void main(String[] args) {
        Empleado Empleados[] = new Empleado[3];

        Empleados[0] = new Tecnico("Antonio", 23, "G502", 1350, 6, "Redes");
        Empleados[1] = new Gestor("Daniel", 25, "M777", 1200, 4, 85000);
        Empleados[2] = new Administrativo("Hugo", 123, "C004", 1000, 3, "Barrendero");

        Empleados[0].toString();
        ((Tecnico) Empleados[0]).calcularSalario();
        ((Tecnico) Empleados[0]).calcularVacaciones();

        System.out.println("");

        Empleados[1].toString();
        ((Gestor) Empleados[1]).calcularSalario();
        ((Gestor) Empleados[1]).calcularVacaciones();

        System.out.println("");

        Empleados[2].toString();
        ((Administrativo) Empleados[2]).calcularSalario();
        ((Administrativo) Empleados[2]).calcularVacaciones();

    }
}
