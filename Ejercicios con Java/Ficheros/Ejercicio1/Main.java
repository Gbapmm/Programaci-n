package Ejercicio1;

import com.sun.source.tree.WhileLoopTree;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.WeakHashMap;

public class Main {
    public static void main(String[]args) {

        String ruta;
        File directorio;
        byte opcion = 0;
        boolean salir = false;
        ArrayList<String> dirs = new ArrayList<>();
        ArrayList<File> arqs = new ArrayList<>();

        do {
            ruta = leerString("Introduce la ruta del directorio: ");
            directorio = new File(ruta);

            do {
                if  (directorio.isDirectory()) {
                    System.out.println("MENÚ");
                    System.out.println("\t1. Listar contenido.");
                    System.out.println("\t2. Crear directorio.");
                    System.out.println("\t3. Borrar directorio.");
                    System.out.println("\t4. Renombrar directorio.");
                    System.out.println("\t5. Introducir nueva ruta.");
                    System.out.println("\t6. Salír.");

                    opcion = validarOpcion(1, 6);
                    switch (opcion){
                        case 1:
                            File[] listado = directorio.listFiles();
                            File elemento;
                            dirs.clear();
                            arqs.clear();
                            for (File listado1 : listado) {
                                if (listado1.isDirectory()){
                                    dirs.add(listado1.getName());

                                }else {
                                    arqs.add(listado1);
                                }
                            }
                            System.out.println("\tArchivos del directorio: "+arqs.size());
                            Iterator it = arqs.iterator();

                            for ( ; it.hasNext(); ) {
                                elemento = (File) it.next();
                                System.out.println("\t\t" + (elemento.getName()));
                                System.out.print("\t\t" + (elemento.length()) + " B\n");

                            }
                            System.out.println("\tDirectorios del directorio: " + dirs.size());
                            it = dirs.iterator();

                            for ( ; it.hasNext(); ) {
                                System.out.println("\t\t" + (String) it.next());
                            }
                            break;
                        case 2:
                            ruta = leerString("Introduce el nombre del nuevo directorio: ");
                            ruta = directorio.getAbsolutePath() + File.separatorChar + ruta;
                            System.out.println("Ruta: "+ruta);
                            File nuevo = new File(ruta);
                            if (!nuevo.exists()){
                                if (nuevo.mkdir()) {
                                    System.out.println("\tEl nuevo directorio fue creado correctamente");
                                } else {
                                    System.out.println("\tERROR: No se pudo crear el nuevo directorio");
                                }
                            } else {
                                System.out.println("\tNo se creó el directorio. Ya existe.");
                            }
                            break;
                        case 3:
                            byte confirmacion;
                            System.out.println("\tEstá seguro de querer eliminar el directorio? [0-No ; 1-Si]");
                            confirmacion = validarOpcion(0, 1);
                            if(confirmacion == 1){
                                boolean rdo = directorio.delete();

                                if (rdo){
                                    System.out.println("\tEl directorio fue borrado");
                                    opcion = 5;
                                } else {
                                    System.out.println("\tERROR: No se pudo borrar el directorio, no está vacio.");
                                }
                            }
                            break;
                        case 4:
                            boolean rdo;
                            ruta = leerString("\tIntroduce el nuevo nombre del directorio: ");
                            ruta = directorio.getParent() + File.separatorChar + ruta;
                            rdo = directorio.renameTo(new File(ruta));
                            if (rdo) {
                                System.out.println("\tEl nombre del directorio fue cambiado correctamente");
                                directorio = new File(ruta);
                            } else {
                                System.out.println("\tAVISO: Hubo algun error, no se pudo cmambiar el nombre del directorio");
                            }
                            break;
                        case 5:
                            break;
                        case 6:
                            salir = true;
                            break;
                    }
                } else {
                    System.out.println("\tERROR: La ruta no es correcta o no es un directorio.");
                }
            } while ((opcion != 5) && (opcion != 6));
        } while (!salir);
    }

    public static byte validarOpcion(int min, int max) {
        byte opcion = 0;
        boolean repetir;
        Scanner sc = new Scanner(System.in);
        do {
            repetir = false;
            System.out.println("Seleccione una opcion: ");
            if (sc.hasNextByte()) {
                opcion = sc.nextByte();
                if (opcion < min || opcion > max) {
                    System.out.println("\tATENCION! Opcion no disponible. Vuelva a seleccionar");
                    repetir = true;
                }
            } else  {
                System.out.println("\tERROR. Se debe de introducir una opcion entre" + min + " y " + max);
                sc.next();
                repetir = true;
            }
        } while (repetir);
        return opcion;
    }

    public static String leerString(String cadena) {
        String valor = "";
        boolean repetir;
        Scanner sc = new Scanner(System.in);

        System.out.println(cadena);
        repetir = true;
        while(repetir){
            if (sc.hasNextLine()){
                valor = sc.nextLine();
                repetir = (valor.isEmpty());
            } else {
                sc.next();
            }
            if (repetir)  {
                System.out.println("\tERROR: Debe introducir algun texto." + "\n\t\tVuelva a introducir el valor: ");
            }
        }
        return valor;
    }
}
