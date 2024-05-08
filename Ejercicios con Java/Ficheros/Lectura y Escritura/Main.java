import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       List<String> lineas = new ArrayList<>();
       try (BufferedReader reader = new BufferedReader(new FileReader("notaria.txt"))){
           String linea;
           while ((linea = reader.readLine()) != null) {
               lineas.add(linea);
           }
       } catch (IOException e) {
           e.printStackTrace();
       }

        System.out.println("\nEl contenido del archivo es:\n");
        for (String linea : lineas) {
            System.out.println(linea);
        }

        Collections.reverse(lineas);

        System.out.println("\nEl contenido invertido del archivo será:\n");
        for (String linea : lineas) {
            System.out.println(linea);
        }

       try (BufferedWriter writer = new BufferedWriter(new FileWriter("notaria_invertida.txt"))){
           for (String linea : lineas) {
               writer.write(linea);
               writer.newLine();
           }
           System.out.println("\nEl archivo se ha escrito correctamente.");
       } catch (IOException e) {
           e.printStackTrace();
       }
    }
}