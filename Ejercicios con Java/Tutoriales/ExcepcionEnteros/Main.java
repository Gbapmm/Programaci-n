package EdadUsuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Introduzca su edad: ");

                if (!scanner.hasNextInt()) {
                    throw new ExcepcionEnteros("Error: La entrada no es un número entero.");
                }

                int edad = scanner.nextInt();

                if (edad < 0) {
                    throw new ExcepcionEnteros("Error: La edad no puede ser negativa.");
                }

                System.out.println("Su edad es de: " + edad);
                break;
            } catch (ExcepcionEnteros e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}
