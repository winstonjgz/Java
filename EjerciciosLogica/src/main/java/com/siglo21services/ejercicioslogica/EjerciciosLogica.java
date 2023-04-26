
package com.siglo21services.ejercicioslogica;

/**
 *
 * @author Winston J. Guzman
 */
public class EjerciciosLogica {

    public static void main(String[] args) {
        int Var1, Var2, VarAux;
        Var1=35;
        Var2=20;
        
        VarAux=Var1;
        Var1=Var2;
        Var2=VarAux;
        
        
        System.out.println("Los nuevos valores son V1: " + Var1);
        System.out.println("Los nuevos valores son V2: " + Var2);
        
        if(Var1 >= Var2){
        System.out.println("La variable Var1 "+Var1+" es mayor que Var 2 "+Var2);
    }else{
        System.out.println("La variable Var1 "+Var1+" no es mayor que Var2 "+Var2);
            
        }
        
        
        
    }
}
