
package arraylistavanzado;

import java.util.ArrayList;


public class ArrayListAvanzado {

 
    public static void main(String[] args) {
        ArrayList<String> listado = new ArrayList<>();
        listado.add("Futbol");
        listado.add("Tenis");
        listado.add("Natación");
        listado.add("Rugby");
        System.out.println("La cantidad de paises son: "+ listado.size());
        
        listado.forEach((deportes)->{
            System.out.println(deportes);
        });
        
        if(listado.contains("Rugby")){
            System.out.println("Contiene Rugby");
       
        }
       
        
        listado.remove("Natación");
        listado.remove(0);
        listado.add("UFC");
        System.out.println("Ahora tenemos: "+ listado.size());
        listado.forEach((deportes)->{
            System.out.println(deportes);
        });
        
    }
    
}
