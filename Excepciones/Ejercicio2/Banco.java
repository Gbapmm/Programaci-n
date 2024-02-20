package Ejercicio2;

public class Banco {
    public static void main(String[] args) {
        CuentaCorriente cuenta = new CuentaCorriente(123, 1000);

        try {
        	cuenta.depositar(200);
            cuenta.retirar(1200);
            cuenta.retirar(300 );
        } catch (NoFondosExcepcion e) {
            System.out.println("Error: Fondos insuficientes. Cantidad faltante: " + e.getCantidadFaltante() + " euros");
        }
    }
}