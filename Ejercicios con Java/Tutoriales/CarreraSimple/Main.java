package Carrera;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche(200, 13.5, "Scenic", 160);
        Moto moto = new Moto(140, 10.3, "Duke", 125);
        Carrera carrera = new Carrera(coche, moto);
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("1. Empezar la carrera\n"
                    + "2. Inspeccionar coche\n"
                    + "3. Inspeccionar moto\n"
                    + "4. Salir");

            System.out.println("Selecciona una opcion");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    carrera.empezar();
                    break;
                case 2:
                System.out.println("Velocidad maxima del coche: " + coche.getVelocidadMaxima());
                System.out.println("Aceleracion del coche: " + coche.getAceleracion());
                System.out.println("Modelo del coche: " + coche.getModelo());
                System.out.println("Cilindrada del coche: " + coche.getCilindrada());
                    break;
                case 3:
                System.out.println("Velocidad maxima de la moto: " + moto.getVelocidadMaxima());
                System.out.println("Aceleracion de la moto: " + moto.getAceleracion());
                System.out.println("Modelo de la moto: " + moto.getModelo());
                System.out.println("Cilindrada de la moto: " + moto.getCilindrada());
                    break;
                case 4:
                    System.out.println("Saliendo del programa");
                    scanner.close(); 
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}