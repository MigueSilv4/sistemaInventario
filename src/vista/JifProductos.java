/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;
import controlador.ControladorProducto;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Categoria;
import modelo.ConexionBD;

/**
 *
 * @author silva
 */
public class JifProductos extends javax.swing.JInternalFrame {
ControladorProducto ProductoController = new ControladorProducto ();


    /**
     * Creates new form JifProductos
     */
    public JifProductos() {
        initComponents();
        initComponents();
        limpiarFormulario();
        
        //llenar al combo box
        cargarCategoria();
    }
    private void limpiarFormulario() {
        TXTIdProducto.setValue(0);
        TXTCantidadProducto.setText("");
        TXTStockProducto.setText("");
        TXTPrecioVenta.setText("");
        TXTPrecioCompra.setText("");
        TXTDescripcionProducto.setText("");
        TXTNombreProducto.setText("");
        BTNModificarProducto.setEnabled(false);
        BTNEliminarProducto.setEnabled(false);
        llenarTabla();
    }
    
    public void llenarTabla() {
        Producto unProducto = new Producto();
        DefaultTableModel tabla = (DefaultTableModel) TBLProducto.getModel();
        Iterator<Producto> itProducto = unProducto.listar();
        Object[] filaProducto = new Object[TBLProducto.getColumnCount()];
        tabla.setRowCount(0);
        while (itProducto.hasNext()) {
            unProducto = itProducto.next();
            filaProducto[0] = unProducto.getIdProducto();
            filaProducto[1] = unProducto.getDescripcionProducto();
            filaProducto[2] = unProducto.getNombreProducto();
            filaProducto[3] = unProducto.getCantidadProducto(); 
            filaProducto[4] = unProducto.getPrecioCompra();
            filaProducto[5] = unProducto.getPrecioVenta();                                      
            filaProducto[6] = unProducto.getStockProducto();
            filaProducto[7] = unProducto.getId_categoria();
            tabla.addRow(filaProducto);

        }
    }
    
public void modificarTable() {
        Producto unProducto = new Producto();
    }

    private Producto obtenerProducto() {
        Producto elProducto = new Producto();

        elProducto.setIdProducto((Integer) TXTIdProducto.getValue());
        System.out.println("id producto 2...... "+elProducto.getIdProducto());
        elProducto.setNombreProducto(TXTNombreProducto.getText());     
        elProducto.setCantidadProducto (Integer.parseInt(TXTCantidadProducto.getText()));
        elProducto.setDescripcionProducto (TXTDescripcionProducto.getText());      
        elProducto.setId_categoria(((Categoria)jComboBoxCategoria.getSelectedItem()).getId_categoria());
        elProducto.setPrecioVenta (Integer.parseInt( TXTPrecioVenta.getText()));
        elProducto.setPrecioCompra (Integer.parseInt(TXTPrecioCompra.getText()));
        elProducto.setStockProducto (Integer.parseInt(TXTStockProducto.getText()));
        return elProducto;

    }
 private void llenarTablaConBusqueda(String busqueda) {
        Producto unProducto = new Producto();
        DefaultTableModel tabla = (DefaultTableModel) TBLProducto.getModel();
        Iterator<Producto> itProducto = unProducto.buscar(busqueda);
        System.out.println("itProductos "+itProducto.toString());
        Object[] filaProducto = new Object[TBLProducto.getColumnCount()];
        tabla.setRowCount(0);
        while (itProducto.hasNext()) {
            unProducto = itProducto.next();
            filaProducto[0] = unProducto.getIdProducto();
            filaProducto[1] = unProducto.getNombreProducto();
            filaProducto[2] = unProducto.getCantidadProducto();
            filaProducto[3] = unProducto.getDescripcionProducto();
            filaProducto[4] = unProducto.getPrecioCompra();
            filaProducto[5] = unProducto.getPrecioVenta();
            filaProducto[6] = unProducto.getStockProducto();
            ((DefaultTableModel) TBLProducto.getModel()).addRow(filaProducto);
        }
    }





    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TBLProducto = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        LBLCelular = new javax.swing.JLabel();
        LBLDireccion = new javax.swing.JLabel();
        TXTDescripcionProducto = new javax.swing.JTextField();
        TXTNombreProducto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        LBLDocumento = new javax.swing.JLabel();
        TXTPrecioCompra = new javax.swing.JTextField();
        LBLNombre = new javax.swing.JLabel();
        TXTCantidadProducto = new javax.swing.JFormattedTextField();
        TXTPrecioVenta = new javax.swing.JTextField();
        LBLBuscar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TXTStockProducto = new javax.swing.JTextField();
        TXTIdProducto = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        TXTBuscarProducto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        BTNEliminarProducto = new javax.swing.JButton();
        BTNModificarProducto = new javax.swing.JButton();
        BTNCerrar = new javax.swing.JButton();
        BTNInsertarProducto = new javax.swing.JButton();
        BTNBuscarProducto = new javax.swing.JButton();
        jComboBoxCategoria = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("INVENTARIO PRODUCTOS");

        TBLProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Descripcion", "Cantidad", "Precio Compra", "Precio Venta", "Stock", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBLProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBLProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TBLProducto);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        LBLCelular.setText("Precio Compra");

        LBLDireccion.setText("Descripcion del Producto");

        jLabel1.setText("Cant");

        LBLDocumento.setText("Nombre del Producto");

        LBLNombre.setText("ID Producto");

        TXTCantidadProducto.setText("0");
        TXTCantidadProducto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXTCantidadProductoFocusGained(evt);
            }
        });

        LBLBuscar.setText("Precio Venta");

        jLabel2.setText("Stock");

        TXTIdProducto.setText("0");

        jLabel3.setText("Buscar Producto");

        TXTBuscarProducto.setText("Escriba Producto a buscar");
        TXTBuscarProducto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXTBuscarProductoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXTBuscarProductoFocusLost(evt);
            }
        });
        TXTBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTBuscarProductoActionPerformed(evt);
            }
        });

        jLabel4.setText("Categoria");

        BTNEliminarProducto.setText("Eliminar");
        BTNEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEliminarProductoActionPerformed(evt);
            }
        });

        BTNModificarProducto.setText("Modificar");
        BTNModificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNModificarProductoActionPerformed(evt);
            }
        });

        BTNCerrar.setText("Cerrar");

        BTNInsertarProducto.setText("Insertar");
        BTNInsertarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNInsertarProductoActionPerformed(evt);
            }
        });

        BTNBuscarProducto.setText("Buscar");
        BTNBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBuscarProductoActionPerformed(evt);
            }
        });

        jComboBoxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(TXTBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(67, 67, 67)
                                .addComponent(TXTStockProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LBLBuscar)
                                .addGap(44, 44, 44)
                                .addComponent(TXTPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LBLCelular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TXTPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(LBLDocumento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TXTNombreProducto))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(LBLDireccion)
                                        .addGap(27, 27, 27)
                                        .addComponent(TXTDescripcionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(TXTCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LBLNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TXTIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTNInsertarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BTNCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BTNModificarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BTNEliminarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BTNBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBLNombre)
                            .addComponent(TXTIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TXTCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LBLDocumento)
                                    .addComponent(TXTNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LBLDireccion)
                                    .addComponent(TXTDescripcionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LBLCelular)
                                    .addComponent(TXTPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(BTNInsertarProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTNModificarProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTNEliminarProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTNCerrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTNBuscarProducto)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLBuscar)
                    .addComponent(TXTPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTStockProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TXTBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TBLProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBLProductoMouseClicked
        if (evt.getClickCount() == 2) {
            System.out.println(evt.getPoint());
            int fila = TBLProducto.rowAtPoint(evt.getPoint());
            System.out.println("fila  " + fila);

            if (fila > -1) {
                TXTIdProducto.setValue((Integer) TBLProducto.getValueAt(fila, 0));
                System.out.println("id producto "+(Integer) TBLProducto.getValueAt(fila, 0));
                TXTNombreProducto.setText((String) TBLProducto.getValueAt(fila, 1));  
                TXTDescripcionProducto.setText((String) TBLProducto.getValueAt(fila, 2));                         
                TXTCantidadProducto.setText(""+TBLProducto.getValueAt(fila, 3));  
                
                TXTPrecioCompra.setText(""+TBLProducto.getValueAt(fila, 4));  
                TXTPrecioVenta.setText(""+TBLProducto.getValueAt(fila, 5));
                TXTStockProducto.setText(""+ TBLProducto.getValueAt(fila, 6));
               Categoria mic = new Categoria();
               mic = mic.buscarporid((int)TBLProducto.getValueAt(fila, 7));
               jComboBoxCategoria.setSelectedItem(mic);             
                
                BTNModificarProducto.setEnabled(true);
                BTNEliminarProducto.setEnabled(true);
                
                

            }
        }

        
        // TODO add your handling code here:
    }//GEN-LAST:event_TBLProductoMouseClicked

    private void TXTBuscarProductoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTBuscarProductoFocusGained
        if (TXTBuscarProducto.getText().equals("Escriba Producto a buscar")) {
            TXTBuscarProducto.setText("");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTBuscarProductoFocusGained

    private void TXTBuscarProductoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTBuscarProductoFocusLost
        if (TXTBuscarProducto.getText().equals("")) {
            TXTBuscarProducto.setText("Escriba Producto a buscar");
        }
            // TODO add your handling code here:
    }//GEN-LAST:event_TXTBuscarProductoFocusLost

    private void BTNBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBuscarProductoActionPerformed
        System.out.println("1");
        llenarTablaConBusqueda(TXTBuscarProducto.getText());
        System.out.println("2");
        // TODO add your handling code here:

    }//GEN-LAST:event_BTNBuscarProductoActionPerformed

    private void BTNInsertarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNInsertarProductoActionPerformed
        ProductoController.controlarAccion(evt, obtenerProducto());
        limpiarFormulario();
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNInsertarProductoActionPerformed

    private void BTNModificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNModificarProductoActionPerformed
       ProductoController.controlarAccion(evt, obtenerProducto());
        limpiarFormulario();
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNModificarProductoActionPerformed

    private void TXTCantidadProductoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTCantidadProductoFocusGained
        TXTCantidadProducto.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTCantidadProductoFocusGained

    private void TXTBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTBuscarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTBuscarProductoActionPerformed

    private void BTNEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEliminarProductoActionPerformed
        ProductoController.controlarAccion(evt, obtenerProducto());
        limpiarFormulario();
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNEliminarProductoActionPerformed

    private void jComboBoxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCategoriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNBuscarProducto;
    private javax.swing.JButton BTNCerrar;
    private javax.swing.JButton BTNEliminarProducto;
    private javax.swing.JButton BTNInsertarProducto;
    private javax.swing.JButton BTNModificarProducto;
    private javax.swing.JLabel LBLBuscar;
    private javax.swing.JLabel LBLCelular;
    private javax.swing.JLabel LBLDireccion;
    private javax.swing.JLabel LBLDocumento;
    private javax.swing.JLabel LBLNombre;
    private javax.swing.JTable TBLProducto;
    private javax.swing.JTextField TXTBuscarProducto;
    private javax.swing.JFormattedTextField TXTCantidadProducto;
    private javax.swing.JTextField TXTDescripcionProducto;
    private javax.swing.JFormattedTextField TXTIdProducto;
    private javax.swing.JTextField TXTNombreProducto;
    private javax.swing.JTextField TXTPrecioCompra;
    private javax.swing.JTextField TXTPrecioVenta;
    private javax.swing.JTextField TXTStockProducto;
    private javax.swing.JComboBox<Categoria> jComboBoxCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables


    private void cargarCategoria(){
        try {
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("SELECT * FROM categoria");
            ResultSet rs = sql.executeQuery();
            Categoria mic = new Categoria();
            mic.setNombreCategoria("");
            mic.setDescripcionCategoria("");
            mic.setId_categoria(0);
            
            jComboBoxCategoria.removeAllItems();
            jComboBoxCategoria.addItem(mic);
            while(rs.next()){
                mic = new Categoria();
                mic.setId_categoria(rs.getInt("id_categoria"));
                mic.setNombreCategoria(rs.getString("nombreCategoria"));
                mic.setDescripcionCategoria(rs.getString("descripcionCategoria"));
                jComboBoxCategoria.addItem(mic);
            }
        } catch (SQLException e) {
            System.out.println("Error al cargar combBox "+e.toString());
        }
    }
}