import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args){
        String linea = "";
        ArrayList<Empleado> empleados = new ArrayList<>();
        Iterator it;

        try (BufferedReader buffer = new BufferedReader(new FileReader("src/empregados.txt"))) {
            linea = buffer.readLine();
            while (linea != null) {
                agregarLinea(empleados, linea);
                linea = buffer.readLine();
            }
            System.out.println("Empleados ordenados por orden alfabética");
            empleados.sort(new OrdenAlfabetico());
            it = empleados.iterator();

            while (it.hasNext()){
                Empleado emp = (Empleado) it.next();
                System.out.println(emp);
            }
            System.out.println("Empleados ordenados alfabéticamente y por departamento");
            empleados.sort(new OrdenDepartamento());
            it = empleados.iterator();
            while (it.hasNext()){
                Empleado emp = (Empleado) it.next();
                System.out.println(emp);
            }
            System.out.println("");
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: El fichero no existe o el directorio es erróneo.");
        }catch (IOException e) {
            System.out.println("ERROR: Ocurrió un problema en la lectura del fichero");
        }
    }

public static void agregarLinea(ArrayList<Empleado> lista, String lin) {
    String[] valores = lin.split(";");
    lista.add(new Empleado(valores[0], valores[1], Integer.valueOf(valores[2]), valores[3]));
    }
}
