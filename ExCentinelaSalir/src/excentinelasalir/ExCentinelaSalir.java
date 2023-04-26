
package excentinelasalir;

/**
 *
 * @author Winston J. Guzman
 */
public class ExCentinelaSalir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String palabra="";
       String salid = "salir";
        
       
       while (palabra != salid){
           System.out.println("Por favor ingrese una palabra: ");
           Scanner tecPalabra = new Scanner(System.in);
            palabra = tecPalabra.next();
            System.out.println("La palabra entrada es: "+palabra);
       }
                
                
                
                
    }
    
}
