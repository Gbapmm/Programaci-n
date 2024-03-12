import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar nuevo libro");
            System.out.println("2. Borrar libro por signatura");
            System.out.println("3. Modificar libro por signatura");
            System.out.println("4. Buscar libros por título");
            System.out.println("5. Salir");

            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la signatura: ");
                    String signatura = scanner.nextLine();
                    System.out.print("Ingrese el título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese la editorial: ");
                    String editorial = scanner.nextLine();
                    System.out.print("Ingrese el autor/es (separados por comas): ");
                    String autor = scanner.nextLine();
                    System.out.print("Ingrese el ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Ingrese el número de páginas: ");
                    int paginas = scanner.nextInt();

                    Libro nuevoLibro = new Libro(signatura, titulo, editorial, autor, isbn, paginas);
                    biblioteca.agregarLibro(nuevoLibro);
                    break;

                case 2:
                    System.out.print("Ingrese la signatura del libro a borrar: ");
                    String signaturaBorrar = scanner.nextLine();
                    biblioteca.borrarLibro(signaturaBorrar);
                    break;

                case 3:
                    System.out.print("Ingrese la signatura del libro a modificar: ");
                    String signaturaModificar = scanner.nextLine();
                    System.out.print("Ingrese el nuevo título: ");
                    String nuevoTitulo = scanner.nextLine();
                    System.out.print("Ingrese la nueva editorial: ");
                    String nuevaEditorial = scanner.nextLine();
                    System.out.print("Ingrese el/los nuevo/s autor/es (separados por comas): ");
                    String nuevoAutor = scanner.nextLine();
                    System.out.print("Ingrese el nuevo ISBN: ");
                    String nuevoIsbn = scanner.nextLine();
                    System.out.print("Ingrese el nuevo número de páginas: ");
                    int nuevasPaginas = scanner.nextInt();

                    biblioteca.modificarLibro(signaturaModificar, nuevoTitulo, nuevaEditorial, nuevoAutor, nuevoIsbn, nuevasPaginas);
                    break;

                case 4:
                    System.out.print("Ingrese el texto para buscar libros por título: ");
                    String textoBusqueda = scanner.nextLine();
                    biblioteca.buscarLibrosPorTitulo(textoBusqueda);
                    break;

                case 5:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opción no válida. Inténtelo nuevamente.");
            }
        }
    }
}