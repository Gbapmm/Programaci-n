package HashMaps;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		RegistroEstudiantes registro = new RegistroEstudiantes();

		while (true) {
			System.out.println("--- Registro de Estudiantes ---");
			System.out.println("1. Agregar estudiante");
			System.out.println("2. Eliminar estudiante");
			System.out.println("3. Obbtener media de las notas");
			System.out.println("4. Mostrar lista de estudiantes	");
			System.out.println("5. Salir");
			
			System.out.println("Selecciona una opción");
			int opcion = scanner.nextInt();
			
			switch (opcion) {
			case 1:
				agregarEstudiante(registro, scanner);
				break;
			case 2:
				eliminarEstudiante(registro, scanner);
				break;
			case 3: 
				obtenerMedia(registro, scanner);
				break;
			case 4:
				registro.mostrarEstudiantes();
				break;
			case 5:
				System.out.println("Saliendo del programa...");
				System.exit(0);
			default:
				System.out.println("Opcion no válida");
				break;
			}
		}
	}
	
	public static void agregarEstudiante(RegistroEstudiantes registro, Scanner scanner) {
		System.out.println("Ingrese el nombre del nuevo estudiante");
		String nombre = scanner.next();
		System.out.println("Ingrese el id del nuevo estudiante");
		int id = scanner.nextInt();
		System.out.print("Ingrese la Media de calificaciones: ");
        double media = scanner.nextDouble();

        Estudiante nuevoEstudiante = new Estudiante(nombre, id, media);
        registro.agregarEstudiante(nuevoEstudiante);
        
    }
	
	private static void eliminarEstudiante(RegistroEstudiantes registro, Scanner scanner) {
        System.out.print("Ingrese el número de identificación del estudiante a eliminar: ");
        int idEliminar = scanner.nextInt();
        registro.eliminarEstudiante(idEliminar);
    }

	private static void obtenerMedia(RegistroEstudiantes registro, Scanner scanner) {
        System.out.print("Ingrese el número de identificación del estudiante: ");
        int idBuscar = scanner.nextInt();
        double promedio = registro.obtenerMedia(idBuscar);

        if (promedio != -1) {
            System.out.println("El promedio de calificaciones es: " + promedio);
        }
	}
}

