public class Empleado {
    String nombre;
    String dni;
    int edad;
    String departamento;

    Empleado (String n, String d, int e, String p){
        nombre = n;
        dni = d;
        edad = e;
        departamento = p;
    }

    @Override
    public String toString(){
        return "\t" + nombre + "\t" + dni + "\t" + edad + "\t" + departamento;
    }
}
