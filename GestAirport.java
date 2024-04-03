package Examen_2º_Ev_2;


import java.util.Scanner;

public class GestAirport {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Control control = new Control();

        long start = System.currentTimeMillis();

        while (true) {
            System.out.println("1. Mostrar cola de vuelos ordenada.\n" +
                    "2. Dar salida a un vuelo.\n" +
                    "3. Actualizar lista de vuelos.\n" +
                    "4. Modificar horarios de un vuelo.\n" +
                    "5. Salir\n");

            System.out.println("Selecciona la acción a realizar: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    control.salir(start);
                    System.exit(0);
                    break;
            }
        }
    }
}
