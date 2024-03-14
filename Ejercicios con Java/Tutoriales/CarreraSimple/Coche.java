package Carrera;

public class Coche extends Vehiculo {
    String modelo = "Scenic";
    int cilindrada = 160;

    public Coche(int velocidadMaxima, double aceleracion, String modelo, int cilindrada) {
        super(velocidadMaxima, aceleracion);
        this.modelo = modelo;
        this.cilindrada = cilindrada;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void acelerar() {

    }

    public void frenar() {

    }
}
