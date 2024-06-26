/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vista;

import java.time.LocalDate;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import modelo.Categoria;
import modelo.Producto;

/**
 *
 * @author silva
 */
public class jifDetalles extends javax.swing.JInternalFrame {
     
    
  

    /**
     * Creates new form jifDetalles
     */
    public jifDetalles() {
        initComponents();
        llenarTabla();
        
        
    
    
     }
    
    

public class Date {
    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();
        
        System.out.println("Fecha actual: " + fechaActual);
    }

        

}
    
     public void llenarTabla() {
        Producto unProducto = new Producto();
        DefaultTableModel tabla = (DefaultTableModel) TBLSeleccionProducto.getModel();
        Iterator<Producto> itProducto = unProducto.listar();
        Object[] filaProducto = new Object[TBLSeleccionProducto.getColumnCount()];
        tabla.setRowCount(0);
        while (itProducto.hasNext()) {
            unProducto = itProducto.next();
            filaProducto[0] = unProducto.getIdProducto();
            filaProducto[1] = unProducto.getDescripcionProducto();
            filaProducto[2] = unProducto.getNombreProducto();
            filaProducto[3] = unProducto.getCantidadProducto(); 
            filaProducto[4] = unProducto.getPrecioVenta();                                               
            tabla.addRow(filaProducto);

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
        TBLSeleccionProducto = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TBLCarritoCompras = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("VENTA PRODUCTOS");
        setToolTipText("");
        setFocusCycleRoot(false);
        setFocusable(false);
        setVisible(true);

        TBLSeleccionProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Descripcion", "Cantidad", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBLSeleccionProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBLSeleccionProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TBLSeleccionProducto);
        if (TBLSeleccionProducto.getColumnModel().getColumnCount() > 0) {
            TBLSeleccionProducto.getColumnModel().getColumn(0).setResizable(false);
            TBLSeleccionProducto.getColumnModel().getColumn(1).setResizable(false);
            TBLSeleccionProducto.getColumnModel().getColumn(2).setResizable(false);
            TBLSeleccionProducto.getColumnModel().getColumn(3).setResizable(false);
            TBLSeleccionProducto.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("PRODUCTOS DISPONIBLES");

        TBLCarritoCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Descripcion", "Cantidad", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TBLCarritoCompras);
        if (TBLCarritoCompras.getColumnModel().getColumnCount() > 0) {
            TBLCarritoCompras.getColumnModel().getColumn(0).setResizable(false);
            TBLCarritoCompras.getColumnModel().getColumn(1).setResizable(false);
            TBLCarritoCompras.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 51));
        jLabel2.setText("CARRITO COMPRAS");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("SUBTOTAL");

        jLabel4.setText("Id Cliente");

        jTextField3.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(204, 204, 204));
        jTextField3.setText("    Nombre Cliente");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("TOTAL");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel6.setText("4/23/2024");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel2)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel6)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(28, 28, 28)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(123, 123, 123))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void TBLSeleccionProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBLSeleccionProductoMouseClicked
        if (evt.getClickCount() == 2) {
            System.out.println(evt.getPoint());
            int fila = TBLSeleccionProducto.rowAtPoint(evt.getPoint());
            System.out.println("fila  " + fila);

            if (fila > -1) {
                DefaultTableModel tabla = (DefaultTableModel) TBLCarritoCompras.getModel();
                Object[] filaProducto = new Object[TBLCarritoCompras.getColumnCount()] ;
                filaProducto[0] = TBLSeleccionProducto.getValueAt(fila, 0);
                filaProducto[1] = TBLSeleccionProducto.getValueAt(fila, 1);
                filaProducto[2] = TBLSeleccionProducto.getValueAt(fila, 2);
                filaProducto[3] = TBLSeleccionProducto.getValueAt(fila, 3);
                filaProducto[4] = TBLSeleccionProducto.getValueAt(fila, 4);
                tabla.addRow(filaProducto);
                
                

            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_TBLSeleccionProductoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TBLCarritoCompras;
    private javax.swing.JTable TBLSeleccionProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
