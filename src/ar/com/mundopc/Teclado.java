package ar.com.mundopc;

public class Teclado extends DispositivoEntrada {

    private final int idTeclado;
    private static int contadorTeclados;

    public Teclado(String entrada, String marca) {
        super(entrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teclado{");
        sb.append("idTeclado=").append(this.idTeclado);
        sb.append(",").append(super.toString()); //para acceder de manera directa a la clase padre 
        sb.append('}');
        return sb.toString();
    }

}
