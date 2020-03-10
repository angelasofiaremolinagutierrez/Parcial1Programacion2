/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import contracts.IRegistro;
import java.io.IOException;
import java.util.List;
import javax.faces.context.FacesContext;
import modelos.Usuario;

/**
 *
 * @author informatica
 */
public class AuthController implements IRegistro {

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
    public void logout() throws IOException{
        FacesContext context = FacesContext.getCurrentInstance();
        context.getExternalContext().invalidateSession();
        context.getExternalContext().redirect("index.xhtml");
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

    @Override
    public void verUsuarios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void verBitacora() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void verSolicitudes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void registrarSolicitud() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void verMisSolicitudes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
