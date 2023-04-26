/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendario;

/**
 *
 * @author winstonjgz
 */
public class Clase {
    
    public void Dias(String dia){
    
    try{
    
        switch(dia){
            case "Lunes":
                System.out.println("1");
                break;
            case "Martes":
                System.out.println("2");
                break;
            case "Miercoles":
                System.out.println("3");
                break;
            case "Jueves":
                System.out.println("4");
                break;
            case "Viernes":
                System.out.println("5");
                break;
            case "Sabado":
                System.out.println("6");
                break;
            case "Domingo":
                System.out.println("7");
                break;    
                
            default:
                throw new IllegalArgumentException("Dia Invalido: "+dia);
                
                
        }
    } 
    catch(IllegalArgumentException mensaje){
                    System.out.println("Dia no encontrado");
                    System.out.println("Error tecnico "+ mensaje);
                }

    }
}
