/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoprogramacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Hudson
 * @author Ricardo
 */
public class HojaMedica {
    //Atributos
    private String pregunta1;
    private String pregunta2;
    private String pregunta3;
    private String pregunta4;
    private String enfermedades[] ={""};

    //Constructor
    public HojaMedica(String pregunta1, String pregunta2, String pregunta3, String pregunta4) {

        this.pregunta1 = pregunta1;
        this.pregunta2 = pregunta2;
        this.pregunta3 = pregunta3;
        this.pregunta4 = pregunta4;
    }
    
    public HojaMedica() {
        
    }

    public void cartaMedica() {
        //Preguntas a responder de los tipos de padecimientos
        
       //pregunta1 consultar para desarrollar metodo verificarConsejo
        pregunta2 = JOptionPane.showInputDialog("¿Cúal es su tipo de sangre?");
        pregunta3 = JOptionPane.showInputDialog("¿Cúal es su estatura en cm? ");
        pregunta4 = JOptionPane.showInputDialog("¿Cúal es su peso en Kg?");
    } //Fin cartaMedica() Method
    
    public void verificarConsejo(){
        
        
    } //Fin verificarEnfermedad() Method
    
}
