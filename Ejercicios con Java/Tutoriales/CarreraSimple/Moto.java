package Carrera;

public class Moto extends Vehiculo {
    private String modelo = "Duke";
    private int cilindrada = 125;

    public Moto(int velocidadMaxima, double aceleracion, String modelo, int cilindrada) {
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
