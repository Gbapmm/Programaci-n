package Ejercicio4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {
    
    static void menu(){
        Scanner sc = new Scanner(System.in);
        while (true) {            
        System.out.println("Seleccione una opcion:");
        System.out.println("1. Crear un archivo");
        System.out.println("2. Copiar un archivo");
        System.out.println("3. Mostrar datos de un archivo");
        System.out.println("4. Salir");
        int opcion = sc.nextInt();
        
            switch (opcion) {
                case 1:
                    crearArchivo();
                    break;
                    
                case 2:
                    copiarArchivo();
                    break;
                    
                case 3:
                    leerArchivo();
                    break;
                    
                case 4:
                    System.out.println("Saliendo...");
                    System.exit(0);
                    break;
            }
        }
    }

    static void crearArchivo(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        System.out.println("Introduce el nombre del Archivo que crearás");
        String nombreArchivo = sc.nextLine();

        while (true) {
            System.out.println("Introduzca el nombre del nuevo Estudiante");
            String nombre = sc.nextLine();

            //Si el nombre es END, se dejan de pedir Estudiantes
            if (nombre.equalsIgnoreCase("END")) {
                break;
            }

            System.out.println("Introduzca la edad del nuevo Estudiante");
            int edad = Integer.parseInt(sc.nextLine());
            System.out.println("Introduzca el promedio de las notas del nuevo Estudiante");
            Float notas = Float.valueOf(sc.nextLine());
            System.out.println("Introduzca si el nuevo Estudiante repite (true/false)");
            boolean repite = Boolean.parseBoolean(sc.nextLine());

            //Se crea un objeto estudiante de la clase Estudiante para guardar los datos
            Estudiante estudiante = new Estudiante(nombre,edad,notas,repite);

            //Añadir el estudiante al ArrayList
            estudiantes.add(estudiante);
        }

        //Escribir el ArrayList en el archivo
        try (ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream(nombreArchivo))){
            oss.writeObject(estudiantes);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static void copiarArchivo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del archivo a copiar: ");
        String archivo = sc.nextLine();
        System.out.println("Introduce el nombre de la copia: ");
        String copia = sc.nextLine();
                
        try(FileOutputStream fos = new FileOutputStream(copia);
            FileInputStream fis = new FileInputStream(archivo)){
            byte [] b = fis.readAllBytes();
            fos.write(b);
        }catch(IOException e){
            e.printStackTrace();
        }

    }

    static void leerArchivo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del archivo que quieres leer");
        String nombreArchivo = sc.nextLine();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            // Se lee el ArrayList del archivo
            ArrayList<Estudiante> estudiantes = (ArrayList<Estudiante>) ois.readObject();

            // Se itera sobre el ArrayList anterior
            for (Estudiante estudiante : estudiantes) {
                System.out.println(estudiante);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
