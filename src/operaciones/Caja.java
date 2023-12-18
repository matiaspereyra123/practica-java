
package operaciones;


public class Caja {
    
    int ancho;
    int alto;
    int profundo;
    
    public Caja(){
        System.out.println("Constructor vacio");
    }

    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    public void calcularVolumen(){
        int resultado =this.ancho*this.alto*this.profundo;
        System.out.println("resultado = " + resultado);
    }
}
