/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package vista;
import modelo.ConexionBD;


/**
 *
 * @author silva
 */
public class frmPrincipal extends javax.swing.JFrame {
    jifDetalles vDetalles;
    JifCliente vCliente;
    JifActualizarStock vActualizarStock;
    
    static JifProductos vProductos;
    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
        ConexionBD.getInstance();
        vProductos = new JifProductos();
        vCliente = new JifCliente();
        vDetalles = new jifDetalles();
        vActualizarStock = new JifActualizarStock();
        vDetalles.setVisible(false);

        escritorio.add(vProductos );
        escritorio.add(vDetalles);
        escritorio.add(vCliente);
        
        escritorio.add(vActualizarStock);
        
        
        
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        itemSalir = new javax.swing.JMenuItem();
        menuGestionProductos = new javax.swing.JMenu();
        itemVerProductos = new javax.swing.JMenuItem();
        menuGestionClientes = new javax.swing.JMenu();
        itemGestionClientes = new javax.swing.JMenuItem();
        menuUsuario = new javax.swing.JMenu();
        itemControlStock = new javax.swing.JMenuItem();
        menuGestionVentas = new javax.swing.JMenu();
        itemVerVentas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INVENTARIO TIENDA");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/image/Captura_de_pantalla_2024-04-03_092557-transformed-removebg-preview.png"))); // NOI18N
        escritorio.add(jLabel1);
        jLabel1.setBounds(-90, -270, 410, 790);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/image/R.png"))); // NOI18N
        jLabel2.setRequestFocusEnabled(false);
        escritorio.add(jLabel2);
        jLabel2.setBounds(-170, -80, 1460, 930);

        menuInicio.setText("Inicio");

        itemSalir.setText("Salir");
        itemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalirActionPerformed(evt);
            }
        });
        menuInicio.add(itemSalir);

        barraMenu.add(menuInicio);

        menuGestionProductos.setText("Producto");

        itemVerProductos.setText("Gestionar Producto");
        itemVerProductos.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                itemVerProductosComponentAdded(evt);
            }
        });
        itemVerProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVerProductosActionPerformed(evt);
            }
        });
        menuGestionProductos.add(itemVerProductos);

        barraMenu.add(menuGestionProductos);

        menuGestionClientes.setText("Clientes");

        itemGestionClientes.setText("Gestionar Clientes");
        itemGestionClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGestionClientesActionPerformed(evt);
            }
        });
        menuGestionClientes.add(itemGestionClientes);

        barraMenu.add(menuGestionClientes);

        menuUsuario.setText("Stock");

        itemControlStock.setText("Actualizar Stock");
        itemControlStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemControlStockActionPerformed(evt);
            }
        });
        menuUsuario.add(itemControlStock);

        barraMenu.add(menuUsuario);

        menuGestionVentas.setText("Gestion Ventas");

        itemVerVentas.setText("Ver Ventas ");
        itemVerVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVerVentasActionPerformed(evt);
            }
        });
        menuGestionVentas.add(itemVerVentas);

        barraMenu.add(menuGestionVentas);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1208, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemVerProductosComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_itemVerProductosComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_itemVerProductosComponentAdded

    private void itemVerProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVerProductosActionPerformed
        vProductos.setVisible(true);
    }//GEN-LAST:event_itemVerProductosActionPerformed

    private void itemGestionClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGestionClientesActionPerformed
        vCliente.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_itemGestionClientesActionPerformed

    private void itemControlStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemControlStockActionPerformed
        vActualizarStock.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_itemControlStockActionPerformed

    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
        System.exit(0);

        // TODO add your handling code here:
    }//GEN-LAST:event_itemSalirActionPerformed

    private void itemVerVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVerVentasActionPerformed
        vDetalles.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_itemVerVentasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem itemControlStock;
    private javax.swing.JMenuItem itemGestionClientes;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JMenuItem itemVerProductos;
    private javax.swing.JMenuItem itemVerVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu menuGestionClientes;
    private javax.swing.JMenu menuGestionProductos;
    private javax.swing.JMenu menuGestionVentas;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JMenu menuUsuario;
    // End of variables declaration//GEN-END:variables

}