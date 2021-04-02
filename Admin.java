
package com.mycompany.proyectoprogramacion;

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

    }

    public void agregarProducto() {

    }

    public void eliminarProducto() {
    }
}
