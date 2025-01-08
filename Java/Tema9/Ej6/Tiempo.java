package PROG.Java.Tema9.Ej6;

public class Tiempo {
    private int hora;
    private int minutos;
    private int segundos;

    public Tiempo(int h, int min, int seg){
        int seg2;
        int min2;
        if(segundos == 60){
            this.minutos++;
            seg2 = seg -60;
        }else if(minutos == 60){
            this.hora++;
        }else{
            this.hora = h;
            this.minutos = min;
            this.segundos = seg;
        }
    }

    public int getHora() {
        return this.hora;
    }

    public int getMinutos() {
        return this.minutos;
    }

    public int getSegundos() {
        return this.segundos;
    }

    public Tiempo suma(Tiempo t){
        return new Tiempo(this.hora, this.minutos, this.segundos + t.getSegundos());
    }

    
}
