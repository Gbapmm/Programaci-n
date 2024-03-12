import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> enteros = new ArrayList<>();

        System.out.println("Introduzca 10 numeros enteros: ");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            enteros.add(numero);
        }

        Collections.sort(enteros);

        System.out.println("Números ordenados de menor a mayor:");
        for (int numero : enteros) {
            System.out.print(numero + " ");
        }

        scanner.close();
    }
}