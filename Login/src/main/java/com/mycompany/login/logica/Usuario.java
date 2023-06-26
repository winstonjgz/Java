
package com.mycompany.login.logica;


import java.io.Serializable;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Usuario implements Serializable {
    
    @Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nombreUsuario;
    private String password;

    @ManyToOne
    @JoinColumn(name = "fk_rol")
    private Rol unRol;

    public Usuario() {
    }
    
    public Usuario(String nombreUsuario, String password, Rol unRol) {
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.unRol = unRol;
    }
    
    public Rol getUnRol() {
        return unRol;
    }
     
    public void setUnRol(Rol unRol) {
        this.unRol = unRol;
    }
    
    

    

    public Usuario(int id, String nombreUsuario, String password) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    
    
}


   