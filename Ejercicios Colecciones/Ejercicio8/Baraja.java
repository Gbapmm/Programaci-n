package Ejercicio8;

import java.util.ArrayList;
import java.util.Collections;

class Baraja {
    private ArrayList<Carta> cartas;

    public Baraja() {
        this.cartas = generarBaraja();
    }

    public ArrayList<Carta> seleccionarCartasAleatorias(int cantidad) {
        Collections.shuffle(cartas);

        ArrayList<Carta> cartasSeleccionadas = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            cartasSeleccionadas.add(cartas.get(i));
        }

        return cartasSeleccionadas;
    }

    private ArrayList<Carta> generarBaraja() {
        ArrayList<Carta> baraja = new ArrayList<>();

        String[] palos = {"Oros", "Copas", "Espadas", "Bastos"};
        String[] numeros = {"As", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};

        for (String palo : palos) {
            for (String numero : numeros) {
                baraja.add(new Carta(palo, numero));
            }
        }

        return baraja;
    }
}