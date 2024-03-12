package Ejercicio16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<String, String> capitales = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void aprenderCapital(String pais) {
        System.out.print("Ingrese la capital de " + pais + ": ");
        String capital = scanner.nextLine();
        capitales.put(pais, capital);
        System.out.println("Se ha aprendido la capital de " + pais + ".");
    }

    public static String obtenerCapital(String pais) {
        return capitales.get(pais);
    }

    public static void main(String[] args) {

        capitales.put("España", "Madrid");
        capitales.put("Portugal", "Lisboa");
        capitales.put("Francia", "París");

        while (true) {
            System.out.print("Ingrese un país (o escriba 'salir' para salir): ");
            String pais = scanner.nextLine();

            if (pais.equalsIgnoreCase("salir")) {
                System.out.println("Saliendo...");
                break;
            }

            String capitalExistente = obtenerCapital(pais);

            if (capitalExistente != null) {
                System.out.println("La capital de " + pais + " es " + capitalExistente + ".");
            } else {
                System.out.println("No se conoce la capital de " + pais + ".");
                System.out.print("¿Desea aprender la capital? (SI/NO): ");
                String aprender = scanner.nextLine();

                if (aprender.equalsIgnoreCase("SI")) {
                    aprenderCapital(pais);
                }
            }
        }
        
        scanner.close();
    }
}