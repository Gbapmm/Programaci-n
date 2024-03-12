public class Movil extends Terminal {

    private String tarifa;
    private static double tarifaRata = 0.001;  // Tarifa por segundo en euros para "rata"
    private static double tarifaMono = 0.002;  // Tarifa por segundo en euros para "mono"
    private static double tarifaBisonte = 0.005;  // Tarifa por segundo en euros para "bisonte"

    public Movil(String numero, String tarifa) {
        super(numero);
        this.tarifa = tarifa;
    }

    @Override
    public void llama(Terminal destino, int duracion) {
        super.llama(destino, duracion);

        double costeLlamada = 0.0;

        switch (this.tarifa) {
            case "rata":
                costeLlamada = duracion * tarifaRata;
                break;
            case "mono":
                costeLlamada = duracion * tarifaMono;
                break;
            case "bisonte":
                costeLlamada = duracion * tarifaBisonte;
                break;
        }
       
     
        System.out.println("Numero: " + this.getNumero() + " - " + duracion + "s de conversacion - tarificados "
                + costeLlamada + " euros");
    }
}
