
package ar.com.shop.ventas.test;

import ar.com.shop.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
         Producto producto1 = new Producto("camisa",50.00);
         Producto producto2 = new Producto("pantalon",100.50);
    
         Orden orden1 = new Orden();
         orden1.agregarProducto(producto1);
         orden1.agregarProducto(producto2);
         orden1.agregarProducto(producto2);
         
         
         orden1.mostrarOrden();
       
    
    }
  
}
