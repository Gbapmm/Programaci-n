package Tienda;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Main2 {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://172.21.29.50:5432/super";
        String user = "userDAW";
        String password = "Java";

        try (Connection cn = DriverManager.getConnection(url, user, password);
             Statement stmt = cn.createStatement()) {

            String table = "daw_tienda";
            ResultSet rs = stmt.executeQuery("SELECT column_name, data_type "
                    + "FROM INFORMATION_SCHEMA.COLUMNS WHERE table_name = '" + table + "' "
                    + "ORDER BY ordinal_position");

            while (rs.next()) {
                System.out.println(rs.getString("column_name") + " " + rs.getString("data_type"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
