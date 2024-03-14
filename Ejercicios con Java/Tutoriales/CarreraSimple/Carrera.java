package Carrera;

public class Carrera {
    private Coche coche;
    private Moto moto;

    public Carrera(Coche coche, Moto moto) {
        this.coche = coche;
        this.moto = moto;
    }

    public void empezar() {
        if (coche.getVelocidadMaxima() > moto.getVelocidadMaxima()) {
            System.out.println("El coche gana la carrera.");
        } else if (moto.getVelocidadMaxima() > coche.getVelocidadMaxima()) {
            System.out.println("La moto gana la carrera.");
        } else {
            System.out.println("La carrera termina en empate.");
        }
    }
}
