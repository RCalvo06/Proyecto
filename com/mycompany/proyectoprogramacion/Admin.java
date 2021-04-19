
package com.mycompany.proyectoprogramacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Hudson
 * @author Ricardo
 */
public class Admin {
    // Atributos
    private int idAdmin;
    private String nombre;
    private String password;

    // Constructor
    public Admin(int idAdmin, String nombre, String password) {

        this.idAdmin = idAdmin;
        this.nombre = nombre;
        this.password = password;
    }

    public Admin() {
    }

    // Getter and Setter
    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void adminLogin(String nombre, String password) {

        int opcion = 0;
        do {
            String username = JOptionPane.showInputDialog("Escriba su nombre de usuario");
            String pass = JOptionPane.showInputDialog("Escriba su contraseña");
            if (username.equals(nombre) && pass.equals(password)) {
                JOptionPane.showMessageDialog(null, "Bienvenido Administrador");
                opcion = 1;
            } else {
                JOptionPane.showMessageDialog(null, "Error de autentificacion, intente de nuevo");
            }
        } while (opcion != 1);

    }

    public void agregarProducto() {

        int itemsAgregar = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos productos desea agregar?"));
        // Creacion del array productos de itemsAgregar posiciones
        Inventario[] productos = new Inventario[itemsAgregar];
        // Ciclo for para la creacion del array de objetos
        for (int i = 0; i < itemsAgregar; i++) {
            String producto = JOptionPane.showInputDialog("Producto");
            float precio = Integer.parseInt(JOptionPane.showInputDialog("Precio"));
            productos[i] = new Inventario(i, producto, precio);
        }
        // Ciclo for para la impresion de los items agregados al inventario
        for (int i = 0; i < itemsAgregar; i++) {
            JOptionPane.showMessageDialog(null,
                    "\nNombre: " + productos[i].getProducto() + "\nPrecio: " + productos[i].getPrecio());
        }

    }

    public void eliminarProducto() {

        Inventario cardioaspirina = new Inventario(1, "cardioaspirina", 500);
        Inventario acetaminofen = new Inventario(2, "acetaminofen", 5000);
        Inventario ibuprofeno = new Inventario(3, "ibuprofeno", 7000);
        int eliminar = Integer.parseInt(JOptionPane.showInputDialog("Digite el ID del producto que desea eliminar"));
        if (eliminar == 1) {
            JOptionPane.showMessageDialog(null, "Se eliminaron las cardioaspirina");
            JOptionPane.showMessageDialog(null,
                    "\nNombre: " + acetaminofen.getProducto() + "\nPrecio: " + acetaminofen.getPrecio());
            JOptionPane.showMessageDialog(null,
                    "\nNombre: " + ibuprofeno.getProducto() + "\nPrecio: " + ibuprofeno.getPrecio());
        } else if (eliminar == 2) {
            JOptionPane.showMessageDialog(null, "Se eliminaron las bombas de salbutamol");
            JOptionPane.showMessageDialog(null,
                    "\nNombre: " + cardioaspirina.getProducto() + "\nPrecio: " + cardioaspirina.getPrecio());
            JOptionPane.showMessageDialog(null,
                    "\nNombre: " + ibuprofeno.getProducto() + "\nPrecio: " + ibuprofeno.getPrecio());
        } else if (eliminar == 3) {
            JOptionPane.showMessageDialog(null, "Se eliminaron las pastillas de paracetamol");
            JOptionPane.showMessageDialog(null,
                    "\nNombre: " + cardioaspirina.getProducto() + "\nPrecio: " + cardioaspirina.getPrecio());
            JOptionPane.showMessageDialog(null,
                    "\nNombre: " + acetaminofen.getProducto() + "\nPrecio: " + acetaminofen.getPrecio());
        } else {
            JOptionPane.showMessageDialog(null, "El ID que se digito no existe");
        }

    }
}
