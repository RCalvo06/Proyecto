/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoprogramacion;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/**
 *
 * @author Hudson
 * @author Ricardo
 */
public class HojaMedica {
    //Atributos
    private float pregunta1;
    private String pregunta2;
    private float pregunta3;
    private int pregunta4;

    //Constructor
    
    
    public HojaMedica() {
        
    }

    public void cartaMedica() {
        JOptionPane.showMessageDialog(null, "Bienvenido a su registro medico" );
        pregunta2 = JOptionPane.showInputDialog("¿Cúal es su tipo de sangre?");
        pregunta3 = Float.parseFloat(JOptionPane.showInputDialog("¿Cúal es su estatura en cm? "));
        pregunta4 = Integer.parseInt(JOptionPane.showInputDialog("¿Cúal es su peso en Kg?"));
        
    } //Fin cartaMedica() Method
    
    public void verificarConsejo(){
        pregunta1=pregunta4/((pregunta3/100)*(pregunta3/100));
        DecimalFormat frmt = new DecimalFormat();
        frmt.setMaximumFractionDigits(2);
        if (pregunta1>30) {
            JOptionPane.showMessageDialog(null, "Su IMC es de "+frmt.format(pregunta1)+" por ende tiene obesidad, tener cuidado al momento de pedir Antidepresivos \n esto afectaria a su salud");
            
        }else if(pregunta1>24){
            JOptionPane.showMessageDialog(null, "Su IMC es de "+frmt.format(pregunta1)+" por ende tiene peso superior al normal, medidas dietéticas, con aumento de la actividad física y modificación de los hábitos alimentarios \n esto es de gran ayuda");
          
        }else if(pregunta1>17){
            JOptionPane.showMessageDialog(null, "Su IMC es de "+frmt.format(pregunta1)+" por ende tiene peso normal, si no es alergico a algun medicamento, le va a servir debido a que tiene buen equilibrio");
          
        }else{
            JOptionPane.showMessageDialog(null, "Su IMC es de "+frmt.format(pregunta1)+" por ende tiene peso inferior a lo normal, tener cuidado a la hora de pedir medicamentos, si no es necesario");
        }

    } 
    
}
