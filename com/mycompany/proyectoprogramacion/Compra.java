
package com.mycompany.proyectoprogramacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Hudson
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
                    "\n1. Cardioaspirinas" + "\n2. Acetaminofen" + "\n3. Pastillas de Ibuprofeno" + "\n0. Salir"));
            switch (option) {
            case 1: {
                cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas Cardioaspirinas desea?"));
                setSubtotal(subtotal + (cantidad * 500));
                setCardioaspirina(cardioaspirina + cantidad);
                JOptionPane.showMessageDialog(null, "Su cuenta es: ₡" + getSubtotal());
                break;
            } // Fin Case 1: Agregar Cardioaspirinas
            case 2: {
                cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas acetaminofen desea?"));
                setSubtotal(subtotal + (cantidad * 5000));
                setAcetaminofen(acetaminofen + cantidad);
                JOptionPane.showMessageDialog(null, "Su cuenta es: ₡" + getSubtotal());
                break;
            } // Fin Case 2: Agregar Acetaminofen
            case 3: {
                cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas Pastillas de ibuprofeno desea?"));
                setSubtotal(subtotal + (cantidad * 7000));
                setIbuprofeno(ibuprofeno + cantidad);
                JOptionPane.showMessageDialog(null, "Su cuenta es: ₡" + getSubtotal());
                break;
            } // Fin Case 3: Agregar Pastillas de Ibuprofeno
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
                    "\n1. Cardioaspirinas" + "\n2. Acetaminofen" + "\n3. Pastillas de ibuprofeno" + "\n0. Salir"));
            switch (option) {
            case 1: {
                if (getCardioaspirina() != 0) {
                    cantidad = Integer
                            .parseInt(JOptionPane.showInputDialog("¿Cuantas Cardioaspirinas desea eliminar?"));
                    if (cantidad > getCardioaspirina()) {
                        JOptionPane.showMessageDialog(null, "Disculpe, no posee tantas Cardioaspirinas");
                    } else {
                        if (cantidad > 1) {
                            JOptionPane.showMessageDialog(null,
                                    "Se eliminaron " + cantidad + " Cardioaspirinas del carrito");
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Se eliminó " + cantidad + " Cardioaspirinas del carrito");
                        }
                        setSubtotal(getSubtotal() - (cantidad * 500));
                        setCardioaspirina(getCardioaspirina() - cantidad);
                        JOptionPane.showMessageDialog(null, "Su cuenta es: ₡" + getSubtotal());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No tiene Cardioaspirinas dentro del carrito de compras");
                }
                break; // Ricardoooooooooooooooooo

            } // Fin Case 1: Eliminar Cardioaspirinas
            case 2: {
                if (getAcetaminofen() != 0) {
                    cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas acetaminofen desea eliminar?"));
                    if (cantidad > getAcetaminofen()) {
                        JOptionPane.showMessageDialog(null, "Disculpe, no posee tantas acetaminofen");
                    } else {
                        if (cantidad > 1) {
                            JOptionPane.showMessageDialog(null,
                                    "Se eliminaron " + cantidad + " acetaminofen del carrito");
                        } else {
                            JOptionPane.showMessageDialog(null, "Se eliminó " + cantidad + " acetaminofen del carrito");
                        }
                        setSubtotal(getSubtotal() - (cantidad * 5000));
                        setAcetaminofen(getAcetaminofen() - cantidad);
                        JOptionPane.showMessageDialog(null, "Su cuenta es: ₡" + getSubtotal());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No tiene acetaminofen dentro del carrito de compras");
                }
                break;
            } // Fin Case 2: Eliminar acetaminofen
            case 3: {
                if (getIbuprofeno() != 0) {
                    cantidad = Integer
                            .parseInt(JOptionPane.showInputDialog("¿Cuántas pastillas de ibuprofeno desea eliminar?"));
                    if (cantidad > getIbuprofeno()) {
                        JOptionPane.showMessageDialog(null, "Disculpe, no posee tantas pastillas de ibuprofeno");
                    } else {
                        if (cantidad > 1) {
                            JOptionPane.showMessageDialog(null,
                                    "Se eliminaron " + cantidad + " pastillas de ibuprofeno del carrito");
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Se eliminó " + cantidad + " pastilla de ibuprofeno del carrito");
                        }
                        setSubtotal(getSubtotal() - (cantidad * 7000));
                        setIbuprofeno(getIbuprofeno() - cantidad);
                        JOptionPane.showMessageDialog(null, "Su cuenta es: ₡" + getSubtotal());
                    }
                } else {
                    JOptionPane.showMessageDialog(null,
                            "No tiene pastillas de ibuprofeno dentro del carrito de compras");
                }
                break;
            } // Fin Case 3: Eliminar Pastillas ibuprofeno
            default: {
                JOptionPane.showMessageDialog(null, "Gracias por utilizar Farmatica Virtual!");
                option = 0;
                break;
            }
            }
        } while (option != 0);
    } // Fin removerCarrito() Method

    public void listaCarrito() {

        JOptionPane.showMessageDialog(null,
                "********CARRITO DE COMPRAS********" + "\nTiene: " + getCardioaspirina() + " Cardioaspirina/s"
                        + "\nTiene: " + getAcetaminofen() + " Antibiótico/s" + "\nTiene: " + getIbuprofeno()
                        + " Vacuna/s para Influencia");
    } // Fin listaCarrito() Method

}
