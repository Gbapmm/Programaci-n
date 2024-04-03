package Examen_I_Rec;

import java.util.ArrayList;

public class CCEmpresa extends CuentaCorriente {
private double comisionPersonal;
    public CCEmpresa(DatosPersonales titular, double saldo, int numCuenta, ArrayList entidadesAutorizadas, int tipoInteresDescubierto, double comisionPersonal) {
        super(titular, saldo, numCuenta, entidadesAutorizadas);
    }
}