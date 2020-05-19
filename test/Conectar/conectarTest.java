
package Conectar;

import junit.framework.TestCase;



public class conectarTest extends TestCase{
    
   private Conexion cone;
   
   public void esc(){
       cone=new Conexion();
   }
   
   public void testConectar(){
       esc();
       boolean v=cone.conectar("localhost", "ghgh", "root", "");
       boolean vv=true;
       assertEquals(v, vv);
   }
  
}

