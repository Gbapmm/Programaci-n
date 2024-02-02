package Ejercicio10;


import java.util.HashMap;
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

    Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra en español: ");
        String palabraEspañol = scanner.nextLine();

        String traduccion = diccionario.get(palabraEspañol);

        if (traduccion != null) {
            System.out.println("La traducción al inglés es: " + traduccion);
        } else {
            System.out.println("La palabra ingresada no está en el diccionario.");
        }
    }
}