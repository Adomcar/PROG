public class Administrativo extends Empleado implements CalculosLaborales {

    public static final int DIAS = 15;
    public static final int TAREAS = 30;
    private static String area;

    /**
     * Constructor de la clase Administrativo
     * 
     * @param nombre
     * @param edad
     * @param idEmpleado
     * @param salarioBase
     * @param anosDeTrabajo
     * @param area
     * @author Antonio Dominguez Carmona
     */
    public Administrativo(String nombre, int edad, String idEmpleado, double salarioBase, int anosDeTrabajo,
            String area) {
        super(nombre, edad, idEmpleado, salarioBase, anosDeTrabajo);
        Administrativo.area = area;
    }

    @Override
    public double calcularBonificacion() {
        double bonificacion;
        if (area == "Recursos Humanos") {
            bonificacion = 20 * TAREAS;
        } else {
            bonificacion = 10 * TAREAS;
        }

        System.out.println("La bonificaion es de: ");
        return bonificacion;
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
        String cadena = super.toString() + ", Area: " + area;

        System.out.println(cadena);

        return cadena;
    }
}