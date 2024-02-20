package Ejercicio2;

class NoFondosExcepcion extends Exception {
    private double cantidadFaltante;

    public NoFondosExcepcion(double cantidadFaltante) {
        this.cantidadFaltante = cantidadFaltante;
    }

    public double getCantidadFaltante() {
        return cantidadFaltante;
    }
}