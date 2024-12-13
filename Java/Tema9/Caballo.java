package PROG.Java.Tema9;

public class Caballo {
    String nombre, raza, color;

    public Caballo(String nombre, String raza, String color) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    public String toString(){

        return nombre + " de raza " + raza + " y de color " + color;
    }

    public static void main(String[] args) {
        Caballo becerro = new Caballo("DANI","Poni", "negro");

        System.out.println(becerro);
        
    }
}


