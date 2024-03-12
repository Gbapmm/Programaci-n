package Ejercicio8;

class Carta {
    String palo;
    String numero;

    public Carta(String palo, String numero) {
        this.palo = palo;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return numero + " de " + palo;
    }
}