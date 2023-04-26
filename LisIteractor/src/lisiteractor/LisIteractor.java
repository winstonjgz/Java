
package lisiteractor;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author winstonjgz
 */
public class LisIteractor {

    public static void main(String[] args) {
        ArrayList<String> listado = new ArrayList<>();
        listado.add("Futbol");
        listado.add("Tenis");
        listado.add("Natación");
        listado.add("Rugby");
        
        
        Iterator<String> deportes  = listado.iterator();
        
        while(deportes.hasNext()){
            System.out.println(deportes.next());
        }
            
            
        
        
    }
    
}
