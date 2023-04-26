

package com.siglo21services.prcmatriznota;

import java.util.Scanner;

/**
 *
 * @author Winston J. Guzman
 */
public class PrcMatrizNota {

    public static void main(String[] args) {
        
        Double matriz[][]= new Double[4][4];
        Double sumaNota=0.0;
        int contarNota=0;
        Scanner tecNota= new Scanner(System.in);
        
        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
                System.out.println("Ingrese el alumno "+i);
                matriz[i][j]=tecNota.nextDouble();
                sumaNota=sumaNota+matriz[i][j];
                
            }
            matriz[i][3]=sumaNota/3;
            sumaNota=0.0;
            
        }
        
        for(int i=0; i<4; i++){
            System.out.println("Las notas del alumno "+i+" son: ");
            for(int j=0; j<3; j++){
                
                System.out.println("Nota N "+i+" "+matriz[i][j]);
            }
            System.out.println("El promedio es: "+matriz[i][3]);
        }
        
        
    }
}
