
package com.mycompany.proyectoprogramacion;

import javax.swing.JOptionPane;

/**
 *
 * @author hudson
 * @author Ricardo
 */
public class Compra {

    // Variables Locales

    int option = 0;
    int cantidad = 0;

    // Atributos

    private static float subtotal;
    private static int cardioaspirina;
    private static int acetaminofen;
    private static int ibuprofeno;

    // Constructor

    public Compra() {
        // Constructor para llamar desde menu
    }

    // Getter and Setter

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public int getCardioaspirina() {
        return cardioaspirina;
    }

    public void setCardioaspirina(int cardioaspirina) {
        this.cardioaspirina = cardioaspirina;
    }

    public int getAcetaminofen() {
        return acetaminofen;
    }

    public void setAcetaminofen(int acetaminofen) {
        this.acetaminofen = acetaminofen;
    }

    public int getIbuprofeno() {
        return ibuprofeno;
    }

    public void setIbuprofeno(int ibuprofeno) {
        this.ibuprofeno = ibuprofeno;
    }

    // Métodos
    public void agregarCarrito() {

        JOptionPane.showMessageDialog(null, "Qué desea comprar?");
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog(
                    "\n1. Mascarillas" + "\n2. Bombas de Salbutamol" + "\n3. Pastillas de Paracetamol" + "\n0. Salir"));
            switch (option) {
            case 1: {
                cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cúantas mascarillas desea?"));
                setSubtotal(subtotal + (cantidad * 500));
                setCardioaspirina(cardioaspirina + cantidad);
                JOptionPane.showMessageDialog(null, "Su cuenta es: ₡" + getSubtotal());
                break;
            } // Fin Case 1: Agregar Mascarillas
            case 2: {
                cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cúantas bombas de salbutamol desea?"));
                setSubtotal(subtotal + (cantidad * 5000));
                setAcetaminofen(acetaminofen + cantidad);
                JOptionPane.showMessageDialog(null, "Su cuenta es: ₡" + getSubtotal());
                break;
            } // Fin Case 2: Agregar Bombas de Sabutamol
            case 3: {
                cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cúantas Pastillas de paracetamol desea?"));
                setSubtotal(subtotal + (cantidad * 7000));
                setIbuprofeno(ibuprofeno + cantidad);
                JOptionPane.showMessageDialog(null, "Su cuenta es: ₡" + getSubtotal());
                break;
            } // Fin Case 3: Agregar Pastillas de Paracetamol
            default: {
                JOptionPane.showMessageDialog(null, "Gracias por utilizar Farmatica Virtual!");
                option = 0;
                break;
            } // Fin Switch Comprar Productos
            }
        } while (option != 0);

    } // Fin agregarCarrito() Method

    public void removerCarrito() {
 JOptionPane.showMessageDialog(null, "Qué desea eliminar?");
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog(
                    "\n1. Mascarillas" + "\n2. Bombas de Salbutamol" + "\n3. Pastillas de Paracetamol" + "\n0. Salir"));
            switch (option) {
            case 1: {
                if (getCardioaspirina() != 0) {
                    cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuantas mascarillas desea eliminar?"));
                    if (cantidad > getCardioaspirina()) {
                        JOptionPane.showMessageDialog(null, "Disculpe, no posee tantas mascarillas");
                    } else {
                        if (cantidad > 1) {
                            JOptionPane.showMessageDialog(null,
                                    "Se eliminaron " + cantidad + " mascarillas del carrito");
                        } else {
                            JOptionPane.showMessageDialog(null, "Se eliminó " + cantidad + " mascarilla del carrito");
                        }
                        setSubtotal(getSubtotal() - (cantidad * 500));
                        setCardioaspirina(getCardioaspirina() - cantidad);
                        JOptionPane.showMessageDialog(null, "Su cuenta es: ₡" + getSubtotal());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No tiene mascarillas dentro del carrito de compras");
                }
                break;
    } // Fin removerCarrito() Method

    public void listaCarrito() {

        JOptionPane.showMessageDialog(null,
                "********CARRITO DE COMPRAS********" + "\nTiene: " + getCardioaspirina() + " Mascarilla/s" + "\nTiene: "
                        + getAcetaminofen() + " Antibiótico/s" + "\nTiene: " + getIbuprofeno()
                        + " Vacuna/s para Influencia");
    } // Fin listaCarrito() Method

}
