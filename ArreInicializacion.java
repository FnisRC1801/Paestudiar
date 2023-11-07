
package arreinicializacion;

public class ArreInicializacion {

    public static void main(String[] args) {
       
        String nombres[][] = {
            {"pao", "Jessi", "jesus"},
            {"Pablo", "Karla", "Isma"},
            {"Fanny", "Alex", "Samuel"}
        };//No olvides lascomas fanny >:(
        
        //Leer
        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres[i].length; j++) {
                System.out.print(nombres[i][j]+", ");//Poner +", " es para que se guarde mas bonto y ordenado 
            }
            System.out.println();
        }
    }
    
}
