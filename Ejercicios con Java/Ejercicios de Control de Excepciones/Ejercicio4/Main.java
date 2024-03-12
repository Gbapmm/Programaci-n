package Ejercicio1;

public class Main {

    public static void main(String[] args) {
    	viaje viajeObjeto = new viaje();
    	String origen = "Ferrol";
    	String destino = "Salamanca";

    	String resultadoViaje = viaje.viaje(origen, destino);

    	System.out.println("Resultado del viaje: " + resultadoViaje);
    	
    	/*
    	 * Las posibles salidas por pantalla son:
    	 * 
    	 * El viaje continua hasta el destino
    	 * No llego nunca, debido a un accidente grave
    	 * Llego tarde, debido a un accidente leve
    	 * 
    	 */
    }
}