package Examen;

import examen240314.VueloAbstract;
import java.time.LocalDateTime;

public class Vuelo extends VueloAbstract implements Comparable {

    public Vuelo(String codigo, String origen, String destino, LocalDateTime salida, LocalDateTime llegada) {
        super(codigo, origen, destino, salida, llegada);
    }

    @Override
    public String toString() {
        String salida = "";
        salida += "CODIGO: " +this.getCodigo();
        salida += "Origen: " +this.getOrigen();
        salida += "Destino: " +this.getDestino();
        salida += "Salida: " +this.getSalida();
        salida += "Llegada: " +this.getLlegada();
        return salida;
    }

    @Override
    public int compareTo(Object o) {
        return this.getSalida().compareTo(((Vuelo)o).getSalida());
    }
    
    public void modificarSalida(LocalDateTime salida) throws HorarioVueloException{ 
            
        if(salida.isBefore(LocalDateTime.now())){
            throw new HorarioVueloException();
        }
        super.setSalida(salida);
    } 
}
