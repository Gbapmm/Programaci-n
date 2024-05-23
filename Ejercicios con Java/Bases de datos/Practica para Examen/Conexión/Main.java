package BaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection cn = null;
        String url, user, password;
        url = "jdbc:mysql://localhost/peliculas";
        user = "root";
        password = "root";

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();

        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        try {
            cn = DriverManager.getConnection(url,user,password);
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
}

