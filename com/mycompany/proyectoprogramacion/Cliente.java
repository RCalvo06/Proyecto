
package com.mycompany.proyectoprogramacion;

/**
 *
<<<<<<< HEAD
 * @author hudson
=======
 * @author Hudson
>>>>>>> 10ed321706df5251a77a69ad9dc888bb83727a95
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
