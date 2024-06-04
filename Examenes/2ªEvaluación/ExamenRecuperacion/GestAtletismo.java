package Examen;

import java.util.Scanner;

public class GestAtletismo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=== MENU ===");
            System.out.println("Seleccione una opcion");
            System.out.println("1. Crear una carrera");
            System.out.println("2. Insertar participantes");
            System.out.println("3. Simular carrera ");
            System.out.println("4. Mostrar los resultados ordenados");
            System.out.println("5. Salir");

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    Control.crearCarrera();
                    break;
                case 2:
                    Control.insertarP();
                    break;
                case 3:
                    Control.simCarrera();
                    break;
                case 4:
                    Control.resultCarrera();
                    break;
                case 5:
                    Control.Salir();
                    break;
            }
        }
    }
}
