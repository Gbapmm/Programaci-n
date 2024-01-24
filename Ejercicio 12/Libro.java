
package Ejercicio12;

public class Libro extends Publicacion implements Prestable {
    private boolean prestado; 
    
    public Libro (String ISBN, String Titulo, int Año){
        super(ISBN,Titulo,Año);
        this.prestado = false;
    }
    

   public void presta(){
      this.prestado = true;
   }

   public void devuelve(){
      this.prestado = false;
     
   }
    @Override
   public boolean estaPrestado(){
       return prestado;
   }
@Override
    public String toString() {
        return super.toString() + "\nEstado: " + (prestado ? "Prestado" : "Disponible");
    }
}
