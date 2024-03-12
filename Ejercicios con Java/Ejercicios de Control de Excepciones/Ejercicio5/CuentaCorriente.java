package Ejercicio2;

class CuentaCorriente {
    private int numero;
    private double saldo;

    public CuentaCorriente(int numero, double saldoInicial) {
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
        System.out.println("Depósito de " + cantidad + " euros realizado. Nuevo saldo: " + saldo + " euros");
    }

    public void retirar(double cantidad) throws NoFondosExcepcion {
        if (cantidad > saldo) {
            double cantidadFaltante = cantidad - saldo;
            throw new NoFondosExcepcion(cantidadFaltante);
        } else {
            saldo -= cantidad;
            System.out.println("Retirada de " + cantidad + " euros realizada. Nuevo saldo: " + saldo + " euros");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}