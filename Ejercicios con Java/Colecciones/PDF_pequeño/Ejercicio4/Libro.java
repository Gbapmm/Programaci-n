package Ejercicio4;

public class Libro {
    private String isbn;
    private String titulo;
    private String autor;

    public Libro(String isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    @Override
    public String toString() {
        return "ISBN: " + isbn + "\nTitulo: " + titulo + "\nAutor: " + autor;
    }
}
