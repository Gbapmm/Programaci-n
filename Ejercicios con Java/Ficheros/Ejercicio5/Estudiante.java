package Ejercicio5;

public class Estudiante {
    int dni;
    String nombre;
    int edad;
    Float promedioNotas;
    boolean repite;

    Estudiante(int dni, String nombre, int edad, Float promedioNotas, boolean repite) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.promedioNotas = promedioNotas;
        this.repite = repite;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Float getPromedioNotas() {
        return promedioNotas;
    }

    public void setPromedioNotas(Float promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

    public boolean isRepite() {
        return repite;
    }

    public void setRepite(boolean repite) {
        this.repite = repite;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", promedioNotas=" + promedioNotas + ", repite=" + repite + '}';
    }
}