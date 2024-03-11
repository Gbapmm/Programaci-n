import java.util.ArrayList;

class Biblioteca {
    ArrayList<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado con éxito.");
    }

    public void borrarLibro(String signatura) {
        for (Libro libro : libros) {
            if (libro.signatura.equals(signatura)) {
                libros.remove(libro);
                System.out.println("Libro borrado con éxito.");
                return;
            }
        }
        System.out.println("Libro no encontrado.");
    }

    public void modificarLibro(String signatura, String nuevoTitulo, String nuevaEditorial, String nuevoAutor, String nuevoIsbn, int nuevasPaginas) {
        for (Libro libro : libros) {
            if (libro.signatura.equals(signatura)) {
                libro.titulo = nuevoTitulo;
                libro.editorial = nuevaEditorial;
                libro.autor = nuevoAutor;
                libro.isbn = nuevoIsbn;
                libro.paginas = nuevasPaginas;
                System.out.println("Libro modificado con éxito.");
                return;
            }
        }
        System.out.println("Libro no encontrado.");
    }

    public void buscarLibrosPorTitulo(String texto) {
        for (Libro libro : libros) {
            if (libro.titulo.startsWith(texto)) {
                System.out.println("Signatura: " + libro.signatura + ", Título: " + libro.titulo);
            }
        }
    }
}