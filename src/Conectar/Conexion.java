
package Conectar;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    
    Connection con;
    
    public boolean conectar(String maquina,String nombreBd,String user,String pass){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://"+maquina+":3306/"+nombreBd+"",user,pass);
            return true;
            
        } catch (Exception e) {
            return false;
        }
    }
    
   
    
    
}
