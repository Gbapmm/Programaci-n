import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Lectura_datos {

    public static void main(String[] args) {
      String url, user, password;
       url = "jdbc:mysql://172.21.29.50:3306/sakila?zeroDateTimeBehavior=CONVERT_TO_NULL";
        user = "userDAW";
        password = "Java";
       
        try {
            //Se crea la conexion con el connection
            Connection conn = DriverManager.getConnection(url, user, password);
            //Se crea un Statement de SQL mediante la conexion 
            Statement stmt = conn.createStatement();
            //Se asigna a ResultSet el resultado del SELECT FROM actor
            ResultSet rs = stmt.executeQuery("SELECT * FROM actor");

            while (rs.next()) {
              // Se piden los datos de la columna llamada actor_id
                String name = rs.getString("actor_id");
                System.out.println(name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}