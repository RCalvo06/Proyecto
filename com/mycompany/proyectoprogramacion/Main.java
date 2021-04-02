
package com.mycompany.proyectoprogramacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Hudson
 * @author Ricardo
 */
public class Main {
    public static void main(String[] args) {
        Persona usuario = new Persona();
        Admin admin = new Admin();
        HojaMedica carta = new HojaMedica();
        Compra compra = new Compra();
        Factura factura = new Factura();
        Inventario inventario = new Inventario();

        int opcion = 0;
        int opcion2 = 0;
        int opcion3 = 0;
        int opcion4 = 0;
        int opcion5 = 0;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("\n1. Registrarse" + "\n2. Login" + "\n0. Salir"));
            switch (opcion) {
            case 1: {
                usuario.registro();
                JOptionPane.showMessageDialog(null, "Usuario creado exitosamente");
                carta.cartaMedica();
                carta.verificarConsejo();
                break;
            }

            case 2: {
                // Submenu para eligir el tipo de login
                opcion2 = Integer
                        .parseInt(JOptionPane.showInputDialog("\n1. Usuario" + "\n2. Administrador" + "\n0. Salir"));
                switch (opcion2) {
                case 1: {
                    usuario.verificarLogin(usuario.getUsuario(), usuario.getPassword());
                    // Submenu para opciones de usuario
                    do {
                        opcion3 = Integer
                                .parseInt(JOptionPane.showInputDialog("\n1. Comprar" + "\n2. Facturar" + "\n0. Salir"));
                        switch (opcion3) {
                        case 1: {
                            do {
                                opcion5 = Integer.parseInt(JOptionPane.showInputDialog(
                                        "\n1. Agregar" + "\n2. Eliminar" + "\n3. Lista" + "\n0. Salir"));
                                switch (opcion5) {
                                case 1: {
                                    compra.agregarCarrito();
                                    break;
                                }
                                case 2: {
                                    compra.removerCarrito();
                                    break;
                                }
                                case 3: {
                                    compra.listaCarrito();
                                    break;
                                }
                                default: {
                                    JOptionPane.showMessageDialog(null, "Gracias por usar el carrito");
                                    opcion5 = 0;
                                    break;
                                }
                                }
                            } while (opcion5 != 0);
                            break;
                        }
                        case 2: {
                            factura.facturarCompra();
                            break;
                        }
                        default: {
                            opcion3 = 0;
                            break;
                        }
                        }
                    } while (opcion3 != 0);
                    break;
                } // FIN DEL MENU DE USUARIO

                case 2: {
                    admin.adminLogin(admin.getNombre(), admin.getPassword());
                    // Submenu para opciones de usuario
                    do {
                        opcion4 = Integer.parseInt(JOptionPane.showInputDialog(
                                "\n1. Agregar Producto" + "\n2. Remover producto" + "\n3. Inventario" + "\n0. Salir"));
                        switch (opcion4) {
                        case 1: {
                            admin.agregarProducto();
                            break;
                        }
                        case 2: {
                            admin.eliminarProducto();
                            break;
                        }
                        case 3: {
                            inventario.mostrarInventario();
                            break;
                        }
                        default: {
                            opcion4 = 0;
                            break;
                        }
                        }
                    } while (opcion4 != 0);
                    break;
                } // Fin del menu de Administrador
                }
            } // Fin del segundo menu Usuario-Admin
            default: {
                JOptionPane.showMessageDialog(null, "Gracias por visitarnos");
                opcion = 0;
                break;
            }
            } // Fin del primer menu Registro-Login
        } while (opcion != 0);
        // Fin menu() Method

    }
}
