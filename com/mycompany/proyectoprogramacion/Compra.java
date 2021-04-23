
package com.mycompany.proyectoprogramacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Hudson
 * @author Ricardo
 */
public class Compra {
    
    //Atributos
    
    private static float subtotal;
    private static int cardioaspirina;
    private static int acetaminofen;
    private static int ibuprofeno;
    
    //Constructor

    public Compra() {
    }
    
    public Compra(float subtotal, int cardioaspirina,int aceacetaminofen,int ibuprofeno){
        this.subtotal=subtotal;
        this.cardioaspirina=cardioaspirina;
        this.acetaminofen=aceacetaminofen;
        this.ibuprofeno=ibuprofeno;
        
    }
       
    //Getter and Setter
    
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
    
    
    //Métodos
    public void agregarCarrito() {
        int cantidad;
        int opcion;
        JOptionPane.showMessageDialog(null, "Qué desea comprar?");
        
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("\n1. cardioaspirina" + "\n2. acetaminofen" + "\n3. ibuprofeno" + "\n0. Salir"));
            switch(opcion) {
                case 1: {
                    cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cúantas cardioaspirina desea?"));
                    setSubtotal(subtotal + (cantidad * 500));
                    setCardioaspirina(cardioaspirina + cantidad);
                    JOptionPane.showMessageDialog(null, "Su cuenta es: ₡" + getSubtotal());
                    break;
                } //Fin Case 1: Agregar Mascarillas
                case 2: {
                    cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cúantas acetaminofen desea?"));
                    setSubtotal(subtotal + (cantidad * 5000));
                    setAcetaminofen(acetaminofen + cantidad);
                    JOptionPane.showMessageDialog(null, "Su cuenta es: ₡" + getSubtotal());
                    break;
                } //Fin Case 2: Agregar Bombas de Sabutamol
                case 3: {
                    cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cúantas ibuprofeno desea?"));
                    setSubtotal(subtotal + (cantidad * 7000));
                    setIbuprofeno(ibuprofeno + cantidad);
                    JOptionPane.showMessageDialog(null, "Su cuenta es: ₡" + getSubtotal());
                    break;
                } //Fin Case 3: Agregar Pastillas de Paracetamol
                default: {
                    JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestro servicio!");
                    opcion = 0;
                    break;
                } //Fin Switch Comprar Productos
            }
        }while(opcion != 0);
    } //Fin agregarCarrito() Method
    
    public void removerCarrito() {
        int cantidad;
        int opcion;
        JOptionPane.showMessageDialog(null, "Qué desea eliminar?");
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("\n1. cardioaspirinas " + "\n2. acetaminofen" + "\n3. ibuprofeno" + "\n0. Salir"));
            switch(opcion) {
                case 1: {
                    if(getCardioaspirina() != 0) {
                        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuantas cardioaspirinas desea eliminar?"));
                        if(cantidad > getCardioaspirina()) {
                            JOptionPane.showMessageDialog(null, "Disculpe, no posee tantas cardioaspirinas");
                        } else {
                            if(cantidad > 1) {
                                JOptionPane.showMessageDialog(null, "Se eliminaron " + cantidad + " cardioaspirinas del carrito");
                            } else {
                                JOptionPane.showMessageDialog(null, "Se eliminó " + cantidad + " cardioaspirinas del carrito");
                            }
                            setSubtotal(getSubtotal() - (cantidad * 500));
                            setCardioaspirina(getCardioaspirina() - cantidad);
                            JOptionPane.showMessageDialog(null, "Su cuenta es: ₡" + getSubtotal());
                        }                     
                    } else {
                        JOptionPane.showMessageDialog(null, "No tiene cardioaspirinas dentro del carrito de compras");
                    }
                    break;
                } 
                case 2: {
                    if(getAcetaminofen() != 0) {
                        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cúantas acetaminofen desea eliminar?"));
                        if(cantidad > getAcetaminofen()) {
                            JOptionPane.showMessageDialog(null, "Disculpe, no posee tantas acetaminofen");
                        } else {
                            if(cantidad > 1) {
                                JOptionPane.showMessageDialog(null, "Se eliminaron " + cantidad + " acetaminofen del carrito");
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
                } 
                case 3: {
                    if(getIbuprofeno() != 0) {
                        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cúantas ibuprofeno desea eliminar?"));
                        if(cantidad > getIbuprofeno()) {
                            JOptionPane.showMessageDialog(null, "Disculpe, no posee tantas ibuprofeno");
                        } else {
                            if(cantidad > 1) {
                                JOptionPane.showMessageDialog(null, "Se eliminaron " + cantidad + " ibuprofeno del carrito");
                            } else {
                                JOptionPane.showMessageDialog(null, "Se eliminó " + cantidad + " ibuprofeno del carrito");
                            }
                            setSubtotal(getSubtotal() - (cantidad * 7000));
                            setIbuprofeno(getIbuprofeno() - cantidad);
                            JOptionPane.showMessageDialog(null, "Su cuenta es: ₡" + getSubtotal());
                        }                     
                    } else {
                        JOptionPane.showMessageDialog(null, "No tiene ibuprofeno dentro del carrito de compras");
                    }
                    break;
                } 
                default: {
                    JOptionPane.showMessageDialog(null, "Gracias por utilizar el servicio!");
                    opcion = 0;
                    break;
                }
            }
        }while(opcion != 0);
    } //Fin removerCarrito() Method
    
    public void listaCarrito() {
        {
        JOptionPane.showMessageDialog(null, "********CARRITO DE COMPRAS********" + "\nTiene: " + getCardioaspirina() + " Cardioaspirinas/s" + "\nTiene: " + getAcetaminofen() + " Acetaminofen/s" + "\nTiene: " + getIbuprofeno() + " Ibuprofeno");
    }
    } //Fin listaCarrito() Method
    
}