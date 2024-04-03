package Examen_I_Rec;

 class Cuenta{
    private DatosPersonales titular;
    private double saldo;
    private String numCuenta;

    public Cuenta (DatosPersonales titular, double saldo, String numCuenta){
        this.titular = titular;
        this.saldo = saldo;
        this.numCuenta = numCuenta;
    }

}
