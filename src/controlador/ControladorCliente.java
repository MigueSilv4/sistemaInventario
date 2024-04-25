/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Cliente;
import modelo.ConexionBD;

/**
 *
 * @author silva
 */
public class ControladorCliente {
    public void controlarAccion (ActionEvent evento, Cliente unCliente){
        String accion = evento.getActionCommand();
        switch (accion){
            case "Insertar":
                unCliente.insertar();
            break;
            case "Modificar":
                unCliente.modificar();
            break;
            case "Eliminar":
                unCliente.eliminar();
                break;
                
            }
    } public boolean existeCliente(){
            boolean respuesta = false;
    
        
        try {
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("SELECT * FROM " + this.getClass().getSimpleName());
            ResultSet rs = sql.executeQuery();
            
            while (rs.next()){
                respuesta = true;
            }
              
        } catch (SQLException e) {
            System.out.println("Error al consultar Cliente" + e);
        }
        return respuesta;




                    
        }
  }

    

