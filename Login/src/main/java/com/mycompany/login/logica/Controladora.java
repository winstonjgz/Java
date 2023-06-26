
package com.mycompany.login.logica;

import com.mycompany.login.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    ControladoraPersistencia controlPersis;

    public Controladora() {
        controlPersis = new ControladoraPersistencia();
    }

    
    //public String validarUsuario(String usuario, String password) 
    public Usuario validarUsuario(String usuario, String password) {
        //String mensaje="";
        Usuario okUser = null;
        
        List<Usuario> listaUsuarios = controlPersis.traerUsuarios();
        for (Usuario usu: listaUsuarios){
            if (usu.getNombreUsuario().equals(usuario)){
                if(usu.getPassword().equals(password)){
                    //mensaje = "Usuario y password correctos, Bienvenido al sistema";
                    okUser = usu;
                    return okUser;
                }else{
                    //mensaje="Password incorrecto";}
                    okUser=null;
                    return okUser;
                }
            }else{
                //mensaje= "Usuario no existe";
                okUser = null;
                //return okUser;
                //return mensaje;
                
            }
            
        }
        return okUser;    }

    public List<Usuario> traerUsuarios() {
        return controlPersis.traerUsuarios();
        

    }

    public List<Rol> traerRoles() {
        return controlPersis.traerRoles();
        

    }

    public void crearUsuario(String usuario, String passw, String rolRecibido) {
        Usuario usu = new Usuario();
        usu.setNombreUsuario(usuario);
        usu.setPassword(passw);
        
        Rol rolEncontrado = new Rol();
        rolEncontrado = this.traerRol(rolRecibido);
        if (rolEncontrado != null){
            usu.setUnRol(rolEncontrado);
        }
        int id = this.buscarUltimoIdUsuario();
            usu.setId(id+1);
        
        controlPersis.crearUsuario(usu);
        

    }

    private Rol traerRol(String rolRecibido) {
        List<Rol> listaRoles = controlPersis.traerRoles();
        for (Rol rol: listaRoles){
            if(rol.getNombreRol().equals(rolRecibido)){
                return rol;
            }
        }
        return null;
    }

    private int buscarUltimoIdUsuario() {
        List<Usuario> listaUsuario = this.traerUsuarios();
        Usuario usu = listaUsuario.get(listaUsuario.size()-1);
        return usu.getId();
    }

    public void borrarUsuario(int id_usuario) {
        controlPersis.borrarUsuario(id_usuario);
        
        //Notificar al usuario
        
       
    }

    public Usuario traerUsuario(int id_usuario) {
        return controlPersis.traerUsuario(id_usuario);
        

    }

    public void editarUsuario(Usuario usu, String usuario, String passw, String rolRecibido) {
        usu.setNombreUsuario(usuario);
        usu.setPassword(passw);
        
        Rol rolEncontrado = new Rol();
        rolEncontrado = this.traerRol(rolRecibido);
        if (rolEncontrado != null){
            usu.setUnRol(rolEncontrado);
        }
        
        controlPersis.editarUsuario(usu);
        
    
    }

    

    
    
}
