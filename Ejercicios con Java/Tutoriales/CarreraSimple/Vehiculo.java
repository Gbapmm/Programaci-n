package Carrera;

public class Vehiculo {
    private int velocidadMaxima;
    private double aceleracion;

    public Vehiculo(int velocidadMaxima, double aceleracion) {
        this.velocidadMaxima = velocidadMaxima;
        this.aceleracion = aceleracion;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public double getAceleracion() {
        return aceleracion;
    }
}

