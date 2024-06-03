package Examen;


public class HorarioVueloException extends Exception {
    public HorarioVueloException(){
        super("La hora no puede ser anterior a la hora actual");
    }
}
