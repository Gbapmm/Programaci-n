
package com.mycompany.bd1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Bd1 {

    public static void main(String[] args) {
        String url, user, password;
        url = "jdbc:mysql://172.21.29.50:3306/sakila?zeroDateTimeBehavior=CONVERT_TO_NULL";
        user = "userDAW";
        password = "Java";
        try {
            Connection cn = DriverManager.getConnection(url, user, password);
            cn.close();
            System.out.print("Cerramos la conexion");
        } catch (SQLException ex) {
            Logger.getLogger(Bd1.class.getName()).log(Level.SEVERE, null, ex);
        }
              
    }
}