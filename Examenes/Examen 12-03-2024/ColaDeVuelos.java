package ExamenYo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ColaDeVuelos implements Iterable<Vuelo> {
    private Queue<Vuelo> cola;

    public ColaDeVuelos() {
        cola = new LinkedList<>();
    }

    public void agregarVuelo(Vuelo vuelo) {
        cola.offer(vuelo);
    }

    public Vuelo eliminarVuelo() {
        return cola.poll();
    }

    public boolean isEmpty() {
        return cola.isEmpty();
    }

    @Override
    public Iterator<Vuelo> iterator() {
        return cola.iterator();
    }
}
