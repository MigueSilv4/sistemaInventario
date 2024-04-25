/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

/**
 *
 * @author silva
 */
public class Categoria {

    private int id_categoria;
    private String nombreCategoria;
    private String descripcionCategoria;

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    /**
     * @return the nombreCategoria
     */
    public String getNombreCategoria() {
        return nombreCategoria;
    }

    /**
     * @param nombreCategoria the nombreCategoria to set
     */
    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    /**
     * @return the descripcionCategoria
     */
    public String getDescripcionCategoria() {
        return descripcionCategoria;
    }

    /**
     * @param descripcionCategoria the descripcionCategoria to set
     */
    public void setDescripcionCategoria(String descripcionCategoria) {
        this.descripcionCategoria = descripcionCategoria;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.id_categoria;
        hash = 17 * hash + Objects.hashCode(this.nombreCategoria);
        hash = 17 * hash + Objects.hashCode(this.descripcionCategoria);
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
        final Categoria other = (Categoria) obj;
        if (this.id_categoria != other.id_categoria) {
            return false;
        }
        if (!Objects.equals(this.nombreCategoria, other.nombreCategoria)) {
            return false;
        }
        return Objects.equals(this.descripcionCategoria, other.descripcionCategoria);
    }


    
    @Override
    public String toString() {
        return nombreCategoria;
    }

    public Categoria buscarporid(int id) {

        Categoria unaCategoria = new Categoria();

        try {

            PreparedStatement sql = ConexionBD.conexion.prepareStatement("SELECT  * FROM categoria WHERE id_categoria LIKE ? ");

            sql.setString(1, "%" + id + "%");
            System.out.println("bu " + sql);
            ResultSet rs = sql.executeQuery();
            while (rs.next()) {
                unaCategoria = new Categoria();
                unaCategoria.setId_categoria(rs.getInt("id_categoria"));
                unaCategoria.setNombreCategoria(rs.getString("nombreCategoria"));
                unaCategoria.setDescripcionCategoria(rs.getString("descripcionCategoria"));

            }

        } catch (SQLException ex) {
            System.err.println("Error al buscar Categoria: " + this.getClass().getSimpleName() + ":" + ex.getMessage());

        }

        System.out.println("antes del return");
        return unaCategoria;
    }

}
