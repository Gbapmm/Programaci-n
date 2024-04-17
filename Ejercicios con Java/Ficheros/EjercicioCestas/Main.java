package Compra;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        double total = 0.0;

        //Sustituye el interior del FileReader por el directorio del archivo
        try (BufferedReader buffer = new BufferedReader(new FileReader("src/Compra/Cestas/cesta1.json"))) {
            String linea = buffer.readLine();
            String[] lineaCesta;
            while (linea != null) {
                lineaCesta = linea.split("=");
                System.out.println(lineaCesta[0] + "\t=\t" + lineaCesta[1]);
                total += Double.parseDouble(lineaCesta[1]);
                linea = buffer.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: Ocurrió un problema en la lectura del fichero");

        } catch (IOException e) {
            System.out.println("ERROR: Ocurrió un problema en la lectura del fichero");
        }
    }
}