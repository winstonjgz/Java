
package arrayliststring;

import java.util.ArrayList;
import java.util.List;

/*
 * @author winstonjgz
 */
public class ArrayListString {

   
    public static void main(String[] args) {
       List<String> listado = new ArrayList<String>();
       listado.add("Peru");
       listado.add("Chile");
       listado.add("Ecuador");
       listado.add("Panama");
       listado.add("Venezuela");
       
        System.out.println("La cantidad de paises son: "+ listado.size());
       for (String paises : listado){
           System.out.println(paises);
       }
       
    }
    
}
