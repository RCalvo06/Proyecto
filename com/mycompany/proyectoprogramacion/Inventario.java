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
public class Inventario {
     //Atributos
    private int Idinventario;
    private String producto;
    private float precio;
    
    //Constructor
    public Inventario(int Idinventario, String producto, float precio) {
        this.Idinventario = Idinventario;
        this.producto = producto;
        this.precio = precio;
    }
    
    public Inventario() {
        
    }
    
    //Getter and Setter
    public int getIdinventario() {
        return Idinventario;
    }

    public void setIdinventario(int Idinventario) {
        this.Idinventario = Idinventario;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public void mostrarInventario() {
        Inventario cardioaspirina = new Inventario(1, "Cardio Aspirina", 500);
        Inventario acetaminofen = new Inventario(2, "Acetaminofen", 5000);
        Inventario ibuprofeno = new Inventario(3, "Ibuprofeno", 7000);
        JOptionPane.showMessageDialog(null,"\nNombre: " + cardioaspirina.getProducto() + "\nPrecio: " + cardioaspirina.getPrecio());
        JOptionPane.showMessageDialog(null,"\nNombre: " + acetaminofen.getProducto() + "\nPrecio: " + acetaminofen.getPrecio());
        JOptionPane.showMessageDialog(null,"\nNombre: " + ibuprofeno.getProducto() + "\nPrecio: " + ibuprofeno.getPrecio());
    } //Fin de mostrarInventario() Method

}
