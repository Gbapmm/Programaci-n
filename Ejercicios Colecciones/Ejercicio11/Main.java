package Ejercicio11;

import java.util.HashMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("Casa", "House");
        diccionario.put("Perro", "Dog");
        diccionario.put("Puerta", "Door");
        diccionario.put("Ordenador", "Computer");
        diccionario.put("Raton", "Mouse");
        diccionario.put("Ciudad", "City");
        diccionario.put("Cancion", "Song");
        diccionario.put("Pelota", "Ball");
        diccionario.put("Jardin", "Garden");
        diccionario.put("Amarillo", "Yellow");
        diccionario.put("Rojo", "Red");
        diccionario.put("Azul", "Blue");
        diccionario.put("Verde", "Green");
        diccionario.put("Manzana", "Apple");
        diccionario.put("Banana", "Banana");
        diccionario.put("Sol", "Sun");
        diccionario.put("Luna", "Moon");
        diccionario.put("Arbol", "Tree");
        diccionario.put("Agua", "Water");
        diccionario.put("Llave", "Key");
        diccionario.put("Tijeras", "Scissors");

        // 5 palabras aleatorias
        String[] palabrasElegidas = generarPalabras(diccionario, 5);

        Scanner scanner = new Scanner(System.in);

        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;

        // Pide al usuario la traduccion
        for (String palabraEspañol : palabrasElegidas) {
            System.out.print("Traduce '" + palabraEspañol + "' al inglés: ");
            String respuestaUsuario = scanner.nextLine();

            // Revisa si la traduccion es correcta
            String traduccionCorrecta = diccionario.get(palabraEspañol);
            if (respuestaUsuario.equalsIgnoreCase(traduccionCorrecta)) {
                respuestasCorrectas++;
            } else {
                respuestasIncorrectas++;
            }
        }

        // resultado
        System.out.println("\nResumen:");
        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);

        scanner.close();
    }

    // Funcion que selecciona n palabras
    private static String[] generarPalabras(Map<String, String> dictionary, int n) {
        String[] palabras = dictionary.keySet().toArray(new String[0]);
        Random random = new Random();

        for (int i = palabras.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            String temp = palabras[i];
            palabras[i] = palabras[index];
            palabras[index] = temp;
        }

        return Arrays.copyOfRange(palabras, 0, n);
    }
}
