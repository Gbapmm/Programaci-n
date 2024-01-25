package Ejercicio13;

import java.text.DecimalFormat;
import java.util.Random;

public class CuentaCorriente {
    private int numero;
    private double saldo;

    public CuentaCorriente() {
        this.numero = generarNumeroCuenta();
        this.saldo = 0;
    }

    public CuentaCorriente(double saldoInicial) {
        this.numero = generarNumeroCuenta();
        this.saldo = saldoInicial;
    }

    private int generarNumeroCuenta() {
        Random random = new Random();
        return 1000000000 + random.nextInt(900000000);
    }

    public void ingreso(double monto) {
        saldo += monto;
    }

    public void cargo(double monto) {
        saldo -= monto;
    }

    public void transferencia(CuentaCorriente otraCuenta, double monto) {
        cargo(monto);
        otraCuenta.ingreso(monto);
    }

    @Override
    public String toString() {
        DecimalFormat formatoDosDecimales = new DecimalFormat("0.00");
        String saldoFormateado = formatoDosDecimales.format(saldo);

        return "Cuenta Corriente - Número: " + numero + " - Saldo: " + saldoFormateado + "€";
    }
}
