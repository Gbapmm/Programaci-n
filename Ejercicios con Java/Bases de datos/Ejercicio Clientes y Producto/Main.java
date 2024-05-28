
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;  
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
           
            Statement query1 = cn.createStatement();
            ResultSet rs1 = query1.executeQuery("SELECT * FROM productos");
            while(rs1.next()){
               productos.add(new Producto(rs1.getInt("id_proveedor"),rs1.getString("codigo"),rs1.getString("nombre"),rs1.getString("marca"),rs1.getString("tipo"),rs1.getFloat("peso"),rs1.getDouble("precio_unidad"),rs1.getInt("Stock")));
            }
            
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
        
        for (Cliente cliente : clientes) {
        System.out.println(cliente);
        }

        for (Producto producto : productos) {
        System.out.println(producto);
        }
    }
}
