package Examen;

import java.util.Scanner;
import examen240314.Datos;
import examen240314.Usuarios;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;

public class Control {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Vuelo> vuelos = new ArrayList<>();
    static Iterator it = null;
    static LocalDateTime inicio;

    static void cargarDatos() {
        String[][] datos = Datos.getVuelos();
        for (String[] vueloDatos : datos) {
            vuelos.add(new Vuelo(vueloDatos[0], vueloDatos[1], vueloDatos[2],
                    LocalDateTime.parse(vueloDatos[3]), LocalDateTime.parse(vueloDatos[4])));
        }
    }

    public static boolean inicio() {
        String user, pass;
        boolean login = false;
        Usuarios users = new Usuarios();

        System.out.println("Introduce un nombre de Usuario");
        user = sc.nextLine();
        System.out.println("Introduce la contraseña");
        pass = sc.nextLine();

        if (users.getUsuarios().containsKey(user)) {
            if (users.getUsuarios().get(user).equals(pass)) {
                login = true;
                inicio = LocalDateTime.now();
            }
        }
        return login;
    }

    static void menu() {

        while (true) {

            System.out.println("=== MENU ===");
            System.out.println("1. Mostrar cola de vuelos ordenada. ");
            System.out.println("2. Dar salida a un vuelo.");
            System.out.println("3. Actualizar lista de vuelos.");
            System.out.println("4. Modificar horarios de un vuelo.");
            System.out.println("5. Salir");
            System.out.println("\nSeleccione una de las opciones: ");

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    colaOrdenada();
                    break;
                case 2:
                    salidaVuelo();
                    break;
                case 3:
                    actulizarLista();
                    break;
                case 4:
                    modificarVuelo();
                    break;
                case 5:
                    System.out.println("Hautilizado el programa durante: " + ChronoUnit.SECONDS.between(inicio,
                     LocalDateTime.now()) + "segundos.");
                    System.exit(0);
                    break;
            }

        }
    }

    static void colaOrdenada() {
        Vuelo aux = null;    
        Collections.sort(vuelos);
        
        it = vuelos.iterator();
        
        while(it.hasNext()){
            aux = (Vuelo)it.next();
            int horas = (int) ChronoUnit.HOURS.between(LocalDateTime.now(), aux.getSalida());
            if(horas < 24 && horas >= 0){
                System.out.println(aux);
            }
        }
    }

    static void salidaVuelo() {
        vuelos.remove(0);
    }

    static void actulizarLista() {
        for (int i = 0; i < vuelos.size(); i ++){
            Iterator<Vuelo> it = vuelos.iterator();
            while (it.hasNext()){
                if(it.next().getSalida().isBefore(LocalDateTime.now())){
                    it.remove();
                }
            }
        }
        
    }

    
    static void modificarVuelo(){
        String code;
        int minutos;
        System.out.println("Introduce el codigo del vuelo");
        code = sc.nextLine();
        try{
            System.out.println("Introduce el número de minutos a modificar el vuelo:");
            minutos = sc.nextInt();
            for(int i =0; i < vuelos.size(); i++){
                if(vuelos.get(i).getCodigo().equals(code)){
                    try{
                        vuelos.get(i).modificarSalida(vuelos.get(i)
                                .getSalida().plusMinutes(minutos));
                    }catch(HorarioVueloException e){
                        System.out.println(e.getMessage());
                    }finally{
                        break;
                    }
                   
                }
            }
        }catch(InputMismatchException e){
            System.out.println("El valor introducido no es un entero.");
        }

    }

}
