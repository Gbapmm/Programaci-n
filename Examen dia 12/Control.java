package ExamenYo;

import java.time.LocalDateTime;
import java.util.Iterator;

public class Control {
    private ColaDeVuelos colaDeVuelos;

    public void setColaDeVuelos(ColaDeVuelos colaDeVuelos) {
        this.colaDeVuelos = colaDeVuelos;
    }

    public void showVuelos() {
        if (colaDeVuelos == null || colaDeVuelos.isEmpty()) {
            System.out.println("No hay ningún vuelo registrado.");
            return;
        }

        System.out.println("Información de vuelos en la cola:");
        Iterator<Vuelo> iterator = colaDeVuelos.iterator();
        while (iterator.hasNext()) {
            Vuelo vuelo = iterator.next();
            System.out.println(vuelo);
        }
    }

    public void agregarVuelo(String idVuelo, String origenVuelo, String destinoVuelo, LocalDateTime horaLlegada, LocalDateTime horaSalida) throws FechaHoraSalidaNoValidaException {
        if (horaLlegada.isBefore(horaSalida)) {
            throw new FechaHoraSalidaNoValidaException("Las fechas introducidas son incompatibles, introduzca unas compatibles");
        }
        Vuelo vuelo = new Vuelo(idVuelo, origenVuelo, destinoVuelo, horaLlegada, horaSalida);
        colaDeVuelos.agregarVuelo(vuelo);
    }
    

    public void eliminarVuelo(String idVuelo) {
        if (colaDeVuelos == null || colaDeVuelos.isEmpty()) {
            System.out.println("No hay ningún vuelo registrado.");
            return;
        } 
        
        Iterator<Vuelo> iterator = colaDeVuelos.iterator();
        while (iterator.hasNext()) {
            Vuelo vuelo = iterator.next();
            if (vuelo.getIdVuelo().equals(idVuelo)) {
                iterator.remove();
                System.out.println("El vuelo con código " + idVuelo + " ha sido eliminado.");
                return;
            }
        }
        System.out.println("No se encontró ningún vuelo con el código " + idVuelo);
    }

    public void darSalidaVuelo(String idVuelo) {
        for (Vuelo vuelo : colaDeVuelos) {
            if (vuelo.getIdVuelo().equals(idVuelo)) {
                System.out.println("El vuelo con código " + idVuelo + " ha salido.");
                return;
            }
        }
        System.out.println("No se encontró ningún vuelo con el código " + idVuelo);
    }

    public void retrasarVuelo(String idVuelo, int retraso) {
        for (Vuelo vuelo : colaDeVuelos) {
            if (vuelo.getIdVuelo().equals(idVuelo)) {
                vuelo.setHoraSalida(vuelo.getHoraSalida().plusMinutes(retraso));
                vuelo.setHoraLlegada(vuelo.getHoraLlegada().plusMinutes(retraso));
                System.out.println("Horarios del vuelo " + idVuelo + " actualizados.");
                return;
            }
        }
        System.out.println("No se encontró ningún vuelo con el código " + idVuelo);
    }
    

}
