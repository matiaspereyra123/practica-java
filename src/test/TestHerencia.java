
package test;

import domain.Cliente;
import domain.Empleado;
import domain.Persona;
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
         
         //Practica matrices
         Persona personas[][]=new Persona[2][3];
            personas[0][0]= new Persona("Juan");
            personas[0][1]= new Persona("Karla");
            imprimir(personas);
     }
   
        
            public static void imprimir(Object matriz[][]){
                      for (int ren = 0; ren < matriz.length; ren++) {
                for (int col = 0; col < matriz[ren].length; col++) {
                     System.out.println("Matriz:"+ren+"-"+col+":"+matriz[ren][col]);
                }
            }
            }
        
}
