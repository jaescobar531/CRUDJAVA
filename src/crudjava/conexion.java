package crudjava;

//librerias para la conexión a la base de datos
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class conexion {
    Connection conectar = null;
    
    //metodo
    public Connection conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/final", "root", "");
            JOptionPane.showMessageDialog(null,"Conexión Exitosa");
        }catch(Exception e){
            
        }
        return conectar;
    }
}
