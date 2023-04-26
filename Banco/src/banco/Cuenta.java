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
public class Cuenta {
    private String titular;
    private double importe;
    
    public Cuenta(String Titular, double Importe){
        this.titular = Titular;
        this.importe = Importe;
        
    }
    
    public void ingresar(double Importe){
        if( importe > 0 ){
            this.importe += Importe;
        }
    }
    public void retirar(double Importe){
        if( this.importe - Importe < 0 ){
            this.importe = 0;
        }
        else{
            this.importe -= Importe;
            
        }
    }
    
    @Override
    public String toString(){
        return "el titular: " + titular + " tiene un saldo de: " + importe;
        
    } 
}
