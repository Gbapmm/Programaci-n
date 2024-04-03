package Examen_I_Rec;

public class Cuenta {
    DatosPersonales titular;
    double saldo;
    int numCuenta;

    public Cuenta(DatosPersonales titular, double saldo, int numCuenta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numCuenta = numCuenta;
    }
    public DatosPersonales getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    @Override
    public String toString() {
        return "Cuenta " + numCuenta + ":\n"
                + "Nombre: " + titular + ".\n"
                + "Saldo: " + saldo + ".";
    }

    public void efectuarIngreso(double cantidad) {
        saldo += cantidad;
    }

    public void efectuarRetirada(double cantidad) {
        saldo -= cantidad;
    }
}