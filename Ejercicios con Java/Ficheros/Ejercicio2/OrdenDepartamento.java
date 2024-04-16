import java.util.Comparator;
public class OrdenDepartamento implements Comparator <Empleado>{
    @Override
    public int compare(Empleado e1, Empleado e2) {
        int valor;
        if (e1.departamento.equalsIgnoreCase(e2.departamento)) {
            valor = e1.nombre.compareToIgnoreCase(e2.nombre);
        } else {
            valor = e1.departamento.compareToIgnoreCase(e2.departamento);
        }
        return valor;
    }
}