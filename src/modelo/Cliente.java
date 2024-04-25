/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author silva
 */
public class Cliente {

    private int idCliente;
    private String nombreCliente;
    private String documentoCliente;
    private String direccionCliente;
    private String celularCliente;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(String documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getCelularCliente() {
        return celularCliente;
    }

    public void setCelularCliente(String celularCliente) {
        this.celularCliente = celularCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombreCliente=" + nombreCliente + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        return this.idCliente == other.idCliente;
    }

    public Iterator<Cliente> listar() {
        ArrayList<Cliente> losClientes = new ArrayList<>();
        try {
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("SELECT * FROM " + this.getClass().getSimpleName());
            ResultSet rs = sql.executeQuery();
            Cliente unCliente;
            while (rs.next()) {
                unCliente = new Cliente();
                unCliente.setIdCliente(rs.getInt("id_Cliente"));
                unCliente.setNombreCliente(rs.getString("nombreCliente"));
                unCliente.setDocumentoCliente(rs.getString("documentoCliente"));
                unCliente.setDireccionCliente(rs.getString("direccionCliente"));
                unCliente.setCelularCliente(rs.getString("celularCliente"));
                losClientes.add(unCliente);
            }
        } catch (SQLException ex) {
            System.err.println("Error al listar estudiante: " + ex.getMessage());
        }
        if (losClientes.isEmpty()) {
            Cliente miCliente = new Cliente();
            miCliente.setNombreCliente("No hay clientes");
            losClientes.add(miCliente);
        }
        return losClientes.iterator();
    }

    public void insertar() {
        try {
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("INSERT INTO "
                    + this.getClass().getSimpleName() + " VALUES(NULL,?,?,?,?)");
            sql.setString(1, this.getNombreCliente());
            sql.setString(2, this.getDocumentoCliente());
            sql.setString(3, this.getDireccionCliente());
            sql.setString(4, this.getCelularCliente());
            sql.executeUpdate();
            System.out.println(this.getClass().getSimpleName() + " Insertado Correctamente");
        } catch (SQLException ex) {
            System.err.println("Error al insertar " + this.getClass().getSimpleName() + ":" + ex.getMessage());
        }

    }

    public void modificar() {
        try {
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("UPDATE " + this.getClass().getSimpleName()
                    + " SET nombreCliente = ?, documentoCliente = ?, direccionCliente = ?, celularCliente = ? WHERE id_Cliente = ? ");
            System.out.println(sql);
            sql.setString(1, this.getNombreCliente());
            sql.setString(2, this.getDocumentoCliente());
            sql.setString(3, this.getDireccionCliente());
            sql.setString(4, this.getCelularCliente());
            sql.setInt(5, this.getIdCliente());
            sql.executeUpdate();
            System.out.println(this.getClass().getSimpleName() + " Modificado Correctamente");
        } catch (SQLException ex) {
            System.err.println("Error al Modificar " + this.getClass().getSimpleName() + ":" + ex.getMessage());
        }

    }

    public void eliminar() {
        try {
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("DELETE FROM "
                    + this.getClass().getSimpleName() + "  WHERE id_Cliente = ?");
            sql.setInt(1, this.getIdCliente());
            sql.executeUpdate();
            System.out.println(this.getClass().getSimpleName() + " Eliminado Correctamente");
        } catch (SQLException ex) {
            System.err.println("Error al Eliminar " + this.getClass().getSimpleName() + ":" + ex.getMessage());
        }

    }

    public Iterator<Cliente> buscar(String busqueda) {
        ArrayList<Cliente> losClientes = new ArrayList<>();
        try {
            System.out.println("el el buscar");
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("SELECT * FROM Cliente WHERE nombreCliente LIKE ? OR celularCliente LIKE ? OR documentoCliente LIKE ? OR direccionCliente LIKE ? ");
            sql.setString(1, "%" + busqueda + "%");
            sql.setString(2, "%" + busqueda + "%");
            sql.setString(3, "%" + busqueda + "%");
            sql.setString(4, "%" + busqueda + "%");
            System.out.println("sql     " + sql);
            ResultSet rs = sql.executeQuery();
            Cliente unCliente;
            System.out.println("antes del while");
            System.out.println("resulset " + rs.getRow());
            while (rs.next()) {
                unCliente = new Cliente();
                unCliente.setIdCliente(rs.getInt("id_Cliente"));
                unCliente.setNombreCliente(rs.getString("nombreCliente"));
                unCliente.setDocumentoCliente(rs.getString("documentoCliente"));
                unCliente.setDireccionCliente(rs.getString("direccionCliente"));
                unCliente.setCelularCliente(rs.getString("celularCliente"));
                System.out.println("cliente  en el for" + unCliente.toString());
                losClientes.add(unCliente);
                System.out.println("los " + losClientes.size());
            }
        } catch (SQLException ex) {
            System.err.println("Error al buscar Cliente: " + this.getClass().getSimpleName() + ":" + ex.getMessage());

        }
        System.out.println("antes del return");
        return losClientes.iterator();
    }

    public Cliente buscarPorId(int elId) {
        Cliente unCliente = new Cliente();
        unCliente.setNombreCliente("Cliente no existe");
        try {
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("SELECT * FROM "
                    + this.getClass().getSimpleName() + " WHERE Id_Cliente = ?");
            sql.setInt(1, elId);
            ResultSet rs = sql.executeQuery();
            while (rs.next()) {
                unCliente.setIdCliente(rs.getInt("id_Cliente"));
                unCliente.setNombreCliente(rs.getString("nombreCliente"));
                unCliente.setDocumentoCliente(rs.getString("documentoCliente"));
                unCliente.setDireccionCliente(rs.getString("direccionCliente"));
                unCliente.setCelularCliente(rs.getString("celularCliente"));

            }
        } catch (SQLException ex) {
            System.err.println("Error al buscar por Id" + ex.getMessage());
        }
        return unCliente;

    }

}
