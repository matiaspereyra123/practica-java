
package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;


public class TestHerencia {
        public static void main(String[] args) {
            
         Empleado empleado1 = new Empleado("Juan", 6000);
         System.out.println("Empleado1  = " + empleado1);
         
         Date fecha = new Date();
         Cliente cliente1 = new Cliente(fecha, true, "Lorenzo",   'M', 10, "Goleta Fortuna 5951");
         System.out.println("cliente1 = " + cliente1);
    
         Cliente cliente2 = new Cliente(fecha, false, "Milo",   'M', 10, "Goleta Fortuna 5951");
         System.out.println("cliente2 = " + cliente2);
    }
   
}
