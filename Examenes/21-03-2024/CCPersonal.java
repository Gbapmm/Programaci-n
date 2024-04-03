package Examen_I_Rec;

import java.util.ArrayList;

public class CCPersonal extends CuentaCorriente {
    private int maximoDescubierto;
    private int tipoInteresDescubierto;

    public CCPersonal(DatosPersonales titular, double saldo, int numCuenta, ArrayList entidadesAutorizadas,int maximoDescubierto, int tipoInteresDescubierto) {
        super(titular, saldo, numCuenta, entidadesAutorizadas);
    }
}