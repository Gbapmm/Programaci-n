package Ejercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        byte opcion;
        boolean salir = false;
        ArrayList<Empleado> empleados = new ArrayList<>();
        cargarDatos(empleados);

        do {
            System.out.println("MENU: ");
            System.out.println("\t1. Mostrar empleados (alfabeticamente).");
            System.out.println("\t2. Mostrar empleados (por departamento).");
            System.out.println("\t3. Engadir empleado.");
            System.out.println("\t4. Borrar empleado.");
            System.out.println("\t5. Salír.");
            opcion = validarOpcion(1, 5);

            switch (opcion) {
                case 1:
                    mostrarEmpOrdenadosAlf(empregados);
                    break;
                case 2:
                    mostrarEmpOrdenadosDep(empregados);
                    break;
                case 3:
                    String nombre, dni, departamento;
                    int edad;
                    System.out.println("\tDatos del nuevo empleado");
                    nombre = leerString("\tNombre: ");
                    dni = leerString("\tDNI: ");
                    while (!comprobarDNI(dni)) {
                        System.out.println("Ya existe un usuario con este DNI, introduzca otro.");
                        dni = leerString("\tDNI: ");
                    }
                    edad = leerInt("\tEdad: ");
                    System.out.println("\tEscoja uno de los siguientes departamentos:");
                    System.out.println("\t1. RR.HH");
                    System.out.println("\t2. Administración");
                    System.out.println("\t3. Analisis y diseño");
                    System.out.println("\t4. Programación");
                    System.out.println("\tHa seleccionado:");
                    opcion = validarOpcion(1, 4);
                    departamento = "";
                    switch (opcion) {
                        case 1:
                            departamento = "RR.HH";
                            break;
                        case 2:
                            departamento = "Administración";
                            break;
                        case 3:
                            departamento = "Analisis y diseño";
                            break;
                        case 4:
                            departamento = "Programación";
                            break;
                    }
                    empleados.add(new Empleado(nombre, dni, edad, departamento));
                    break;
                case 4:
                    boolean borrado = false;
                    if (empleados.isEmpty()) {
                        System.out.println("No existe ningún empleados que borrar.");
                    } else {
                        Iterator it = empleados.iterator();
                        System.out.println("Introduzca el DNI del empleado a borrar");
                        for (; it.hasNext(); ) {
                            Empleado emp = (Empleado) it.next();
                            if (emp.dni.equalsIgnoreCase(dni)) {
                                it.remove();
                                System.out.println("\tSe borró el empleado con DNI: " + emp.dni);
                                borrado = true;
                            }
                            if (!borrado) {
                                System.out.println("\tNo se encontró al empleado");
                            }

                        }
                    }
                    break;
                case 5:
                    volcarDatos(empleados);
                    salir = true;
                    break;
            }
        } while (!salir) {

        }
    }

    public static void cargarDatos(ArrayList<Empleado> lista) {
        String linea = "";
        try (BufferedReader buffer = new BufferedReader(new FileReader("empregados.txt"))) {
            linea = buffer.readLine();
            while (linea != null) {
                agregarlinea(lista, linea);
                linea = buffer.readLine();

            } catch(FileNotFoundException e){
                System.out.println("ERROR: El fichero no existe o el directorio es erróneo.");
            } catch(IOException e){
                System.out.println("ERROR: Ocurrió un problema en la lectura del fichero");
            }
        }
    }

    public static void volcarDatos(ArrayList<Empleado> lista) {
        try (BufferedWriter buffer = new BufferedWriter(
                new FileWriter("empregados.txt", false))) {
            Iterator it;
            it = lista.iterator();
            while (it.hasNext()) {
                Empleado emp = (Empleado) it.next();
                buffer.write(emp.nombre + ";" + emp.dni + ";" + emp.edad + ";"
                        + emp.departamento);
                buffer.newLine();
            }
        } catch (IOException e) {
            System.out.println("ERRO: Ocorreu un erro na lectura do ficheiro");
        }
    }

    public static void agregarlinea(ArrayList<Empleado> lista, String lin) {
        String[] valores = lin.split(";");
        lista.add(new Empleado(valores[0], valores[1], Integer.valueOf(valores[2]),
                valores[3]));
    }

    public static void mostrarEmpOrdenadosAlf(ArrayList<Empleado> lista) {
        Iterator it;
        System.out.println("\t== LISTADO EMPREGADOS (alfabético)==");
        lista.sort(new OrdenAlfabetico());
        it = lista.iterator();
        while (it.hasNext()) {
            Empleado emp = (Empleado)it.next();
            System.out.println(emp);
        }
    }

    public static void mostrarEmpOrdenadosDep(ArrayList<Empleado> lista) {
        Iterator it;
        System.out.println("\t== LISTADO EMPREGADOS (por departamento)==");
        lista.sort(new OrdenDepartamento());
        it = lista.iterator();
        while (it.hasNext()) {
            Empleado emp = (Empleado)it.next();
            System.out.println(emp);
        }
        System.out.println("");
    }

}
