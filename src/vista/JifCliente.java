/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
 */
package vista;

import controlador.ControladorCliente;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;

/**
 *
 * @author silva
 */
public class JifCliente extends javax.swing.JInternalFrame {

    ControladorCliente clienteController = new ControladorCliente();

    /**
     * Creates new form JIFCliente
     */
    public JifCliente() {
        initComponents();
        TXTIdCliente.setValue(0);
        TXTIdCliente.setVisible(false);
        limpiarFormulario();

    }

    private void limpiarFormulario() {
        TXTIdCliente.setValue(0);
        TXTNombreCliente.setText("Escriba Nombre");
        TXTDocumentoCliente.setText("Escriba Documento");
        TXTDireccionCliente.setText("Escriba Direccion");
        TXTCelularCliente.setText("Escriba Telefono");
        TXTBuscarCliente.setText("Escriba texto a buscar");
        BTNModificar.setEnabled(false);
        BTNEliminar.setEnabled(false);
        llenarTabla();
    }

    public void llenarTabla() {
        Cliente unCliente = new Cliente();
        DefaultTableModel tabla = (DefaultTableModel) TBLCliente.getModel();
        Iterator<Cliente> itCliente = unCliente.listar();
        Object[] filaCliente = new Object[TBLCliente.getColumnCount()];
        tabla.setRowCount(0);
        while (itCliente.hasNext()) {
            unCliente = itCliente.next();
            filaCliente[0] = unCliente.getIdCliente();
            filaCliente[1] = unCliente.getNombreCliente();
            filaCliente[4] = unCliente.getDocumentoCliente();
            filaCliente[3] = unCliente.getDireccionCliente();
            filaCliente[2] = unCliente.getCelularCliente();
            tabla.addRow(filaCliente);

        }

    }

    public void modificarTable() {
        Cliente unCliente = new Cliente();
    }

    private Cliente obtenerCliente() {
        Cliente elCliente = new Cliente();
        elCliente.setIdCliente((Integer) TXTIdCliente.getValue());
        elCliente.setNombreCliente(TXTNombreCliente.getText());
        elCliente.setDocumentoCliente(TXTDocumentoCliente.getText());
        elCliente.setDireccionCliente(TXTDireccionCliente.getText());
        elCliente.setCelularCliente(TXTCelularCliente.getText());
        return elCliente;

    }

    private void llenarTablaConBusqueda(String busqueda) {
        Cliente unCliente = new Cliente();
        DefaultTableModel tabla = (DefaultTableModel) TBLCliente.getModel();
        Iterator<Cliente> itCliente = unCliente.buscar(busqueda);
        System.out.println("itclientes "+itCliente.toString());
        Object[] filaCliente = new Object[TBLCliente.getColumnCount()];
        tabla.setRowCount(0);
        while (itCliente.hasNext()) {
            System.out.println("En la tabla while");
            unCliente = itCliente.next();
            filaCliente[0] = unCliente.getIdCliente();
            filaCliente[1] = unCliente.getNombreCliente();
            filaCliente[2] = unCliente.getDireccionCliente();
            filaCliente[3] = unCliente.getCelularCliente();
            filaCliente[4] = unCliente.getDocumentoCliente();
            ((DefaultTableModel) TBLCliente.getModel()).addRow(filaCliente);
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

        LBLNombre = new javax.swing.JLabel();
        LBLDocumento = new javax.swing.JLabel();
        LBLDireccion = new javax.swing.JLabel();
        TXTNombreCliente = new javax.swing.JTextField();
        TXTDocumentoCliente = new javax.swing.JTextField();
        TXTDireccionCliente = new javax.swing.JTextField();
        BTNInsertar = new javax.swing.JButton();
        BTNModificar = new javax.swing.JButton();
        BTNEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBLCliente = new javax.swing.JTable();
        LBLCelular = new javax.swing.JLabel();
        LBLBuscar = new javax.swing.JLabel();
        TXTCelularCliente = new javax.swing.JTextField();
        TXTBuscarCliente = new javax.swing.JTextField();
        BTNCerrar = new javax.swing.JButton();
        BTNBuscar = new javax.swing.JButton();
        TXTIdCliente = new javax.swing.JFormattedTextField();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setForeground(java.awt.Color.white);
        setTitle("                                                          FORMULARIO CLIENTE");
        setToolTipText("");

        LBLNombre.setText("Nombre");

        LBLDocumento.setText("Documento");

        LBLDireccion.setText("Direccion");

        TXTNombreCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXTNombreClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXTNombreClienteFocusLost(evt);
            }
        });
        TXTNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTNombreClienteActionPerformed(evt);
            }
        });

        TXTDocumentoCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXTDocumentoClienteFocusGained(evt);
            }
        });
        TXTDocumentoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTDocumentoClienteActionPerformed(evt);
            }
        });

        TXTDireccionCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXTDireccionClienteFocusGained(evt);
            }
        });
        TXTDireccionCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTDireccionClienteActionPerformed(evt);
            }
        });

        BTNInsertar.setText("Insertar");
        BTNInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNInsertarActionPerformed(evt);
            }
        });

        BTNModificar.setText("Modificar");
        BTNModificar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BTNModificarFocusGained(evt);
            }
        });
        BTNModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNModificarActionPerformed(evt);
            }
        });

        BTNEliminar.setText("Eliminar");
        BTNEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEliminarActionPerformed(evt);
            }
        });

        TBLCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "Nombre", "Documento", "Direccion", "Celular"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBLCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBLClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TBLCliente);

        LBLCelular.setText("Celular");

        LBLBuscar.setText("Buscar");

        TXTCelularCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXTCelularClienteFocusGained(evt);
            }
        });

        TXTBuscarCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TXTBuscarClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TXTBuscarClienteFocusLost(evt);
            }
        });
        TXTBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTBuscarClienteActionPerformed(evt);
            }
        });

        BTNCerrar.setText("Cerrar");
        BTNCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCerrarActionPerformed(evt);
            }
        });

        BTNBuscar.setText("Buscar");
        BTNBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBuscarActionPerformed(evt);
            }
        });

        TXTIdCliente.setText("0");
        TXTIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTIdClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LBLNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LBLDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TXTNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TXTIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TXTDocumentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LBLCelular)
                            .addComponent(LBLBuscar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXTBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTCelularCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LBLDireccion)
                        .addGap(11, 11, 11)
                        .addComponent(TXTDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 275, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTNInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBLNombre)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TXTIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TXTNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBLDocumento)
                            .addComponent(TXTDocumentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXTDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LBLDireccion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXTCelularCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LBLCelular))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXTBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LBLBuscar)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTNInsertar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTNModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTNEliminar)
                        .addGap(12, 12, 12)
                        .addComponent(BTNCerrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTNBuscar)
                        .addGap(18, 18, 18)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXTDocumentoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTDocumentoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTDocumentoClienteActionPerformed

    private void BTNModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNModificarActionPerformed
        clienteController.controlarAccion(evt, obtenerCliente());
        limpiarFormulario();
// TODO add your handling code here:
    }//GEN-LAST:event_BTNModificarActionPerformed

    private void BTNEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEliminarActionPerformed
        clienteController.controlarAccion(evt, obtenerCliente());
        limpiarFormulario();
// TODO add your handling code here:
    }//GEN-LAST:event_BTNEliminarActionPerformed

    private void TXTNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTNombreClienteActionPerformed

    private void BTNCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCerrarActionPerformed

// TODO add your handling code here:
    }//GEN-LAST:event_BTNCerrarActionPerformed

    private void BTNBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBuscarActionPerformed
        // TODO add your handling code here:
        System.out.println("1");
        llenarTablaConBusqueda(TXTBuscarCliente.getText());
        System.out.println("2");
    }//GEN-LAST:event_BTNBuscarActionPerformed

    private void TXTBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTBuscarClienteActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTBuscarClienteActionPerformed

    private void TXTIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTIdClienteActionPerformed

    private void BTNInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNInsertarActionPerformed
        clienteController.controlarAccion(evt, obtenerCliente());
        limpiarFormulario();
        
        
        if (TXTIdCliente.getText().isEmpty() || TXTNombreCliente.getText().isEmpty() || TXTDocumentoCliente.getText().isEmpty() || TXTDireccionCliente.getText().isEmpty() || TXTCelularCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe Completar todos los Campos de la Tabla");
            
        } else {
                ControladorCliente Cc = new ControladorCliente();
                if (!Cc.existeCliente());
                    }
;
// TODO add your handling code here:
    }//GEN-LAST:event_BTNInsertarActionPerformed

    private void TBLClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBLClienteMouseClicked
        if (evt.getClickCount() == 2) {
            System.out.println(evt.getPoint());
            int fila = TBLCliente.rowAtPoint(evt.getPoint());
            System.out.println("fila  " + fila);
            if (fila > -1) {
                TXTIdCliente.setValue((Integer) TBLCliente.getValueAt(fila, 0));
                TXTNombreCliente.setText((String) TBLCliente.getValueAt(fila, 1));
                TXTDocumentoCliente.setText((String) TBLCliente.getValueAt(fila, 2));
                TXTDireccionCliente.setText((String) TBLCliente.getValueAt(fila, 3));
                TXTCelularCliente.setText((String) TBLCliente.getValueAt(fila, 4));
                BTNModificar.setEnabled(true);
                BTNEliminar.setEnabled(true);

            }
        }
// TODO add your handling code here:
    }//GEN-LAST:event_TBLClienteMouseClicked

    private void TXTBuscarClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTBuscarClienteFocusGained
        if (TXTBuscarCliente.getText().equals("Escriba texto a buscar")) {
            TXTBuscarCliente.setText("");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTBuscarClienteFocusGained

    private void TXTBuscarClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTBuscarClienteFocusLost
        if (TXTBuscarCliente.getText().equals("")) {
            TXTBuscarCliente.setText("Escriba el texto a buscar");
        }
// TODO add your handling code here:
    }//GEN-LAST:event_TXTBuscarClienteFocusLost

    private void TXTNombreClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTNombreClienteFocusGained
        // TODO add your handling code here:
        TXTNombreCliente.setText("");
    }//GEN-LAST:event_TXTNombreClienteFocusGained

    private void BTNModificarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BTNModificarFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNModificarFocusGained

    private void TXTDocumentoClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTDocumentoClienteFocusGained
        TXTDocumentoCliente.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_TXTDocumentoClienteFocusGained

    private void TXTDireccionClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTDireccionClienteFocusGained
        TXTDireccionCliente.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_TXTDireccionClienteFocusGained

    private void TXTCelularClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTCelularClienteFocusGained
        TXTCelularCliente.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_TXTCelularClienteFocusGained

    private void TXTDireccionClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTDireccionClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTDireccionClienteActionPerformed

    private void TXTNombreClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TXTNombreClienteFocusLost

    }//GEN-LAST:event_TXTNombreClienteFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNBuscar;
    private javax.swing.JButton BTNCerrar;
    private javax.swing.JButton BTNEliminar;
    private javax.swing.JButton BTNInsertar;
    private javax.swing.JButton BTNModificar;
    private javax.swing.JLabel LBLBuscar;
    private javax.swing.JLabel LBLCelular;
    private javax.swing.JLabel LBLDireccion;
    private javax.swing.JLabel LBLDocumento;
    private javax.swing.JLabel LBLNombre;
    private javax.swing.JTable TBLCliente;
    private javax.swing.JTextField TXTBuscarCliente;
    private javax.swing.JTextField TXTCelularCliente;
    private javax.swing.JTextField TXTDireccionCliente;
    private javax.swing.JTextField TXTDocumentoCliente;
    private javax.swing.JFormattedTextField TXTIdCliente;
    private javax.swing.JTextField TXTNombreCliente;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    

}