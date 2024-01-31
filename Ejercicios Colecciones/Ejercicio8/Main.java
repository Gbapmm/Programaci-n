package Ejercicio8;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        ArrayList<Carta> cartasSeleccionadas = baraja.seleccionarCartasAleatorias(10);

        System.out.println("Cartas seleccionadas al azar:");
        for (Carta carta : cartasSeleccionadas) {
            System.out.println(carta);
        }
    }
}