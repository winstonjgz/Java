
 
package batallanaval;

/**
 *
 * @author winstonjgz
 */
public class Barcos {
    public int largo;
    private String nombre;
    public int estado;
    
    public Barcos(int largo, String nombre, int estado){
        
    }
    
    
    public void recibirdisparo(){
        
    }
       
     public void hundirse(){
        
    }
     
      public void moverse(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }
    
    @Override
    public String toString(){
        return "Mi barco es: "+ this.nombre;
    } 
    
    
} 
