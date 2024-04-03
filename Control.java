package Examen_2º_Ev_2;

import java.text.DecimalFormat;

public class Control {
    public void salir(long start){
        long end = System.currentTimeMillis();

        long ejecucionTimeMillis = end - start;
        long minutos = (ejecucionTimeMillis / 1000) / 60;
        double segundos = (ejecucionTimeMillis / 1000.0) % 60;

        DecimalFormat formatter = new DecimalFormat("#0.00");
        System.out.printf("Gracias por usar el programa durante %d minutos y %.5f segundos%n", minutos, segundos );
    }
}
