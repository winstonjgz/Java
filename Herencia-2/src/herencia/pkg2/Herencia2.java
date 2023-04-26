/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.pkg2;

/**
 *
 * @author winstonjgz
 */
public class Herencia2 {

    public static void main(String[] args) {
//    Comercial CC = new Comercial("Juan", "Perez", 1500);
//    Repositor RR = new Repositor("Jose", "Gomez", "Avellaneda");

        Empleado CC = (Empleado) new Comercial("Juan", "Perez", 1500);
        Empleado RR = (Empleado) new Repositor("Jose", "Gomez", "Avellaneda");
        
                
//                CC.metodoEmpleado();
////                CC.metodosoyComercial();
////                RR.metodoEmpleado();
//                RR.metodoEmpleado2();
                
        // si queremos castear el metodo hacia las clases desde empleado el metodo es el siguiente
        
        if (CC instanceof Comercial){
            CC.metodoEmpleado();
            CC.metodoEmpleado2();
            ((Comercial) CC).metodosoyComercial();
            
            
            
        }
        
    }
    
}
