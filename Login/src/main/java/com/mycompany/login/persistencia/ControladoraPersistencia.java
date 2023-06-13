
package com.mycompany.login.persistencia;

import com.mycompany.login.logica.Usuario;
import java.util.List;


public class ControladoraPersistencia {
    UsuarioJpaController usuJPA = new UsuarioJpaController();
    RolJpaController rolJpa = new RolJpaController();
    
    
    public List<Usuario> traerUsuarios() {
        return usuJPA.findUsuarioEntities();
        //findUsuarioEntities es equivalente a SELECT * FROM USUARIOS

    }
    
    
}
