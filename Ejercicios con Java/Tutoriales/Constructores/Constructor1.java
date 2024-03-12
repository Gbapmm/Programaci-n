package Constructores;

// A partir de una clase Constructor1, creamos unos atributos.
public class Constructor1 {
    String nombre;
    int edad;

    //Definimos los datos que el Constructor debe devolver
    public Constructor1(String nombre, int edad){
        nombre = "";
        edad= 0;
    }

    //Hacemos que  se printeen los datos del constructor
    public static void main(String[] args) {
        Constructor1 Persona = new Constructor1("Victor",25);
        System.out.println( Persona.nombre + " " + Persona.edad);
    }
}
