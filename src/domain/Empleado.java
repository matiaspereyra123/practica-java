
package domain;

//hereda atributos de la clase padre Persona 
public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado(String nombre,  double sueldo) {
        super(nombre); //constructor  clase padre con SUPER
        this.idEmpleado=++Empleado.contadorEmpleado; //variable estatica anteponer nombre de la clase.
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }


    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(", Persona{").append(super.toString()).append("}"); //para acceder de manera directa a la clase padre 
        sb.append('}');
        return sb.toString();
    }

  
    
    
    
    
    
}
