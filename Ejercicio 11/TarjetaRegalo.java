package Ejercicio11;

import java.util.Random;

public class TarjetaRegalo {
    int numero;
    double saldo;

    public TarjetaRegalo(double saldo){
       this.numero = generarNumeroAleatorio();
        this.saldo = saldo;
    }

    private int generarNumeroAleatorio(){
        Random random = new Random();
        return random.nextInt(90000) + 10000;
    }

    public void gasta(double cantidad){
        if (cantidad > saldo){
            System.out.println("No tiene suficiente saldo");
        }
    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo otraTarjeta) {
        double nuevoSaldo = this.saldo + otraTarjeta.saldo;
        TarjetaRegalo nuevaTarjeta = new TarjetaRegalo(nuevoSaldo);

        this.saldo = 0;
        otraTarjeta.saldo = 0;

        return nuevaTarjeta;
    }
    @Override
    public String toString(){
        return "Tarjeta no " + numero + " – Saldo " + String.format("%.2f", saldo) + "€";
    }
}
