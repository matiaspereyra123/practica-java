
package operaciones;


public class Matrices {
    public static void main(String[] args) {
            int array[][] = {
                                {1,2,3,4,5},
                                {6,7,8,9,10},
                                {11,12,13,14,15}
                            };
            
            //Recorrermos el array multidemensional
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    System.out.println(array[i][j]);
                }
                    System.out.println("Recorremos primer columna");
                //recorremos la primera columna de todas las filas
                for (int j = 0; j < array.length; j++) {
                    System.out.println(array[i][0]);
                }
            
        }
    }
    
}
