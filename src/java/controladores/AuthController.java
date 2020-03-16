/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import contracts.IRegistro;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.naming.Context;
import modelos.Administrativo;
import modelos.Estudiante;
import modelos.Solicitud;
import modelos.Usuario;

/**
 *
 * @author informatica
 */
public class AuthController implements IRegistro {

    private String correo;
    private String clave;
    
    private Usuario user;
    private List<Usuario> listaUsuarios;
    
    
    private String solicitudTexto;
    private char prioridad;
    private Date fecha;
    
    private Solicitud solicitud;
    static private List<Solicitud> listaSolicitudes;
    
    
    public AuthController() {
        listaUsuarios = new ArrayList<Usuario>();
        Estudiante est = new Estudiante("estudiante@upb.edu.co", "est123", "Angela", "Remolina", 'F', 'E');
        listaUsuarios.add(est);
        
        Administrativo ad;
        ad = new Administrativo("administrativo@upb.edu.co","ad123","Sergio","Perez",'M','A');
        listaUsuarios.add(ad);
    }

    public void login() throws IOException{
        FacesContext context = FacesContext.getCurrentInstance();
        ExternalContext ex = context.getExternalContext();
        user = null;
        
        for(Usuario u:listaUsuarios){
            if(u.getCorreo().equals(correo)&& u.getClave().equals(clave)){
                user = u;
                break;
            }
        }
        
        if(user != null){
            if(user.getTipo()=='E'){
                ex.redirect("homeEstudiante.xhtml");
            }
            if(user.getTipo()=='A'){
                ex.redirect("homeAdministrativo.xhtml");
            }
            else{
                ex.redirect("index.xhtml");
            }
        }
        else{
            ex.redirect("index.xhtml");
        }
        
        
    }  
    public void logout() throws IOException{
        FacesContext context = FacesContext.getCurrentInstance();
        context.getExternalContext().invalidateSession();
        context.getExternalContext().redirect("index.xhtml");
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
        Date today = Calendar.getInstance().getTime();
        solicitud = new Solicitud(solicitudTexto, prioridad, user.getCorreo(), today);

        listaSolicitudes = new ArrayList<>();
        listaSolicitudes.add(solicitud);
        
    }

    @Override
    public void verMisSolicitudes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean checkUser(){
        if(user.getCorreo().equals(solicitud.getU())){
            return true;
        }
        if(listaSolicitudes==null){
            return false;
        }
        else{
            return false;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    public boolean isListEmpty(){
        if(listaSolicitudes != null && listaSolicitudes.size()>0){
            return false;
        }
        else{
            return true;
        }
        
    }

    public String getSolicitudTexto() {
        return solicitudTexto;
    }

    public void setSolicitudTexto(String solicitudTexto) {
        this.solicitudTexto = solicitudTexto;
    }

    public char getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(char prioridad) {
        this.prioridad = prioridad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }

    public List<Solicitud> getListaSolicitudes() {
        return listaSolicitudes;
    }

    public void setListaSolicitudes(List<Solicitud> listaSolicitudes) {
        this.listaSolicitudes = listaSolicitudes;
    }

    
}
