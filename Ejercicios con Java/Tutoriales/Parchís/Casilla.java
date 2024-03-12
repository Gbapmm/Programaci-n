package Parchís;

public class Casilla {
    private int numero;

    public Casilla(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return numero;
    }
    public String toString(){
        return "[" + numero + "]";
    }

}
