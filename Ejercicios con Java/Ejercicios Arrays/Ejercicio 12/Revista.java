package Ejercicio12;

public class Revista extends Publicacion {
private int numero;
  
public Revista (String ISBN, String Titulo, int Año, int numero){
   super(ISBN,Titulo,Año);
   this.numero = numero;
}
      public int getnumero(){
         return numero; 
      }  
      
      public String toString(){
          return super.toString() +"\nNumero: " + numero;
      }
}
