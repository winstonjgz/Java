

package com.siglo21services.exrepetcentinela;

import java.util.Scanner;

/**
 *
 * @author Winston J. Guzman
 */
public class ExRepetCentinela {

    public static void main(String[] args) {

       /* boolean centinela = true;
        
        while (centinela == true){
            
            System.out.println("El valor es: "+centinela);
        
            
        }*/

       String palabra="";
       String salid = "salir";
        
       Scanner tecPalabra = new Scanner(System.in);
       
       while (!palabra.equalsIgnoreCase(salid)){
           System.out.println("Por favor ingrese una palabra: ");
           
            palabra = tecPalabra.next();
            System.out.println("La palabra entrada es: "+palabra);
       }
       
       





    }
}
