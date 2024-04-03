package Examen_I_Rec;

public class CuentaAhorro extends Cuenta {
    int tipoInteres;

    public CuentaAhorro(DatosPersonales titular, double saldo, int numCuenta, int tipoInteres) {
        super(titular, saldo, numCuenta);
    }

    public void setTipoInteres(int tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public int getTipoInteres() {
        return tipoInteres;
    }
}
