/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;
import java.util.Date;
/**
 *
 * @author asrg2
 */
public class Solicitud {
    
    private String texto;
    private char prioridad;
    private String u;
    private Date fecha;

    public Solicitud(String texto, char prioridad, String u, Date fecha) {
        this.texto = texto;
        this.prioridad = prioridad;
        this.u = u;
        this.fecha = fecha;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public char getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(char prioridad) {
        this.prioridad = prioridad;
    }

    public String getU() {
        return u;
    }

    public void setU(String u) {
        this.u = u;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}
