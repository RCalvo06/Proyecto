/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoprogramacion;

import javax.swing.JOptionPane;

/**
 *
 * @author hudso
 */
public class Persona {
     //Atributos

    private String usuario;
    private String password;
    private String nombre;
    private String apellido;
    
    //Constructor
    public Persona(String usuario, String password, String nombre, String apellido) {
        this.usuario = usuario;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Persona(){
    }
    
    //Getter and Setter
    

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
       public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    //Metodos
    public void verificarLogin(String nombre, String password) {
        
    } //Fin verericarLogin() Method
    
    public void registro() {
        setNombre(JOptionPane.showInputDialog("¿Cúal es su nombre?"));
        setApellido(JOptionPane.showInputDialog("¿Cúal es su apellido?"));
        setUsuario(JOptionPane.showInputDialog("Escriba un nombre de usuario"));
        setPassword(JOptionPane.showInputDialog("Escriba una contraseña"));
    }
}
