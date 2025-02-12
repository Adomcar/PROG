public abstract class Empleado {

    private String nombre;
    private int edad;
    private String idEmpleado;
    private double salarioBase;
    private int anosDeTrabajo;
    private static int totalEmpleados = 0;

    /**
     * Constructor de la clase Empleado
     * 
     * @param nombre
     * @param edad
     * @param idEmpleado
     * @param salarioBase
     * @param anosDeTrabajo
     * @author Antonio Dominguez Carmona
     */
    public Empleado(String nombre, int edad, String idEmpleado, double salarioBase, int anosDeTrabajo) {
        this.nombre = nombre;
        this.edad = edad;
        this.idEmpleado = idEmpleado;
        this.salarioBase = salarioBase;
        this.anosDeTrabajo = anosDeTrabajo;
        totalEmpleados++;
    }

    // GETTERS AND SETTERS

    public static int getTotalEmpleados() {
        return totalEmpleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getAnosDeTrabajo() {
        return anosDeTrabajo;
    }

    public void setAnosDeTrabajo(int anosDeTrabajo) {
        this.anosDeTrabajo = anosDeTrabajo;
    }

    @Override
    public String toString() {
        String cadena = "Empleado: " + nombre + ", Edad: " + edad + ", ID: " + idEmpleado + ", Salario base: "
                + salarioBase
                + ", Años de trabajo: " + anosDeTrabajo;
                
        return cadena;
    }

}
