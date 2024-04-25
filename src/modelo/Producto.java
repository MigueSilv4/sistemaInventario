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
import java.util.Objects;


/**
 *
 * @author silva
 */
public class Producto {

    private int idProducto;
    private int cantidadProducto;
    private int stockProducto;
    private int precioVenta;
    private int precioCompra;
    private int id_categoria;
    private String descripcionProducto;
    private String nombreProducto;

    /**
     * @return the idProducto
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * @param idProducto the idProducto to set
     */
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * @return the cantidadProducto
     */
    public int getCantidadProducto() {
        return cantidadProducto;
    }

    /**
     * @param cantidadProducto the cantidadProducto to set
     */
    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    /**
     * @return the stockProducto
     */
    public int getStockProducto() {
        return stockProducto;
    }

    /**
     * @param stockProducto the stockProducto to set
     */
    public void setStockProducto(int stockProducto) {
        this.stockProducto = stockProducto;
    }

    /**
     * @return the precioVenta
     */
    public int getPrecioVenta() {
        return precioVenta;
    }

    /**
     * @param precioVenta the precioVenta to set
     */
    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    /**
     * @return the precioCompra
     */
    public int getPrecioCompra() {
        return precioCompra;
    }

    /**
     * @param precioCompra the precioCompra to set
     */
    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    /**
     * @return the descripcionProducto
     */
    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    /**
     * @param descripcionProducto the descripcionProducto to set
     */
    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    /**
     * @return the nombreProducto
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * @param nombreProducto the nombreProducto to set
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public boolean mStock(int numero) {
        if (numero <= getCantidadProducto()) {

        } else {
            System.out.println("NO HAY SUFICIEMTES UNIDADES");

            return false;
        }

        return true;

    }
   
     @Override
    public String toString() {
        return descripcionProducto;
    } 

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.idProducto;
        hash = 89 * hash + this.cantidadProducto;
        hash = 89 * hash + this.stockProducto;
        hash = 89 * hash + this.precioVenta;
        hash = 89 * hash + this.precioCompra;
        hash = 89 * hash + this.id_categoria;
        hash = 89 * hash + Objects.hashCode(this.descripcionProducto);
        hash = 89 * hash + Objects.hashCode(this.nombreProducto);
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
        final Producto other = (Producto) obj;
        if (this.idProducto != other.idProducto) {
            return false;
        }
        if (this.cantidadProducto != other.cantidadProducto) {
            return false;
        }
        if (this.stockProducto != other.stockProducto) {
            return false;
        }
        if (this.precioVenta != other.precioVenta) {
            return false;
        }
        if (this.precioCompra != other.precioCompra) {
            return false;
        }
        if (this.id_categoria != other.id_categoria) {
            return false;
        }
        if (!Objects.equals(this.descripcionProducto, other.descripcionProducto)) {
            return false;
        }
        return Objects.equals(this.nombreProducto, other.nombreProducto);
    }

    
    
    public Iterator<Producto> listar() {
        ArrayList<Producto> losProductos = new ArrayList();
        try {
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("SELECT * FROM " + this.getClass().getSimpleName());
            ResultSet rs = sql.executeQuery();
            Producto unProducto;
            while (rs.next()) {
                unProducto = new Producto();
                unProducto.setIdProducto(rs.getInt("id_Producto"));
                unProducto.setCantidadProducto(rs.getInt("cantidadProducto"));
                unProducto.setStockProducto(rs.getInt("stock"));
                unProducto.setPrecioVenta(rs.getInt("precioVenta"));
                unProducto.setPrecioCompra(rs.getInt("precioCompra"));
                unProducto.setDescripcionProducto(rs.getString("descripcionProducto"));
                unProducto.setNombreProducto(rs.getString("nombreProducto"));
                unProducto.setId_categoria(rs.getInt("id_categoria"));
                losProductos.add(unProducto);
            }

        } catch (SQLException ex) {
            System.err.println("Error al listar Producto: " + ex.getMessage());
        }
        if (losProductos.isEmpty()) {
            Producto miProducto = new Producto();
            miProducto.setNombreProducto("0");
            losProductos.add(miProducto);
        }
        return losProductos.iterator();
    }

    public void insertar() {
        try {

            PreparedStatement sql = ConexionBD.conexion.prepareStatement("INSERT INTO "
                    + this.getClass().getSimpleName() + " VALUES(NULL,?,?,?,?,?,?,?)");
            //sql.setInt(1, this.getIdProducto());
            sql.setInt(1, this.getStockProducto());
            sql.setInt(2, this.getCantidadProducto());
            sql.setInt(3, this.getPrecioVenta());
            sql.setInt(4, this.getPrecioCompra());
            sql.setString(5, this.getDescripcionProducto());
            sql.setString(6, this.getNombreProducto());
            sql.setInt(7, this.getId_categoria());
            System.out.println("sql " + sql);
            sql.executeUpdate();
            System.out.println(this.getClass().getSimpleName() + " Insertado Correctamente");
        } catch (SQLException ex) {
            System.err.println("Error al insertar " + this.getClass().getSimpleName() + ":" + ex.getMessage());
        }

    }

    public void modificar() {
        try {
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("UPDATE " + this.getClass().getSimpleName()
                    + " SET cantidadProducto = ?, stock = ?, precioVenta = ?, precioCompra = ?, descripcionProducto = ?, nombreProducto = ?, id_categoria = ? WHERE id_producto = ? ");
            sql.setInt(1, this.getCantidadProducto());
            sql.setInt(2, this.getStockProducto());
            sql.setInt(3, this.getPrecioVenta());
            sql.setInt(4, this.getPrecioCompra());
            sql.setString(5, this.getNombreProducto());
            sql.setString(6, this.getDescripcionProducto());
            sql.setInt(7, this.getId_categoria());
            sql.setInt(8, this.getIdProducto());
            System.out.println(sql);
            sql.executeUpdate();
            System.out.println(this.getClass().getSimpleName() + " Modificado Correctamente");
        } catch (SQLException ex) {
            System.err.println("Error al Modificar " + this.getClass().getSimpleName() + ":" + ex.getMessage());
        }
    }

    public void eliminar() {
        try {
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("DELETE FROM "
                    + this.getClass().getSimpleName() + "  WHERE id_Producto = ?");
            sql.setInt(1, this.getIdProducto());
            sql.executeUpdate();
            System.out.println(this.getClass().getSimpleName() + " Eliminado Correctamente");
        } catch (SQLException ex) {
            System.err.println("Error al Eliminar " + this.getClass().getSimpleName() + ":" + ex.getMessage());
        }

    }

    public Iterator<Producto> buscar(String busqueda) {
        ArrayList<Producto> losProductos = new ArrayList<>();
        try {
            System.out.println("en el buscar");
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("SELECT * FROM Producto WHERE nombreProducto LIKE ? OR descripcionProducto LIKE ? OR id_Producto LIKE ? OR id_categoria LIKE ? OR precioVenta LIKE ? OR stock LIKE ?");
            sql.setString(1, "%" + busqueda + "%");
            sql.setString(2, "%" + busqueda + "%");
            sql.setString(3, "%" + busqueda + "%");
            sql.setString(4, "%" + busqueda + "%");
            sql.setString(5, "%" + busqueda + "%");
            sql.setString(6, "%" + busqueda + "%");
            

            System.out.println("sql     " + sql);
            ResultSet rs = sql.executeQuery();
            Producto unProducto;
            System.out.println("antes del while");
            System.out.println("resulset " + rs.getRow());
            while (rs.next()) {
                unProducto = new Producto();
                unProducto.setIdProducto(rs.getInt("id_Producto"));
                unProducto.setCantidadProducto(rs.getInt("cantidadProducto"));
                unProducto.setStockProducto(rs.getInt("stock"));
                unProducto.setPrecioVenta(rs.getInt("precioVenta"));
                unProducto.setDescripcionProducto(rs.getString("descripcionProducto"));
                unProducto.setNombreProducto(rs.getString("NombreProducto"));
                unProducto.setId_categoria(rs.getInt("id_categoria"));
                System.out.println("r" + unProducto.toString());
                losProductos.add(unProducto);
                System.out.println("los " + losProductos.size());
            }
        } catch (SQLException ex) {
            System.err.println("Error al buscar Producto: " + this.getClass().getSimpleName() + ":" + ex.getMessage());

        }
        System.out.println("antes del return");
        return losProductos.iterator();

    }

    public boolean actualizarStock() {
        boolean respuesta = false;
        try {
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("UPDATE Producto  SET stock = ? WHERE id_Producto = ?");
            sql.setInt(1, this.getStockProducto());
            sql.setInt(2, this.getIdProducto());
            System.out.println("sql "+sql);
            if (sql.executeUpdate() > 0) {
                System.out.println("respuesta true");
                respuesta = true;
            }
            sql.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar sctock producto " + e.toString());
        }
        return respuesta;
    }
    
    
   
        

}
