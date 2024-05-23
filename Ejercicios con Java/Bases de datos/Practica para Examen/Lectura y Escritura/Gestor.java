package BaseDatos;

import java.sql.*;
import java.util.Scanner;

public class Gestor {

    Scanner sc = new Scanner(System.in);

    static void menu() {
        boolean salir = false;
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();

        do {

            switch (opcion) {
                case 1:
                    insertarDatos();
                    break;
                case 2:
                    leerDatos();
                    break;
                case 3:
                    salir = true;
                    System.out.println("Saliendo del programa");
                    System.exit(0);
                    break;
            }

        } while (!salir);
    }

    static void leerDatos() {
        String url, user, password;
        url = "jdbc:postgresql://172.21.29.50:5432/super";
        user = "userDAW";
        password = "Java";
        Connection cn = null;

        Scanner sc = new Scanner(System.in);

        try {
            cn = DriverManager.getConnection(url, user, password);
            Statement mysqlSelect = cn.createStatement( );
            ResultSet mysqlResult = mysqlSelect.executeQuery("SELECT * FROM nombre_tabla");
                    System.out.println("Listado de películas");
            int contador = 0;
            while(mysqlResult.next( )) { // procesa cada fila del resultado
                System.out.print(++contador + ": " + mysqlResult.getInt(1));
                System.out.print(", " + mysqlResult.getString(2));
                System.out.println(", " + mysqlResult.getString(3));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cn != null) {
                try {
                    cn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static void insertarDatos() {
        String url, user, password;
        url = "jdbc:postgresql://172.21.29.50:5432/super";
        user = "userDAW";
        password = "Java";
        Connection cn = null;

        Scanner sc = new Scanner(System.in);

        try {
            cn = DriverManager.getConnection(url, user, password);

            System.out.println("Ingrese el DNI del nuevo usuario:");
            String DNI = sc.nextLine();
            System.out.println("Ingrese el nombre del nuevo usuario:");
            String nombre = sc.nextLine();
            insertarUsuario(cn,DNI,nombre);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cn != null) {
                try {
                    cn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void insertarUsuario (Connection cn,String DNI,String nombre) {
        String sql = "INSERT INTO daw_tienda (DNI, nombre) VALUES (?, ?)";

        try (PreparedStatement pstmt = cn.prepareStatement(sql)) {
            pstmt.setString(1, DNI);
            pstmt.setString(2, nombre);
            pstmt.executeUpdate();
            System.out.println("Tienda insertada con éxito.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    }