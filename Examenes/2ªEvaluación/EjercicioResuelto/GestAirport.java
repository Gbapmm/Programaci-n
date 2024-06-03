package Examen;

public class GestAirport {
    public static void main(String[] args) {
        
       Control.cargarDatos();
       
       if(Control.inicio()){
            Control.menu();
        } else {
           System.out.println("Credenciales incorrectas");
       }
       
       /*
       * user = user + i(10)
       * pass = pass + i (10)
       */
    }
}
