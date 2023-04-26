
package herencia.pkg2;

public class Comercial extends Empleado{
    
    private double comision;
    
    public Comercial(String nombre, String apellido, double comision){
        super(nombre, apellido);
        this.comision = comision;
         
        
        
    }
    @Override
    public void metodoEmpleado(){
        System.out.println("Soy Comercial");
    }
    
    public void metodosoyComercial(){
        System.out.println("Mi puesto es Marketing");
        System.out.println("Mi comisión es: " + comision);
    }
    
    
}
