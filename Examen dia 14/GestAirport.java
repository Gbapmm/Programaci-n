package Examen14;

import java.util.Scanner;

public class GestAirport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Control control = new Control();
        long inicio = System.currentTimeMillis();

        while (true) {

            System.out.println("1. Mostrar cola de vuelos"
                    + "\n2. Añadir un nuevo vuelo"
                    + "\n3. Eliminar un vuelo"
                    + "\n4. Dar salida a un vuelo"
                    + "\n5. Actualizar lista de vuelos"
                    + "\n6. Modificar horarios de un vuelo"
                    + "\n7. Salir");

            System.out.println("Seleccione una opción:");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    control.showVuelos();
                    break;
                case 2:
                    control.darSalidaVuelo();
                    break;
                case 3:
                    control.actualizarListaVuelos();
                    break;
                case 4:
                    control.modificarHorariosVuelo();
                    break;
                case 5:
                    control.mostrarAgradecimiento();
                    scanner.close();
                    System.exit(0);
                    break;
            }
        }
    }
}
