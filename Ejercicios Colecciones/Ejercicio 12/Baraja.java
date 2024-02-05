package Ejercicio12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Baraja {
    private String[] figuras = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
    private String[] palos = {"copas", "espadas", "oros", "bastos"};
    private ArrayList<Carta> cartas = new ArrayList<>();
    private Random random = new Random();

    public Baraja(int cantidadCartas) {
        generarBaraja(cantidadCartas);
    }

    private void generarBaraja(int cantidadCartas) {
        Set<String> cartasElegidas = new HashSet<>();

        while (cartasElegidas.size() < cantidadCartas) {
            int indiceFigura = random.nextInt(figuras.length);
            int indicePalo = random.nextInt(palos.length);
            String figura = figuras[indiceFigura];
            String palo = palos[indicePalo];
            String cartaActual = figura + palo;

            if (cartasElegidas.add(cartaActual)) {
                int valor = asignarValor(figura);
                cartas.add(new Carta(figura, palo, valor));
            }
        }
    }

    private int asignarValor(String figura) {
        switch (figura) {
            case "as":
                return 11;
            case "tres":
                return 10;
            case "sota":
                return 2;
            case "caballo":
                return 3;
            case "rey":
                return 4;
            default:
                return 0;
        }
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }
}