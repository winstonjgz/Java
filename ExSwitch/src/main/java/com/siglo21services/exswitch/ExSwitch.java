
package com.siglo21services.exswitch;

/**
 *
 * @author Winston J. Guzman
 */
public class ExSwitch {

    public static void main(String[] args) {
            int dia=7;
            String nombreDia;
            
            switch (dia){
                case 1: 
                    nombreDia="Lunes";
                    break;
                case 2: 
                    nombreDia="Martes";
                    break;
                case 3: 
                    nombreDia="Miercoles";
                    break;
                case 4: 
                    nombreDia="Jueves";
                    break;
                case 5: 
                    nombreDia="Viernes";
                    break;
                case 6: 
                    nombreDia="Sabado";
                    break;
                case 7: 
                    nombreDia="Domingo";
                    break;
                
                default: nombreDia="Invalido";
                    break;
              
                
                
                
                
            }

                System.out.println("El dia de la variable es: "+nombreDia);


    }
}
