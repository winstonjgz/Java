
package batallanaval;

/**
 *
 * @author winstonjgz
 */
public class BatallaNaval {

    public static void main(String[] args) {
        
        Metodos msg = new Metodos();
        
//        Barcos Lancha = new Barcos();
//        Lancha.recibirdisparo();
//        Lancha.largo = 1;
//        Lancha.setNombre("Maria");
//        System.out.println(Lancha.getNombre());
//        System.out.println(Lancha.toString);
        
//        Submarino Sub = new Submarino(10, "USS", 1);
        



        Jugador Persona = new Jugador();
        Persona.setPuntaje(1500);
        Persona.consultarpuntaje();
//        Persona.realizardisparo("A2");
//        Persona.realizardisparo("B4");
//        Persona.realizardisparo("F5");
//        Persona.consultardisparo();
//        msg.lanzamsg(1500);
        NuevoJuego NN = new NuevoJuego();
        NN.setVisible(true);
        
        
    }
    
}
