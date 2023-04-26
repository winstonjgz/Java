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
public class Profesor extends Persona {
    // arriba se agrega extends Persona indicando que se va a
    //heredar los atributos de la clase persona
    private String Matricula;
    
    // se procede adicionalmente a crear un constructor para esta clase
    
    public Profesor(String nombre, String apellido, int edad){
        // ahora se indica con "super" de donde se heredan los atributos de la clase
        
        super(nombre, apellido, edad);
        Matricula = "000";
        
    }
    public void mostrardatos(){
        System.out.println("Nombre profesor: " + nombre);
        System.out.println("Apellido profesor: " + apellido);
        System.out.println("Edad profesor: " + edad);
        System.out.println("Matricula profesor: " + Matricula);
        
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }
    
}
