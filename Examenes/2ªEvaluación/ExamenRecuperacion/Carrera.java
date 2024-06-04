package Examen;

import java.time.LocalDateTime;

public class Carrera {
    private String nombre;
    private LocalDateTime fechaCarrera;
    private int maxParticipantes;
    private int edadMinima;

    public Carrera(String nombre, LocalDateTime fechaCarrera, int maxParticipantes, int edadMinima) {
        this.nombre = nombre;
        this.fechaCarrera = fechaCarrera;
        this.maxParticipantes = maxParticipantes;
        this.edadMinima = edadMinima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFechaCarrera() {
        return fechaCarrera;
    }

    public void setFechaCarrera(LocalDateTime fechaCarrera) {
        this.fechaCarrera = fechaCarrera;
    }

    public int getMaxParticipantes() {
        return maxParticipantes;
    }

    public void setMaxParticipantes(int maxParticipantes) {
        this.maxParticipantes = maxParticipantes;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    @Override
    public String toString() {
        return " La Carrera{" +
                "con nombre= " + nombre  +
                ", con fecha=" + fechaCarrera +
                ", numero maximo de participantes=" + maxParticipantes +
                ", edad minima=" + edadMinima +
                "} ha sido creada con exito";
    }   
}
