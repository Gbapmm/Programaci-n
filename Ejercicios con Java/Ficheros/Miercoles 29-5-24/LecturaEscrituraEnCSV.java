import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class LecturaEscrituraEnCSV {
    public static void main(String[] args) {
        menu();
    }
    
    static void menu(){
        Scanner sc = new Scanner(System.in);
        while (true) {         
            
            System.out.println("Selecciona una opcion");
            System.out.println("1. Leer todos los datos");
            System.out.println("2. Leer los datos empezados por 6");
            System.out.println("3. Agregar datos");
            System.out.println("4. Salir");
            
            int opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                        leerTodos();
                    break;
                    case 2:
                        leer6();
                    break;
                    case 3:
                        agregar();
                    break;
                    case 4:
                        System.out.println("Saliendo...");
                        System.exit(0);
                    break;
            }
        }
    }
    
    static void leerTodos(){
         String line = "";
        try (BufferedReader br = new BufferedReader(new FileReader("../Archivos/data/Direcciones.csv"))) {
             String [] valores;
             while ((line = br.readLine()) != null) {
                   valores = line.split(";");
                    System.out.println("CP: " + valores[0] + "\tNombre: " + valores[1] + "\tDinero: " + valores[2]);
                    }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    static void leer6(){
         String line = "";
        try (BufferedReader br = new BufferedReader(new FileReader("../Archivos/data/Direcciones.csv"))) {
             String [] valores;
             while ((line = br.readLine()) != null) {
                   valores = line.split(";");
                   if (valores[0].startsWith("6")){
                    System.out.println("CP: " + valores[0] + "\tNombre: " + valores[1] + "\tDinero: " + valores[2]);
                        }
                    }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    static void agregar(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduce los datos separados por comas:");
        String userInput = scanner.nextLine();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("../PracticaFicheros/Archivos/data/Direcciones.csv", true))) {
            // Falta algo
            bw.append(userInput);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
