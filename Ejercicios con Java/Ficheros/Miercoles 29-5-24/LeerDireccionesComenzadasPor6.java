import java.io.BufferedReader;
import java.io.FileReader;

public class LeerDireccionesComenzadasPor6 {
    public static void main(String[] args) {
        String line = "";
        String separador = ";";
        try (BufferedReader br = new BufferedReader(new FileReader("../Archivos/data/Direcciones.csv"))){
             while ((line = br.readLine()) != null) {
                if (line.startsWith("6")) {
                    System.out.println(line);
                }
             }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
