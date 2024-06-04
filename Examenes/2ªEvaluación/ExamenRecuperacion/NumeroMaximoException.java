
package Examen;

public class NumeroMaximoException extends Exception {
    public NumeroMaximoException(){
    super("No se pueden añadir mas corredores que el maximo de participantes");
    }
}
