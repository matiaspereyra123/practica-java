
package operaciones;


public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;
    
    //constructor vacio
    public Aritmetica(){
        System.out.println("Ejecutando Constructor");
    }

    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con argumentos");
    }
    

    
    //Metodo
    
    public  void  sumar(){
        int resultado = this.a+this.b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno(){
       return a+b;
    }
    
    public int sumarConArgumentos( int a, int b){
     this.a = a; // el argumento a se asigna al atributo this.a
     this.b=b;
     //return a+b;
     return this.sumarConRetorno();
    }
    
}

