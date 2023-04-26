

package com.siglo21services.prcvectores;

import java.util.Scanner;

/**
 *
 * @author Winston J. Guzman
 */
public class PrcVectores {

    public static void main(String[] args) {
        
        int vector[]=new int [15];
        
        Scanner tecVector= new Scanner(System.in);
        
        for(int i=0; i<15; i++){
            System.out.println("Ingrese el numero: "+i);
            vector[i]=tecVector.nextInt();
        }
        int contar=0;
        //recorrer y contar numeros 3
         for(int i=0; i<15; i++){
            if(vector[i]==3){
                contar+=1;
            }
        }
         
         System.out.println("Hay la cantidad de 3 en el vector es= "+contar);
        
    }
}
