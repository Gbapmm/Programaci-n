import java.sql.Connection;
import java.sql.Date;
import java.sql.Time;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;  
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[]args){
        String url, user, password;
        url = "jdbc:postgresql://172.21.29.50:5432/super";
        user = "userDAW";
        password = "Java";
        Connection cn = null;
        ArrayList <Cliente> clientes = new ArrayList<Cliente>();
        ArrayList <Producto> productos = new ArrayList<Producto>();

        try {
            
    cn = DriverManager.getConnection(url,user,password);
    Statement query = cn.createStatement();

    ResultSet rs = query.executeQuery("SELECT * FROM clientes");
    while(rs.next()){
        clientes.add(new Cliente(rs.getString("nombre"),rs.getString("apellido"),rs.getString("tipo_doc"),rs.getString("nro_doc")));
    }
    rs.close(); 

    rs = query.executeQuery("SELECT * FROM productos");
    while(rs.next()){
        productos.add(new Producto(rs.getInt("id_proveedor"),rs.getString("codigo"),rs.getString("nombre"),rs.getString("marca"),rs.getString("tipo"),rs.getFloat("peso"),rs.getDouble("precio_unidad"),rs.getInt("Stock")));
    }
    rs.close(); 
    
    String sql =  "INSERT INTO facturas (numero,codigo,fecha,hora,importe_total) VALUES (?,?,?,?,?)"   ;
    PreparedStatement pstmt = cn.prepareStatement( sql,Statement.RETURN_GENERATED_KEYS);
    pstmt.setInt(1, 21323);
    pstmt.setInt(2, 12412);
    pstmt.setDate(3, Date.valueOf(LocalDate.now()));
    pstmt.setTime(4, Time.valueOf(LocalTime.now()));
    pstmt.setDouble(5, 24.00);
    pstmt.executeUpdate();
    rs = pstmt.getGeneratedKeys();
    rs.next();
    System.out.println("Id generado " + rs.getInt(1));

        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            if(cn!=null){
                try{
                    cn.close();
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }
        }
        
        /*
        for (Cliente cliente : clientes) {
        System.out.println(cliente);
        }

        for (Producto producto : productos) {
        System.out.println(producto);
        }
        */
    }
}
