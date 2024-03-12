package HashMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Map<String, Integer> inventario = new HashMap<>();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("1. Agregar producto\n2. Actualizar cantidad\n3. Mostrar inventario\n4. Salir");
			System.out.print("Selecciona una opción: ");
			int opcion = scanner.nextInt();

			switch (opcion) {
			case 1:
				agregarProducto(inventario, scanner);
				break;
			case 2:
				actualizarCantidad(inventario, scanner);
				break;
			case 3:
				mostrarInventario(inventario);
				break;
			case 4:
				System.out.println("Saliendo del programa. ¡Hasta luego!");
				System.exit(0);
			default:
				System.out.println("Opción no válida. Inténtalo de nuevo.");
			}
		}
	}

	private static void agregarProducto(Map<String, Integer> inventario, Scanner scanner) {
		System.out.print("Ingrese el nombre del producto: ");
		String producto = scanner.next();
		System.out.print("Ingrese la cantidad en stock: ");
		int cantidad = scanner.nextInt();

		inventario.put(producto, cantidad);
		System.out.println(producto + " agregado al inventario.");
	}

	private static void actualizarCantidad(Map<String, Integer> inventario, Scanner scanner) {
		System.out.print("Ingrese el nombre del producto: ");
		String producto = scanner.next();

		if (inventario.containsKey(producto)) {
			System.out.print("Ingrese la nueva cantidad en stock: ");
			int nuevaCantidad = scanner.nextInt();

			inventario.put(producto, nuevaCantidad);
			System.out.println("Cantidad actualizada para " + producto + ".");
		} else {
			System.out.println("El producto no existe en el inventario.");
		}
	}

	private static void mostrarInventario(Map<String, Integer> inventario) {
		System.out.println("\nInventario:");
		for (Map.Entry<String, Integer> entry : inventario.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		System.out.println();
	}
}