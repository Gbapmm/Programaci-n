import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Escritura_datos {

    public static void main(String[] args) {
        String url, user, password;
        url = "jdbc:mysql://172.21.29.50:3306/sakila?zeroDateTimeBehavior=CONVERT_TO_NULL";
        user = "userDAW";
        password = "Java";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);

            String sql = "INSERT INTO actor (first_name, last_name) VALUES (?, ?)";
            //Se crea una sentencia preparada llamada sql
            PreparedStatement pstmt = conn.prepareStatement(sql);
            //Se pasan los valores del insert usando la sentencia preparada
            pstmt.setString(1, "Gabriel");
            pstmt.setString(2, "Paz");

            int affectedRows = pstmt.executeUpdate();
            //Usando affected rows se asigna un mensaje de exito o fallo.

            if (affectedRows > 0) {
                System.out.println("Inserción exitosa. Filas afectadas: " + affectedRows);
            } else {
                System.out.println("Inserción fallida. Ninguna fila fue afectada.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
