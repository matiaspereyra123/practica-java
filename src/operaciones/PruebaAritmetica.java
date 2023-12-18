
package operaciones;


public class PruebaAritmetica {
    public static void main(String[] args) {
        //variables locales
        int a = 10;
        int b = 2;
      /*  Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a=3;
        aritmetica1.b=2;
        
        aritmetica1.sumar();
      int resultado =  aritmetica1.sumarConRetorno();
        System.out.println("resultado desde la clase de prueba = " + resultado);
        resultado=aritmetica1.sumarConArgumentos(2, 6);
        System.out.println("resultado Con Argumentoss = " + resultado);
        System.out.println("la suma con argumentos es: "+aritmetica1.sumarConArgumentos(1, 3));  */
        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("aritmentica1 a: " + aritmetica1.a);
        System.out.println("aritmetica1 b: " + aritmetica1.b);
        
         Aritmetica aritmetica2 = new Aritmetica(2, 3);
          System.out.println("aritmentica1 a: " + aritmetica2.a);
        System.out.println("aritmetica1 b: " + aritmetica2.b);
        
        //constructor vacio
        Caja  caja1 = new Caja();
        caja1.ancho=4;
        caja1.alto=2;
        caja1.profundo=2;
        caja1.calcularVolumen();
        
        //metodo constructor con argumentos.
        Caja caja2 = new Caja(3,2,6);
        caja2.calcularVolumen();
    }
}
