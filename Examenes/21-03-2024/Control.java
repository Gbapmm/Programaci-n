package Examen_I_Rec;

import java.util.Scanner;

public class Control {
    Scanner scanner = new Scanner(System.in);

    public void abrir() {
        System.out.println("Introduzca sus datos y el tipo de cuenta que desea abrir: ");
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Apellidos: ");
        String apellidos = scanner.nextLine();
        System.out.println("Fecha de nacimiento: ");
        String fechanac = scanner.nextLine();
        System.out.println("Escoja el tipo de cuenta: " +
                "\n1 para Cuenta de Ahorro." +
                "\n2 para Cuenta Corriente Personal." +
                "\n3 para Cuenta Corriente de Empresa.");

    }
}
