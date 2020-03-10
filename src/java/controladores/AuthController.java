/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.util.List;
import modelos.Usuario;

/**
 *
 * @author informatica
 */
public class AuthController {

    private Usuario user;
    private List<Usuario> listaUsuarios;
    
    
    public AuthController() {
        user = new Usuario();
    }

    public String login(){
        
        
        if(this.user.getCorreo().equals("estudiante@upb.edu.co")&& (this.user.getClave()).equals("est123")){
            
            return "homeEstudiante?faces-redirect=true";
        }
        if(this.user.getCorreo().equals("administrativo@upb.edu.co")&& (this.user.getClave()).equals("ad123")){
            return "homeAdministrativo?faces-redirect=true";
        }
        else{
            return "index?faces-redirect=true";
        }
    }
    
    
    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    
    
    
}
