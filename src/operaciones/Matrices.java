
package operaciones;


public class Matrices {
    public static void main(String[] args) {
            int edades[][] = new int [3][2];
            edades[0][0]=5;
            edades[0][1]=7;
            edades[1][0]=8;
            edades[1][1]=4;
            
            System.out.println("edad [0]-[0] :"+edades[0][0]);
            for (int ren = 0; ren < edades.length; ren++) {
                for (int col = 0; col < edades[ren].length; col++) {
                    System.out.println("Edades:"+ren+"-"+col+":"+edades[ren][col]);
                }
            
        }
            System.out.println("--");
            
            String frutas[][]={{"Naranja", "Limon"},{"Fresa", "Zarzamora","Mora"}};
            for (int ren = 0; ren < frutas.length; ren++) {
                for (int col = 0; col < frutas[ren].length; col++) {
                     System.out.println("Frutas:"+ren+"-"+col+":"+frutas[ren][col]);
                }
        }
            
            
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
