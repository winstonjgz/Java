
package batallanaval;

import java.util.ArrayList;

/**
 *
 * @author winstonjgz
 */
public class Jugador {
    String nombre;
    String apellido;
    int puntaje;
    public ArrayList<String> disparos = new ArrayList<String>();
    private int Puntaje;
    
    public Jugador(){
        
    }
    
     public void realizardisparo(String disparo){
        disparos.add(disparo);
        
    }
     public void consultardisparo(){
         for (int i = 0; i <= disparos.size()-1; i++) {
             System.out.println(disparos.get(i));
         }
     }
      public void consultarpuntaje(){
        
    }

    public int getPuntaje() {
        return Puntaje;
    }

    public void setPuntaje(int Puntaje) {
        this.Puntaje = Puntaje;
    }
    
    
}
