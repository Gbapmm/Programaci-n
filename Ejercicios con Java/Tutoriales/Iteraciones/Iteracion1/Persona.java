package Iteraciones.Iteracion1;

public class Persona {
    private int codigo;
    private String nombre;
    private int edad;
    private String ocupacion;

    public Persona(int codigo, String nombre, int edad, String ocupacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
    }

    public int getCodigo() {
        return codigo;
    }
    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    public String getOcupacion() {
        return ocupacion;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
}
