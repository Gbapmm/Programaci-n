package Ejercicio5;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {
    
    static void menu(){
        Scanner sc = new Scanner(System.in);
        while (true) {            
        System.out.println("Seleccione una opcion:");
        System.out.println("1. Dar de alta a un estudiante");
        System.out.println("2. Modificar aun estudiante");
        System.out.println("3. Mostrar estudiantes repetidores");
        System.out.println("4. Mostrar a todos los estudiantes");
        System.out.println("5. Salir");
        int opcion = sc.nextInt();
        
            switch (opcion) {
                case 1:
                    altaEstudiante();
                    break;
                    
                case 2:
                    modificarEstudiante();
                    break;
                    
                case 3:
                    listarRepetidores();
                    break;
                case 4:
                    listarTodos();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    System.exit(0);
                    break;
            }
        }
    }
    
    static void altaEstudiante(){
        
    }

    static void modificarEstudiante(){
        
    }
    
    static void listarRepetidores() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el nombre del archivo que quieres leer");
    String nombreArchivo = sc.nextLine();

    try (RandomAccessFile raf = new RandomAccessFile(nombreArchivo, "r")) {
        while (raf.getFilePointer() < raf.length()) {
            int dni = raf.readInt();
            String nombre = raf.readUTF();
            int edad = raf.readInt();
            float promedioNotas = raf.readFloat();
            boolean repite = raf.readBoolean();

            if (repite) {
                Estudiante estudiante = new Estudiante(dni, nombre, edad, promedioNotas, repite);
                System.out.println(estudiante);
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    
    static void listarTodos() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el nombre del archivo que quieres leer");
    String nombreArchivo = sc.nextLine();

    try (RandomAccessFile raf = new RandomAccessFile(nombreArchivo, "r")) {
        while (raf.getFilePointer() < raf.length()) {
            int dni = raf.readInt();
            String nombre = raf.readUTF();
            int edad = raf.readInt();
            float promedioNotas = raf.readFloat();
            boolean repite = raf.readBoolean();

            Estudiante estudiante = new Estudiante(dni,nombre, edad, promedioNotas, repite);
            System.out.println(estudiante);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    
    public static boolean validarDNI(String dni) {
        if (dni.length() != 9) {
            return false;
        }
        String num = dni.substring(0, 8);
        char letra = dni.charAt(8);
        if (!num.matches("\\d{8}")) {
            return false;
        }
        char letras[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J',
                'Z','S','Q','V','H','L','C','K','E'};
        int i = Integer.parseInt(num);
        int resto = i % 23;
        return letras[resto] == Character.toUpperCase(letra);
    }
}
