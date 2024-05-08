import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexión_doble {

    public static void main(String[] args) {
        String url, user, password;
        url = "jdbc:postgresql://172.21.29.50:5432/super";
        user = "userDAW";
        password = "Java";
        Connection connectionMysql = null;
        Connection connectionPg = null;
        String mysqlUser = "userDAW";
        String mysqlPass = "Java";
        String pgUser = "userDAW";
        String pgPass = "Java";
        String mysqlDriver = "com.mysql.jdbc.Driver";
        String pgDriver = "org.postgresql.Driver";
        String mysqlUrl = "jdbc:mysql://172.21.29.50:3306/sakila?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String pgUrl = "jdbc:postgresql://172.21.29.50:5432/super";
         try { // cargar os drivers
         Class.forName(mysqlDriver).newInstance( );
         Class.forName(pgDriver).newInstance( );
      } catch(Exception e) {
         e.printStackTrace( );
         return;
      }

      try {
         connectionMysql = DriverManager.getConnection(mysqlUrl, mysqlUser, mysqlPass);
         connectionPg = DriverManager.getConnection(pgUrl, pgUser, pgPass);
         System.out.println("Conexións correctas");
      } catch( SQLException e ) {
         e.printStackTrace( );
      }
   }
}