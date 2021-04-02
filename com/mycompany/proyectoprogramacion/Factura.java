/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoprogramacion;

/**
 *
 * @author hudso
 */
public class Factura {
    //Atributos
    private int Idfactura;
    private float descuento;
    private float impuestos = (float) 0.13;
    private float total;
    
    //Constructor
    public Factura(int Idfactura, int descuento, int impuestos, int total) {
        this.Idfactura = Idfactura;
        this.descuento = descuento;
        this.impuestos = impuestos;
        this.total = total;
    }
    
    public Factura() {
        //Constructor para llamar desde menu
    }

    //Getter and Setter

    public int getIdFactura() {
        return Idfactura;
    }

    public void setIdFactura(int Idfactura) {
        this.Idfactura = Idfactura;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public float getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(float impuestos) {
        this.impuestos = impuestos;
    }

    public float getTotal() {
        return total;
    }
    
    public void setTotal(float total) {
        this.total = total;
    }

    public void facturarCompra(){
        
    }
}
