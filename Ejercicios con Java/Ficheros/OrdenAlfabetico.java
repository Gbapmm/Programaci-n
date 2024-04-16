import java.util.Comparator;
public class OrdenAlfabetico implements Comparator <Empleado>{
    @Override
    public int compare(Empleado e1, Empleado e2) {
        return e1.nombre.compareToIgnoreCase(e2.nombre);
    }
}
