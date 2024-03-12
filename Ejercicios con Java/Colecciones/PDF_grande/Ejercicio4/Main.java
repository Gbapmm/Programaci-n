import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> palabras = new ArrayList<>();

        System.out.println("Introduzca 10 palabras:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            String palabra = scanner.next();
            palabras.add(palabra);
        }

        Collections.sort(palabras);

        System.out.println("Paalbras ordenados:");
        for (String palabra : palabras) {
            System.out.print(palabra + " ");
        }

        scanner.close();
    }
}