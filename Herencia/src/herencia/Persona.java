/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author winstonjgz
 */
public class Persona {
    
    protected String nombre; // se cambia private a protected para poder heredar
    protected String apellido;
    protected int edad;
    
    // constructor
    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        
        
        
    }
    
}
