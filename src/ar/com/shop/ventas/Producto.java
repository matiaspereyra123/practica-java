
package ar.com.shop.ventas;


public class Producto {
   private final int idProducto;
   private String nombre;
   private double precio;
   private static int contadorProductos;
   
   private Producto(){
       this.idProducto=++Producto.contadorProductos;
   }
   public Producto(String nombre, double precio){
       this(); //llamamos al constructor privado y debe estar en la primera linea.
       this.nombre=nombre;
       this.precio=precio;
   }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getPrecio(){
        return precio;
    };
    
    public void setPrecio(double precio){
        this.precio=precio;
    }

  //  @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Producto{");
//        sb.append("idProducto=").append(idProducto);
//        sb.append(", nombre=").append(nombre);
//        sb.append(", precio=").append(precio);
//        sb.append('}');
//        return sb.toString();
//    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
   
   
}
