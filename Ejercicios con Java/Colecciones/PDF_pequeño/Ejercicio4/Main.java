package Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        while (true) {
            System.out.println("1. Añadir libro\n" +
                    "2. Borrar libro\n" +
                    "3. Modificar libro\n" +
                    "4. Buscar libro\n" +
                    "5. Salir");
            System.out.println("Selecciona una opcion");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el ISBN: ");
                    String isbn = scanner.next();
                    scanner.nextLine();
                    System.out.println("Introduce el Titulo: ");
                    String titulo = scanner.next();
                    scanner.nextLine();
                    System.out.println("Introduce el Autor: ");
                    String autor = scanner.next();
                    scanner.nextLine();
                    biblioteca.añadirLibro(new Libro(isbn, titulo, autor));
                    break;
                case 2:
                    System.out.println("introduce el ISBN del libro a eliminar: ");
                    isbn = scanner.next();
                    scanner.nextLine();
                    biblioteca.eliminarLibro(isbn);
                    break;
                case 3:
                    System.out.println("Introduce el ISBN del libro que deseas modificar: ");
                    String ISBN = scanner.next();
                    scanner.nextLine();
                    System.out.println(
                            "Introduce el nuevo título del libro (o presiona Enter para mantener el actual): ");
                    String nuevoTitulo = scanner.nextLine();
                    System.out
                            .println("Introduce el nuevo autor del libro (o presiona Enter para mantener el actual): ");
                    String nuevoAutor = scanner.nextLine();
                    biblioteca.modificarLibro(ISBN, nuevoTitulo, nuevoAutor);
                    break;

                case 4:
                    System.out.println("Introduce el ISBN del libro que deseas buscar: ");
                    String ISBNBusqueda = scanner.next();
                    Libro libroEncontrado = biblioteca.buscarLibroPorISBN(ISBNBusqueda);
                    if (libroEncontrado != null) {
                        System.out.println("Datos del libro encontrado:");
                        System.out.println("ISBN: " + libroEncontrado.getIsbn());
                        System.out.println("Título: " + libroEncontrado.getTitulo());
                        System.out.println("Autor: " + libroEncontrado.getAutor());
                    } else {
                        System.out.println("No se encontró ningún libro con el ISBN " + ISBNBusqueda + ".");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                System.out.println("La opcion seleccionada no es válida");
                    break;
            }
        }
        
    }
}
