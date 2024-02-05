package Ejercicio12;

public class Carta {
    private String figura;
    private String palo;
    private int valor;

    public Carta(String figura, String palo, int valor) {
        this.figura = figura;
        this.palo = palo;
        this.valor = valor;
    }

    public String getFigura() {
        return figura;
    }

    public String getPalo() {
        return palo;
    }

    public int getValor() {
        return valor;
    }
}
