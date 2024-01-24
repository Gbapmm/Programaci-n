package Ejercicio12;

public class Publicacion {

    private String ISBN;
    private String Titulo;
    private int Año;

    public Publicacion(String ISBN, String Titulo, int Año) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Año = Año;
    }
    
    public String getISBN(){
       return ISBN;
    }
     public String getTitulo(){
       return Titulo;
    }
      public int getAño(){
       return Año;
    }
  
      @Override
      public String toString(){
          return "ISBN: " + ISBN + "\n" + "Titulo: " + Titulo + "\n Año de Publicacion: " + Año;
      }
}

//se puede hacver un tostring con los atributpos para no usar gets en los hijos (cadenas)
