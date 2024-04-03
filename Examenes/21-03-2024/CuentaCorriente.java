package Examen_I_Rec;

import java.util.ArrayList;

public class CuentaCorriente extends Cuenta {
    private ArrayList<String> entidadesAutorizadas;

    public CuentaCorriente(DatosPersonales titular, double saldo, int numCuenta, ArrayList entidadesAutorizadas) {
        super(titular, saldo, numCuenta);
    }

    public void setEntidadesAutorizadas(ArrayList<String> entidadesAutorizadas) {
        this.entidadesAutorizadas = entidadesAutorizadas;
    }

    public ArrayList<String> getEntidadesAutorizadas() {
        return entidadesAutorizadas;
    }
}
