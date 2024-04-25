/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


import java.awt.event.ActionEvent;

import modelo.Producto;

/**
 *
 * @author silva
 */

public class ControladorProducto {
      public void controlarAccion (ActionEvent evento, Producto unProducto){
        String accion = evento.getActionCommand();
        switch (accion){
            case "Insertar":
                unProducto.insertar();
            break;
            case "Modificar":
                unProducto.modificar();
            break;
            case "Eliminar":
                unProducto.eliminar();
                break;
                
            }
             
}
}


