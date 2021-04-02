
package com.mycompany.proyectoprogramacion;

/**
 *
 * @author hudso
 */
public class Cliente {
    private int Idcliente;
    private float dinero;

    // Constructor
    public Cliente(int Idcliente, float dinero) {
        this.Idcliente = Idcliente;
        this.dinero = dinero;
    }

    public Cliente() {
    }

    // Getter and Setter
    public int getIdcliente() {
        return Idcliente;
    }

    public void setIdcliente(int Idcliente) {
        this.Idcliente = Idcliente;
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }
}
