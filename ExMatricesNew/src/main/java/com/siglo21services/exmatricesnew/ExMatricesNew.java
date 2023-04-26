package com.siglo21services.exmatricesnew;

import java.util.Scanner;

/**
 *
 * @author Winston J. Guzman
 */
public class ExMatricesNew {

    public static void main(String[] args) {
       int matriz [][]=new int [3][3];
        
        
        /*matriz[0][0]=5;
        matriz[0][1]=13;
        matriz[0][2]=96;
        matriz[1][0]=35;
        matriz[1][1]=33;
        matriz[1][2]=71;
        matriz[2][0]=446;
        matriz[2][1]=228;
        matriz[2][2]=24;*/
        
         
        for(int i=0; i<=2;i++){
            for(int j = 0; j<=2;j++){
        System.out.println("Ingrese los valores de fila: "+i+" columna: "+j);
        Scanner tecIngreso = new Scanner(System.in);
        
        matriz[i][j]=tecIngreso.nextInt();
            }
        }
        
        for(int i=0; i<=2;i++){
            for(int j = 0; j<=2;j++){
                
                System.out.println("La fila es: "+i+" la columna es: "+j);
                System.out.println("El valor en la matriz es: "+matriz[i][j]);
            }
        }
    }
}
