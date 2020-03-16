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
public class Administrativo extends Usuario{

    public Administrativo(String correo, String clave, String nombre, String apellido, char genero, char tipo) {
        super(correo, clave, nombre, apellido, genero, tipo);
    }
}
