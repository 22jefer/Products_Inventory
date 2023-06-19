
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    
    
    Connection connt;
    
    String bd = "BDproductsInventory";
    String url = "jdbc:mysql://localhost:3306/";
    String user = "root";
    String password = "";
    String driver = "com.mysql.cj.jdbc.Driver";
    
    public Connection conectar(){
             
        try {
            Class.forName(driver);
            connt = DriverManager.getConnection(url+bd, user, password);
            System.out.println("Base de datos "+bd+" conectada");
            
        } catch (Exception e) {
            
            System.out.println("No se conecto a la base de datos "+bd+"\n"+e);
        }
        
        return connt;
       
    }
    
    public void desconectar(){
        
        try {
            connt.close();
            System.out.println("Base de datos desconectada");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
