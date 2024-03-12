import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<Persona>();
        lista.add(new Persona("Gabriel", 22));
        lista.add(new Persona("Juan", 31));
        lista.add(new Persona("Mario", 44));
        lista.add(new Persona("Jose", 52));
        lista.add(new Persona("Luis", 2));
        lista.add(new Persona("Gerad", 29));

        for (int i = 0; i<lista.size(); i++) {
            System.out.println("Nombre: " + lista.get(i).getNombre() + " Edad: " + lista.get(i).getEdad());
        }
    }
}
