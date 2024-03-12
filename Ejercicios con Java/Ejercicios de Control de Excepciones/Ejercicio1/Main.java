import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Introduzca 6 números:");

        for (int i = 0; i < 6; ) {
            try {
                System.out.print("Número " + (i + 1) + ": ");
                int numero = scanner.nextInt();
                numeros.add(numero);
                i++;
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número entero válido.");
                scanner.nextLine(); // Limpiar el buffer del scanner
            }
        }

        int maximo = encontrarMaximo(numeros);

        System.out.println("El número máximo es: " + maximo);

        scanner.close();
    }

    private static int encontrarMaximo(ArrayList<Integer> numeros) {
        int maximo = Integer.MIN_VALUE;
        for (int numero : numeros) {
            if (numero > maximo) {
                maximo = numero;
            }
        }
        return maximo;
    }
}
