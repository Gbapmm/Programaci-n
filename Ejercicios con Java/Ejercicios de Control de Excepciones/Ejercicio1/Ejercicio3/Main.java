import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        try {
            generarExcepcionAleatoria();
        } catch (Exception e) {
            System.out.println("Se ha producido una excepción: " + e.getClass().getSimpleName());
            e.printStackTrace();
        }
    }

    private static void generarExcepcionAleatoria() throws IOException, NumberFormatException, FileNotFoundException, IndexOutOfBoundsException, ArithmeticException {
        Random random = new Random();
        int opcion = random.nextInt(5);

        switch (opcion) {
            case 0:
                throw new NumberFormatException("Número formato incorrecto");
            case 1:
                throw new IOException("Excepción de entrada/salida");
            case 2:
                throw new FileNotFoundException("Archivo no encontrado");
            case 3:
                throw new IndexOutOfBoundsException("Índice fuera de rango");
            case 4:
                throw new ArithmeticException("Excepción aritmética");
            default:
                System.out.println("No deberías estar aquí");
        }
    }
}
