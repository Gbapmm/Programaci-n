package Examen_I_Rec;

public class CuentaAhorro extends Cuenta{
    int TipoInteres;
    public CuentaAhorro(DatosPersonales titular, double saldo, String numCuenta, int TipoInteres) {
        super(titular, saldo, numCuenta);
    }

    public void setInteres(int TipoInteres) {
        this.TipoInteres = TipoInteres;
    }

    public int getTipoInteres() {
        return TipoInteres;
    }
}
