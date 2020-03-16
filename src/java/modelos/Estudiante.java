/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author informatica
 */
public class Estudiante extends Usuario{
    private String facultad;
    private boolean becado;
    private char estado;

    public Estudiante(String correo, String clave, String nombre, String apellido, char genero, char tipo) {
        super(correo, clave, nombre, apellido, genero, tipo);
    }
    
    
    
    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public boolean isBecado() {
        return becado;
    }

    public void setBecado(boolean becado) {
        this.becado = becado;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
}
