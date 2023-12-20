
package ar.com.mundopc;


public class Raton extends DispositivoEntrada {
    private final int idRaton;
    private  static int contadorRatones;
    
    
    public Raton(String entrada, String marca) {
        super(entrada, marca);
        this.idRaton=++Raton.contadorRatones;
    }
        @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Raton{");
        sb.append("idRaton=").append(this.idRaton);
        sb.append(",").append(super.toString()); //para acceder de manera directa a la clase padre 
        sb.append('}');
        return sb.toString();
    }

}
