package ExamenYo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GestAirport {
    public static void main(String[] args) throws FechaHoraSalidaNoValidaException {
        Scanner scanner = new Scanner(System.in);
        Control control = new Control();

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
                try {
                    System.out.println("Introduzca los datos del nuevo vuelo: ");
                    System.out.println("Código del vuelo:");
                    String idVuelo = scanner.next();
                    scanner.nextLine();
                    System.out.println("Origen del vuelo:");
                    String origenVuelo = scanner.next();
                    scanner.nextLine();
                    System.out.println("Destino del vuelo:");
                    String destinoVuelo = scanner.next();
                    scanner.nextLine();
                    System.out.println("Hora de llegada (yyyy-MM-dd HH:mm):");
                    LocalDateTime horaLlegada = LocalDateTime.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
                    System.out.println("Hora de salida (yyyy-MM-dd HH:mm):");
                    LocalDateTime horaSalida = LocalDateTime.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
                    
                    // Añadir vuelo a la cola
                    control.agregarVuelo(idVuelo, origenVuelo, destinoVuelo, horaLlegada, horaSalida);
                } catch (FechaHoraSalidaNoValidaException e) {
        
                    System.out.println("Error: " + e.getMessage() + "\n");
                }
                    break;
                case 3:
                    System.out.println("Introduzca el código del vuelo a eliminar:");
                    String idVuelo = scanner.next();
                    control.eliminarVuelo(idVuelo);
                    break;
                case 4:
                    System.out.println("Introduzca el código del vuelo que saldrá:");
                    idVuelo = scanner.next();
                    control.darSalidaVuelo(idVuelo);
                    break;
                case 5:
                    break;
                case 6:
                try {
                    System.out.print("Ingrese código de vuelo: ");
                    idVuelo = scanner.next();
                    System.out.print("Ingrese retraso en minutos: ");
                    int retraso = scanner.nextInt();
                    if (retraso < 0) {
                        throw new ValorNoValidoException();
                    }
                    control.retrasarVuelo(idVuelo, retraso);
                } catch (ValorNoValidoException e) {
                    System.out.println("Error: " + e.getMessage() + "\n");
                }
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
