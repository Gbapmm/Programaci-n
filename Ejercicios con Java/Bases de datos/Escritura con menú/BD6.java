package bd6;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BD6 {

    public static void main(String[] args) {
        String url, user, password;
        url = "jdbc:mysql://172.21.29.50:3306/sakila?zeroDateTimeBehavior=CONVERT_TO_NULL";
        user = "userDAW";
        password = "Java";
        Connection cn = null;

        try {
            cn = DriverManager.getConnection(url, user, password);
            mostrarmenu(cn);
        } catch (SQLException e) {
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

    private static void cargarActores(Connection cn, ArrayList<Actor> lista) {
        String sql = "SELECT * FROM actor";
        try (PreparedStatement pst = cn.prepareStatement(sql)) {
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("actor_id");
                String nombre = rs.getString("first_name");
                String apellido = rs.getString("last_name");
                LocalDateTime update = rs.getTimestamp("last_update").toLocalDateTime();
                Actor actor = new Actor(id, nombre, apellido, update);
                lista.add(actor);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void crearActor(Connection cn, String nombre, String apellido, LocalDateTime update) {
        String sql = "INSERT INTO actor (first_name, last_name, last_update) VALUES (?, ?, ?)";
        try (PreparedStatement pst = cn.prepareStatement(sql)) {
            pst.setString(1, nombre);
            pst.setString(2, apellido);
            pst.setTimestamp(3, Timestamp.valueOf(update));
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void modificarActor(Connection cn, int id, String nombre, String apellido, LocalDateTime update) {
        String sql = "UPDATE actor SET first_name = ?, last_name = ?, last_update = ? WHERE actor_id = ?";
        try (PreparedStatement pst = cn.prepareStatement(sql)) {
            pst.setString(1, nombre);
            pst.setString(2, apellido);
            pst.setTimestamp(3, Timestamp.valueOf(update));
            pst.setInt(4, id);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void mostrarmenu(Connection cn) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Actor> lista = new ArrayList<>();
        while (true) {
            System.out.println("1. Crear nuevo actor");
            System.out.println("2. Modificar actor existente");
            System.out.println("3. Mostrar todos los actores");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del actor: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el apellido del actor: ");
                    String apellido = scanner.nextLine();
                    LocalDateTime update = LocalDateTime.now();
                    crearActor(cn, nombre, apellido, update);
                    break;

                case 2:
                    System.out.print("Ingrese el ID del actor a modificar: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  // consume newline
                    System.out.print("Ingrese el nuevo nombre del actor: ");
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese el nuevo apellido del actor: ");
                    apellido = scanner.nextLine();
                    update = LocalDateTime.now();
                    modificarActor(cn, id, nombre, apellido, update);
                    break;

                case 3:
                    cargarActores(cn, lista);
                    Iterator<Actor> it = lista.iterator();
                    while (it.hasNext()) {
                        Actor actor = it.next();
                        System.out.println(actor);
                    }
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    System.exit(0);
                    break;
            }
        }
    }
}