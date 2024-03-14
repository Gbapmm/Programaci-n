package Ejercicio4;

import java.util.Set;
import java.util.HashSet;

public class Biblioteca {
    private Set<Libro> libros;

    public Biblioteca() {
        this.libros = new HashSet<>();
    }
    public void añadirLibro(Libro libro){
        if (!libros.contains(libro)){
            libros.add(libro);
            System.out.println("El libro se ha añadido");
        } else {
            System.out.println("Ya esxiste un libro con ese ISBN");
        }
    }
    public void eliminarLibro(String isbn) {
        if (libros.removeIf(libro -> libro.getIsbn().equals(isbn))) {
            System.out.println("El libro con ISBN " + isbn + " ha sido eliminado.");
        } else {
            System.out.println("No se encontró ningún libro con el ISBN " + isbn + ".");
        }
    }
    public void modificarLibro(String ISBN, String nuevoTitulo, String nuevoAutor) {
        boolean libroModificado = false;
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(ISBN)) {
                if (nuevoTitulo != null && !nuevoTitulo.isEmpty()) {
                    libro.setTitulo(nuevoTitulo);
                }
                if (nuevoAutor != null && !nuevoAutor.isEmpty()) {
                    libro.setAutor(nuevoAutor);
                }
                libroModificado = true;
                System.out.println("El libro con ISBN " + ISBN + " ha sido modificado.");
                break; // Terminamos el bucle, ya que hemos modificado el libro
            }
        }
        if (!libroModificado) {
            System.out.println("No se encontró ningún libro con el ISBN " + ISBN + ".");
        }
    }
    public Libro buscarLibroPorISBN(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro; // Devuelve el libro si se encuentra
            }
        }
        return null;
    }
    
    
    
}
