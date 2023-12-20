/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundopc;

import ar.com.mundopc.*;

/**
 *
 * @author raulm
 */
public class MundoPc {
    public static void main(String[] args) {
        Monitor monitor1 = new Monitor("HP",13);
        Teclado teclado1 = new Teclado("Cable","HP");
        Raton raton1 = new Raton("Cable","HP");
        Computadora computadora1 = new Computadora("COMPUTADORA OFICINA",monitor1,teclado1,raton1);
        
        Monitor monitor2 = new Monitor("SAMSUNG GAMER",34);
        Teclado teclado2 = new Teclado("Cable","GAMER NOGA");
        Raton raton2 = new Raton("Cable","GAMER NOGA LED");
        Computadora computadora2 = new Computadora("GAMER",monitor2,teclado2,raton2);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.agregarComputadora(computadora2);
    
        orden1.mostrarOrden();
    }
}
