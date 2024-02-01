package Ejercicio14;

public class FichaDomino {
    private int ladoIzquierdo;
    private int ladoDerecho;

    public FichaDomino(int ladoIzquierdo, int ladoDerecho) {
        this.ladoIzquierdo = validarNumero(ladoIzquierdo);
        this.ladoDerecho = validarNumero(ladoDerecho);
    }

    private int validarNumero(int numero) {
        if (numero < 0 || numero > 6) {
            return 0; 
        }
        return numero;
    }

    public FichaDomino voltea() {
        return new FichaDomino(ladoDerecho, ladoIzquierdo);
    }

    public boolean encaja(FichaDomino otraFicha) {
        boolean izquierdoIgual = ladoIzquierdo == 0 || otraFicha.ladoIzquierdo == 0;
        boolean derechoIgual = ladoDerecho == 0 || otraFicha.ladoDerecho == 0;
    
        return izquierdoIgual || derechoIgual;
    }
    

    @Override
    public String toString() {
        return "[" + (ladoIzquierdo == 0 ? " " : ladoIzquierdo) + "|" + (ladoDerecho == 0 ? " " : ladoDerecho) + "]";
    }
}
