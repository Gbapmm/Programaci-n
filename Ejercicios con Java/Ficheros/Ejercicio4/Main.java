package Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean crear;

        System.out.println("   CREAR FICHERO   ");
        crear = crearFichero();

        System.out.println("   COPIAR FICHERO   ");
        if (crear) {
            crear = copiarFichero();
        } else {
            System.out.println("ERROR: No se puede crear una copia del fichero. Hubo un error en la creación.");
        }
    }
}

public static boolean crearFichero() {
    String nombre;
    int edad;
    float nota;
    boolean continuar = true;
    boolean resultado = true;
}
