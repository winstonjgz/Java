
package com.siglo21services.exrepefor;

import java.util.Scanner;

/**
 *
 * @author Winston J. Guzman
 */
public class ExRepeFor {

    public static void main(String[] args) {
        
       /* int Var1;
        
        
        for(Var1=0; Var1<=10; Var1++){
            
            System.out.println("Esta dando este ciclo: "+ Var1);
            
            
            
        }*/
       int i, numeroEntra1;
        System.out.println("POr favor ingrese el numero maximo a listar: ");
       Scanner numeroEntra = new Scanner(System.in);
       
       numeroEntra1=numeroEntra.nextInt();
       for (i=1; i<=numeroEntra1; i++){
           System.out.println("En secuencia este es el numero: "+i);
       };
        
        
        
        
    }
}
