
package com.mycompany.proyectoprogramacion;

/**
 * 
 * @author Hudson
 * 
 * @author Ricardo
 */
public class Cliente {
    private int idCliente;
    private float dinero;

    // Constructor
    public Cliente(int idCliente, float dinero) {
        this.idCliente = idCliente;
        this.dinero = dinero;
    }

    public Cliente() {
    }

    // Getter and Setter
    public int getIdcliente() {
        return idCliente;
    }

    public void setIdcliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }
}
