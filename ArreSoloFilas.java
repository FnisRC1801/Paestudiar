
package arresolofilas;

public class ArreSoloFilas {

    public static void main(String[] args) {
       
        int [][] numeros = new int [4][];
        
        numeros [0] = new int [1];
        numeros [1] = new int [2];
        numeros [2] = new int [3];
        numeros [3] = new int [4];
        
        int k =  1;
        //System.out.println(numeros);       
        //System.out.println(numeros.length);//con este se imprimen soloeltamañodefilas
        
        //Guardar
        for (int i = 0; i < numeros.length; i++) { //control de filas
            System.out.println(numeros[i].length);
            //numeros en nuestra posicion 0
            //Numero.length[0] nos da el tamaño de la fila
            
            for (int j = 0; j < numeros[i].length; j++) {
               numeros[i] [j] = k;
               k++;
            } 
        }
        
        //Leer
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros [i][j]+" "); //->No olvidar que es print, NO println
            }
            
            System.out.println();
            
        }
    }
    
}
