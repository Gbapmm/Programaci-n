import java.io.*;
import java.util.Scanner;

public class LecturaEscrituraBinarios {
    public static void main(String[] args) {
        
       menu();
    }
    
    static void menu(){
        Scanner sc = new Scanner(System.in);
        while (true) {         
            
            System.out.println("Selecciona una opcion");
            System.out.println("1. Leer todos los datos");
            System.out.println("2. Agregar datos");
            System.out.println("3. Salir");
            
            int opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                        leer();
                    break;
                    case 2:
                        agregar();
                    break;
                    case 3:
                        System.out.println("Saliendo...");
                        System.exit(0);
                    break;
            }
        }
    }

    static void leer(){
    try (DataInputStream dis = new DataInputStream(new FileInputStream("../Archivos/coches.dat"))){
        while (dis.available() > 0) {
            int id = dis.readInt();
            String brand = dis.readUTF();
            int price = dis.readInt();
            String model = dis.readUTF();

            System.out.println("ID: " + id);
            System.out.println("Brand: " + brand);
            System.out.println("Price: " + price);
            System.out.println("Model: " + model);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    static int idCounter = 0;

    static void agregar(){
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("../Archivos/coches.dat"))){
            Scanner sc = new Scanner(System.in);

            System.out.println("Ingrese la cantidad de coches que desea agregar:");
            int cantidad = sc.nextInt();

            for (int i = 0; i < cantidad; i++) {
                System.out.println("Ingrese los detalles del coche " + (i+1) + ":");

                int id = ++idCounter;

                System.out.println("ID generado automáticamente: " + id);

                System.out.println("Marca:");
                String brand = sc.next();

                System.out.println("Precio:");
                int price = sc.nextInt();

                System.out.println("Modelo:");
                String model = sc.next();

                dos.writeInt(id);
                dos.writeUTF(brand);
                dos.writeInt(price);
                dos.writeUTF(model);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    

}
