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
        Compra carro = new Compra();
        if(carro.getCardioaspirina() == 0 && carro.getAcetaminofen() == 0 && carro.getIbuprofeno() == 0) {
            JOptionPane.showMessageDialog(null, "Disculpe, no tiene ningún artículo dentro del carrito de compras");
        } else {
            if(carro.getCardioaspirina() > 5) {
                JOptionPane.showMessageDialog(null, "Por comprar más de 5 cardioaspirinas obtiene un 2% de descuento en sus compras");
                setDescuento((float) 0.02);
            } else if(carro.getAcetaminofen() > 3){
                JOptionPane.showMessageDialog(null, "Por comprar más de 3 acetaminofen obtiene un 4% de descuento en sus compras");
                setDescuento((float) 0.04);
            } else if(carro.getIbuprofeno()> 7){
                JOptionPane.showMessageDialog(null, "Por comprar más de 7 ibuprofeno obtiene un 12% de descuento en sus compras");
                setDescuento((float) 0.12);
            }
            setTotal(carro.getSubtotal() - (carro.getSubtotal() * getDescuento()));
            setTotal(getTotal() + (getTotal() * getImpuestos()));
            JOptionPane.showMessageDialog(null, "********FACTURA DE COMPRAS********" + "\nTiene: " + carro.getCardioaspirina() + " Mascarilla/s" + "\nTiene: " + carro.getAcetaminofen() + " Antibiótico/s" + "\nTiene: " + carro.getIbuprofeno() + " Vacuna/s para Influencia" + "\nSubtotal: ₡" + carro.getSubtotal() + "\nImpuestos: " + getImpuestos() + "%" + "\nDescuento: " + getDescuento() + "%" +  "\n********TOTAL DE COMPRAS********" +"\nTotal: ₡" + getTotal());
        }
    }
}
