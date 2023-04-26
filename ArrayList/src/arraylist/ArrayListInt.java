
package arraylist;

import java.util.ArrayList;

/**
 *
 * @author winstonjgz
 */
public class ArrayListInt {

     
    public static void main(String[] args) {
       ArrayList<Integer> numeros = new ArrayList<Integer>();
       numeros.add(25);
       numeros.add(1);
       numeros.add(38);
       numeros.add(-4);
       numeros.add(314);
        System.out.println("La cantidad es: " + numeros.size());
        System.out.println("El que esta en la posicion 3 es: "+ numeros.get(3));
        
       
        
    }
    
}
