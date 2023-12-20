
package ar.com.mundopc;


public class Monitor {
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;
    
    
    private Monitor(){
        this.idMonitor=++Monitor.contadorMonitores;
    }
    
    public Monitor(String marca, double tamanio){
        this();
        this.marca=marca;
        this.tamanio=tamanio;
    }

    public int getIdMonitor(){
        return this.idMonitor;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamano() {
        return tamanio;
    }

    public void setTamano(double tamano) {
        this.tamanio = tamano;
    }
    
    @Override
    public String toString() {
        return "Monitor{" + "marca=" + marca + ", tamano=" + tamanio + '}';
    }
    
}
