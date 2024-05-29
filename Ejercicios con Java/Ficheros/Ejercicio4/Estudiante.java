package Ejercicio4;

import java.io.Serializable;

public class Estudiante implements Serializable {
    String nombre;
    int edad;
    Float promedioNotas;
    boolean repite;

    Estudiante(String nombre, int edad, Float promedioNotas, boolean repite) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedioNotas = promedioNotas;
        this.repite = repite;
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

    public void setPromedioNotas(float promedioNotas) {
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
        return "Estudiante{" + "nombre=" + nombre + ", edad=" + edad + ", promedioNotas=" + promedioNotas + ", repite=" + repite + '}';
    }
}