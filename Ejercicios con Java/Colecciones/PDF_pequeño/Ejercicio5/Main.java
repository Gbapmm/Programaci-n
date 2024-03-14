package Ejercicio5;

import java.util.Scanner;

public class Main {
  private static final String String = null;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Diccionario diccionario = new Diccionario();
    String gallego = "";

    while (true) {
      System.out.println("1. Añadir un nuevo termino.\n"
          + "2. Buscar termino exacto.\n"
          + "3. Buscar termino que comineza con...\n"
          + "4. Modificar termino\n"
          + "5. Eliminar termino\n"
          + "6. Salir");

      System.out.println("Selecciona una opcion: ");
      int opcion = scanner.nextInt();

      switch (opcion) {
        case 1:
          System.out.println("Introduce el nuevo termino (castellano): ");
          String castellano = scanner.next();
          scanner.nextLine();
          System.out.println("Introduce el nuevo termino (gallego): ");
          gallego = scanner.next();
          scanner.nextLine();
          diccionario.añadirTermino(castellano, gallego);
          System.out.println("Termino añadido correctamente.");
          break;
        case 2:
          System.out.println("Introduce el termino a buscar (en castellano)");
          castellano = scanner.next();
          scanner.nextLine();
          diccionario.buscarTermino(castellano, gallego);
          break;
        case 4:
          System.out.println("Introduce el termino a modificar (en castellano) ");
          castellano = scanner.next();
          scanner.nextLine();
          System.out.println("Introduce la nueva traducción (en gallego): ");
          String gallegoNuevo = scanner.nextLine();
          diccionario.modificarTermino(castellano, gallegoNuevo);
          break;
          case 5:
          System.out.println("Introduce el termino a eliminar (en castellano) ");
          castellano = scanner.next();
          scanner.nextLine();
          diccionario.eliminarTermino(castellano, gallego);
          break;
        case 6:
          System.out.println("Saliendo del programa...");
          scanner.close();
          System.exit(0);
          break;
        default:
          break;
      }
    }
  }
}
