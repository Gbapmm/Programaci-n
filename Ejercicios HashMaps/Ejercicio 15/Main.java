package Ejercicio15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Map<String, Double> productos = new HashMap<>();
		productos.put("Avena", 2.21);
		productos.put("Garbanzos", 2.39);
		productos.put("Tomate", 1.59);
		productos.put("Jengibre", 3.13);
		productos.put("Quinoa", 4.50);
		productos.put("Guisantes", 1.60);

		Map<String, Integer> compra = new HashMap<>();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Introduzca un producto a comprar. Introduzca 'fin' para finalizar su compra:");
			String producto = scanner.nextLine();

			if (producto.equals("fin")) {
				break;
			}

			System.out.println("Introduzca la cantidad del producto:");
			int cantidad = scanner.nextInt();
			scanner.nextLine();

			if (compra.containsKey(producto)) {
				compra.put(producto, compra.get(producto) + cantidad);
			} else {
				compra.put(producto, cantidad);
			}
		}
		System.out.println("Introduzca el código de descuento (o deje en blanco si no tiene):");
		String codigoDescuento = scanner.nextLine();

		double total = calcularTotal(productos, compra);

		if (codigoDescuento.equals("ECODTO")) {
			double descuento = total * 0.10;
			total -= descuento;
			System.out.println("Descuento aplicado: 10%");
		}

		System.out.println("\nProducto\tPrecio\tCantidad\tSubtotal");
		System.out.println("--------------------------------------");

		for (Map.Entry<String, Integer> entry : compra.entrySet()) {
			String producto = entry.getKey();
			int cantidad = entry.getValue();
			double precioUnidad = productos.get(producto);
			double subtotal = precioUnidad * cantidad;

			System.out.printf("%s\t\t%.2f\t%d\t\t%.2f\n", producto, precioUnidad, cantidad, subtotal);
		}

		System.out.println("--------------------------------------");
		System.out.printf("TOTAL:\t\t\t\t\t%.2f\n", total);

		scanner.close();
	}

	private static double calcularTotal(Map<String, Double> productos, Map<String, Integer> compra) {
		double total = 0;

		for (Map.Entry<String, Integer> entry : compra.entrySet()) {
			String producto = entry.getKey();
			int cantidad = entry.getValue();

			if (productos.containsKey(producto)) {
				Double precioUnidad = productos.get(producto);

				if (precioUnidad != null) {
					total += precioUnidad * cantidad;
				} else {
					System.out.println("Error: El precio del producto '" + producto + "' es nulo.");
				}
			} else {
				System.out.println("Error: El producto '" + producto + "' no existe en el mapa de productos.");
			}
		}

		return total;
	}

}
