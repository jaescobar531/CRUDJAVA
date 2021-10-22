
package crudjava;

import java.sql.Connection;


public class Conexiondb {

    public static void main(String[] args) {
        Connection cn;
        //instanciamos la clase conexion
        conexion con1 = new conexion();
        cn = con1.conectar();//llamamos el metodo conectar de la clase conexion
        
        if(cn!=null){
            System.out.println("Se establecio la conexión exitosamente");
        }else{
            System.out.println("Error en la conexion");
        }
        
    }
    
}
