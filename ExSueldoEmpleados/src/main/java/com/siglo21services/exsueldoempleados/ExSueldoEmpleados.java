
package com.siglo21services.exsueldoempleados;

import java.util.Scanner;

/**
 *
 * @author Winston J. Guzman
 */
public class ExSueldoEmpleados {

    public static void main(String[] args) {
       double sueldo=0;
        int categoria;
        
        System.out.println("Ingrese la categoria para calcular el sueldo: ");
        
        Scanner teclado = new Scanner(System.in);
        
        categoria = teclado.nextInt();
        
        if(categoria == 1){
            sueldo=15890*1.1;
            
        }else if(categoria == 2){
            sueldo= 25630.89;
        }else if(categoria == 3){
            sueldo= 35560.2*0.89;
            
            
        }else{
            System.out.println("Categoria no corresponde!!!");
        }
          
        if(categoria >=1 && categoria <=3){
        System.out.println("El sueldo es: "+sueldo);     
            
        }
                
                
    }
}
