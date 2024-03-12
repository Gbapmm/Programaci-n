package Ejercicio14;

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
			System.out.println("Introduzca un producto a comprar. Introduzca 'fin' para finalizar su compra");
			String producto = scanner.nextLine();

			if (producto.equals("fin")) {
				break;
			}

			System.out.println("Introduzca la cantidad del producto:");
			int cantidad = scanner.nextInt();
			scanner.nextLine();

			if (productos.containsKey(producto)) {
				compra.put(producto, compra.getOrDefault(producto, 0) + cantidad);
			} else {
				System.out.println("El producto introducido no existe.");
			}
		}
		
		System.out.println("Producto\tPrecio\tCantidad\tSubtotal");
		System.out.println("------------------------------------------------");
		
		double total = 0;
		
		for(Map.Entry<String, Integer> entry : compra.entrySet()) {
			String producto = entry.getKey();
			int cantidad = entry.getValue();
            double precioUnidad = productos.get(producto);
            double subtotal = precioUnidad * cantidad;
            
            System.out.printf("%s\t\t%.2f\t%d\t\t%.2f\n", producto, precioUnidad, cantidad, subtotal);

            total += subtotal;
		}
		
		System.out.println("--------------------------------------");
        System.out.printf("TOTAL:\t\t\t\t\t%.2f\n", total);

    
        scanner.close();
		
	}
		
}
