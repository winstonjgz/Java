/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author winstonjgz
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cuenta cuentapesos = new Cuenta("Jose", 2000);
        Cuenta cuentadolar = new Cuenta("Juan", 40); 
        
        cuentapesos.ingresar(1000);
        cuentadolar.ingresar(400);
        
        cuentadolar.retirar(50);
        cuentapesos.retirar(800);
        
        System.out.println(cuentapesos);
        System.out.println(cuentadolar);
        
        
    }
    
}
