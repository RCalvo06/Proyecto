
package com.mycompany.proyectoprogramacion;

import javax.swing.JOptionPane;

/**
 *
 * @author hudson
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

    }

    public void eliminarProducto() {
    }
}
