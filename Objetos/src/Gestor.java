public class Gestor extends Empleado implements CalculosLaborales {
    public static final int DIAS = 30;
    private static double presupuesto;

    /**
     * Constructor de la clase Gestor
     * 
     * @param nombre
     * @param edad
     * @param idEmpleado
     * @param salarioBase
     * @param anosDeTrabajo
     * @param presupuesto
     * @author Antonio Dominguez Carmona
     */
    public Gestor(String nombre, int edad, String idEmpleado, double salarioBase, int anosDeTrabajo,
            double presupuesto) {
        super(nombre, edad, idEmpleado, salarioBase, anosDeTrabajo);
        Gestor.presupuesto = presupuesto;
    }

    @Override
    public double calcularBonificacion() {
        System.out.println("La bonificacion es de");
        return presupuesto * 0.05;
    }

    @Override
    public double calcularSalario() {
        double totalSalario;
        totalSalario = getSalarioBase() + calcularBonificacion();
        System.out.println("El salario total es de:" + totalSalario);
        return totalSalario;
    }

    @Override
    public int calcularVacaciones() {
        int vacaciones = DIAS * getAnosDeTrabajo();
        System.out.println("Estos son tus dias de vacaciones:" + vacaciones );
        return vacaciones;
    }

    @Override
    public String toString() {
        String cadena = super.toString() + ", Presupuesto: " + presupuesto;

        System.out.println(cadena);

        return cadena;
    }
}
