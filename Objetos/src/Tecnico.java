public class Tecnico extends Empleado implements CalculosLaborales {
    public static final int DIAS = 20;
    private static String especialidad;

    /**
     * Constructor de clase Tecnico
     * 
     * @param nombre
     * @param edad
     * @param idEmpleado
     * @param salarioBase
     * @param anosDeTrabajo
     * @param especialidad
     * @author Antonio Dominguez Carmona
     */
    public Tecnico(String nombre, int edad, String idEmpleado, double salarioBase, int anosDeTrabajo,
            String especialidad) {
        super(nombre, edad, idEmpleado, salarioBase, anosDeTrabajo);
        Tecnico.especialidad = especialidad;
    }

    @Override
    public double calcularBonificacion() {

        int bonificación;
        switch (especialidad) {
            case "Seguridad":
                bonificación = 1200;
                break;
            case "Redes":
                bonificación = 1000;
                break;
            default:
                bonificación = 800;
                break;
        }

        System.out.println("La bonificacion es de: "+ bonificación);
        return bonificación;
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
        String cadena = super.toString() + ", Especialidad: " + especialidad;

        System.out.println(cadena);

        return cadena;
    }

}
