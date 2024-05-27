import java.io.FileInputStream;
import java.io.IOException;

public class Ejemplo1 {
    public static void main(String[] args) {
        FileInputStream fichero = null;
        try {
            fichero = new FileInputStream("datos.dat");
            byte[] datos = new byte[fichero.available()];
            int valor = fichero.read(datos);
            if (valor != 0){
                for (int i = 0; i < valor; i++) {
                    System.out.print(datos[i]+"\t");
                }
            }
        } catch (IOException e) {
            System.out.println("ERROR: Hubo un error al leer el fichero");
        } finally {
            try {
                if (fichero != null) {
                    fichero.close();
                }
            } catch (IOException e) {
                System.out.println("ERROR: Hubo un error al cerrar el fichero");
            }
        }
    }
}
