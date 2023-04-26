/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatchdivision;

/**
 *
 * @author winstonjgz
 */
public class TryCatchDivision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            double resultado= 9/0;
            
            
            
            
        }
//        catch(Exception mensaje){
//            System.out.println("No se puede dividir por cero");
//        }
                catch(ArithmeticException mensaje){
            System.out.println("No se puede dividir por cero");
                    System.out.println(mensaje);
        }
        
        
        
    }
    
}
