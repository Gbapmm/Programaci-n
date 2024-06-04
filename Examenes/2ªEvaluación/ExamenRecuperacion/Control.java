package Examen;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import atletismo.Atleta;
import atletismo.Datos;
import atletismo.Herramientas;
import java.time.LocalTime;

public class Control {

    static Scanner sc = new Scanner(System.in);
    public static Datos datos = new Datos();
    public static HashSet<Atleta> listaAtletas = new HashSet<>();

    static void crearCarrera() {
        System.out.println("Introduzca los datos de la Carrera\n ");
        System.out.println("Introduzca el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introduzca la fecha y hora (dd-MM-yyyy HH:mm:ss)");
        String fechaHoraInput = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime fechaCarrera = LocalDateTime.parse(fechaHoraInput, formatter);

        System.out.println("Introduzca el maximo de participantes");
        int maxParticipantes = sc.nextInt();
        System.out.println("Introduzca la edad minima para el participante");
        int edadMinima = sc.nextInt();

        Carrera carrera = new Carrera(nombre, fechaCarrera, maxParticipantes, edadMinima);

        System.out.println(carrera);
    }

    static void insertarP() {
        while (true) {

            System.out.println("Seleccione como quiere insertar un participante: ");
            System.out.println("1. De forma automática");
            System.out.println("2. De forma manual");
            System.out.println("3. Volver al menu principal");

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el número de participantes a insertar: ");
                    int numP = sc.nextInt();

                    listaAtletas.addAll(datos.getRandomAtletas(numP)); // Agregar directamente los atletas a listaAtletas
                    System.out.println("\nSe añadieron " + numP + " participantes");
                    break;
                case 2:
                    System.out.println("Ingrese el número de participantes a insertar: ");
                    numP = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < numP; i++) {
                        System.out.println("=== Introduzca al nuevo participante ===");
                        System.out.println("Introduzca el dni");
                        String dni = sc.nextLine();
                        System.out.println("Introduzca el nombre");
                        String nombre = sc.nextLine();
                        System.out.println("Introduzca el primer apellido");
                        String apellido1 = sc.nextLine();
                        System.out.println("Introduzca el segundo apellido");
                        String apellido2 = sc.nextLine();
                        System.out.println("Introduzca la fecha de nacimiento");
                        String fNacimiento = sc.nextLine();
                        System.out.println("Introduzca la marca personal");
                        LocalTime marca = LocalTime.parse(sc.nextLine());

                        Atleta atleta = new Atleta(dni, nombre, apellido1, apellido2, fNacimiento);
                        atleta.setMarcaPersonal(marca);

                        listaAtletas.add(atleta);
                    }
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    static void simCarrera() {
        for (Atleta atleta : listaAtletas) {
            LocalTime TiempoCarrera = Herramientas.getTiempoCarrera();
            LocalTime MarcaPersonal = atleta.getMarcaPersonal();
            System.out.println(TiempoCarrera + ":" + MarcaPersonal);
        }
    }

    static void resultCarrera() {

    }

    static void Salir() {
        System.out.println("Saliendo del programa...");
        System.exit(0);
        sc.close();
    }

}
