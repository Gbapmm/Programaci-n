package Ejercicio12;

import java.util.ArrayList;


public class JuegoBrisca {
    public void jugar() {
        Baraja baraja = new Baraja(5);

        // Mostrar la secuencia de cartas generadas
        System.out.println("Secuencia de cartas:");
        for (Carta carta : baraja.getCartas()) {
            System.out.println(carta.getFigura() + " de " + carta.getPalo());
        }

        // Calcular la puntuación
        int puntuacion = calcularPuntuacion(baraja.getCartas());
        System.out.println("\nPuntuación total: " + puntuacion);
    }

    private int calcularPuntuacion(ArrayList<Carta> cartas) {
        int puntuacion = 0;

        for (Carta carta : cartas) {
            puntuacion += carta.getValor();
        }

        return puntuacion;
    }
}