package Tienda;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Main {
    public static void main(String[]args){
        String url, user, password;
        url = "jdbc:postgresql://172.21.29.50:5432/super";
        user = "userDAW";
        password = "Java";

        try (Connection cn = DriverManager.getConnection(url, user, password)) {
            DatabaseMetaData md = cn.getMetaData();
            ResultSet rs = md.getColumns(null, null, "daw_tienda", "%");

            while (rs.next()) {
                System.out.println(rs.getString("COLUMN_NAME") + " " + rs.getString("TYPE_NAME") + " " + rs.getString("COLUMN_SIZE"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}