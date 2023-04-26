
package com.mycompany.login.logica;

import com.mycompany.login.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    ControladoraPersistencia controlPersis;

    public Controladora() {
        controlPersis = new ControladoraPersistencia();
    }

    
    
    public String validarUsuario(String usuario, String password) {
String mensaje="";
        
        List<Usuario> listaUsuarios = controlPersis.traerUsuarios();
        for (Usuario usu: listaUsuarios){
            if (usu.getNombreUsuario().equals(usuario)){
                if(usu.getPassword().equals(password)){
                    mensaje = "Usuario y password correctos, Bienvenido al sistema";
                    return mensaje;
                }else{
                mensaje="Password incorrecto";}
                return mensaje;
                }
            else{
                mensaje= "Usuario no existe";
                //return mensaje;
            }
            
        }
        return mensaje;    }
    
}
