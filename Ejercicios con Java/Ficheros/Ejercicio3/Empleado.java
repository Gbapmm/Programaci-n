package Ejercicio2;

public class Empleado {
    String nombre;
    String dni;
    int edad;
    String departamento;

    //Aqui se crea un objeto Empleado, se utiliza para introducir los valores del Array que guarda los datos del txt.
    Empleado(String n, String d, int e, String p) {
        nombre = n;
        dni = d;
        edad = e;
        departamento = p;
    }

    @Override
    public String toString() {
        return "\t" + nombre + "\t" + dni + "\t" + edad + "\t" + departamento;
    }
}
