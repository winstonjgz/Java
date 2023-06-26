
package com.mycompany.login.persistencia;

import com.mycompany.login.logica.Rol;
import com.mycompany.login.logica.Usuario;
import com.mycompany.login.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    UsuarioJpaController usuJPA = new UsuarioJpaController();
    RolJpaController rolJpa = new RolJpaController();
    
    
    public List<Usuario> traerUsuarios() {
        return usuJPA.findUsuarioEntities();
        //findUsuarioEntities es equivalente a SELECT * FROM USUARIOS

    }

    public List<Rol> traerRoles() {
        return rolJpa.findRolEntities();
                
    }

    public void crearUsuario(Usuario usu) {
        usuJPA.create(usu);

    }

    public void borrarUsuario(int id_usuario) {
        try{
            usuJPA.destroy(id_usuario);

        } catch (NonexistentEntityException ex){
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public Usuario traerUsuario(int id_usuario) {
        return usuJPA.findUsuario(id_usuario);
    }

    public void editarUsuario(Usuario usu) {
               
        try{
            usuJPA.edit(usu);

        } catch (Exception ex){
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
