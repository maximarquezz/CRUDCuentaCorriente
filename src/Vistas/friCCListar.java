package Vistas;

import Modelos.modCCTabla;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JOptionPane;

public class friCCListar extends javax.swing.JInternalFrame {

    public friCCListar() {
        initComponents();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - getWidth()) / 2;
        int y = (screenSize.height - getHeight()) / 3;
        setLocation(x, y);
    }

    public DefaultTableModel getTableModel(){
        DefaultTableModel tblModel = (DefaultTableModel) tblCuentaCliente.getModel();
        return tblModel;
    }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scpCuentaCliente = new javax.swing.JScrollPane();
        tblCuentaCliente = new javax.swing.JTable();
        tblCuentaCliente.setDefaultEditor(Object.class, null);
        tblCuentaCliente.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        btnBuscar = new javax.swing.JButton();
        txtBusqueda = new javax.swing.JTextField();
        lblNombreCliente = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnComprobante = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        lblNombreCliente1 = new javax.swing.JLabel();
        panComprobante = new javax.swing.JPanel();
        lblSaldoTotal = new javax.swing.JLabel();
        lblSaldoTotalCalculo = new javax.swing.JLabel();
        lblFiltrarPor = new javax.swing.JLabel();
        cmbTipoFiltro = new javax.swing.JComboBox<>();
        lblCCStatus = new javax.swing.JLabel();
        lblSaldoFiltro = new javax.swing.JLabel();
        lblSaldoFiltroCalculo = new javax.swing.JLabel();
        btnActualizarCambios = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cuenta Corriente: listar");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        tblCuentaCliente.setAutoCreateRowSorter(true);
        tblCuentaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Motivo", "Monto", "Metodo", "Estado", "Comprobante"
            }
        ));
        tblCuentaCliente.setToolTipText("");
        tblCuentaCliente.setGridColor(new java.awt.Color(204, 204, 255));
        tblCuentaCliente.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tblCuentaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCuentaClienteMouseClicked(evt);
            }
        });
        scpCuentaCliente.setViewportView(tblCuentaCliente);

        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtBusqueda.setForeground(new java.awt.Color(153, 153, 153));
        txtBusqueda.setText("Buscar...");
        txtBusqueda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBusquedaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBusquedaFocusLost(evt);
            }
        });
        txtBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaActionPerformed(evt);
            }
        });

        lblNombreCliente.setText("Maximiliano Ezequiel Marquez");
        lblNombreCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        btnEditar.setText("Editar");
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        btnComprobante.setText("Ver comprobante");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        lblNombreCliente1.setText("45168933");
        lblNombreCliente1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DNI", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        panComprobante.setBackground(new java.awt.Color(255, 255, 255));
        panComprobante.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Comprobante: vista previa", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        javax.swing.GroupLayout panComprobanteLayout = new javax.swing.GroupLayout(panComprobante);
        panComprobante.setLayout(panComprobanteLayout);
        panComprobanteLayout.setHorizontalGroup(
            panComprobanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panComprobanteLayout.setVerticalGroup(
            panComprobanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lblSaldoTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSaldoTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSaldoTotal.setText("Saldo total:");

        lblSaldoTotalCalculo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSaldoTotalCalculo.setText("-$1000");

        lblFiltrarPor.setText("Filtrar por...");

        cmbTipoFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Fecha", "Motivo", "Monto", "Metodo", "Estado", "Comprobante" }));

        lblCCStatus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCCStatus.setText("Estado de la cuenta corriente");

        lblSaldoFiltro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSaldoFiltro.setText("Saldo (con filtro):");

        lblSaldoFiltroCalculo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSaldoFiltroCalculo.setText("-$500");

        btnActualizarCambios.setText("Actualizar cambios");
        btnActualizarCambios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarCambiosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnActualizarCambios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSaldoTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSaldoTotalCalculo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSaldoFiltro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSaldoFiltroCalculo)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(scpCuentaCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
                    .addComponent(lblNombreCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtBusqueda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCCStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblFiltrarPor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNombreCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(panComprobante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnComprobante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblNombreCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBusqueda)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFiltrarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbTipoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCCStatus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scpCuentaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panComprobante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSaldoFiltro)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAgregar)
                        .addComponent(btnEditar)
                        .addComponent(btnEliminar)
                        .addComponent(btnComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSaldoFiltroCalculo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizarCambios)
                    .addComponent(lblSaldoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSaldoTotalCalculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        friCCAgregar friccagregar = new friCCAgregar();
        frmPrincipal.jdpEscritorio.add(friccagregar);
        friccagregar.show();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedaActionPerformed

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        DefaultTableModel tblModel = getTableModel();
        tblModel.setRowCount(0);
        
        String filtroBusqueda = txtBusqueda.getText();
        String tipoBusqueda = (String) cmbTipoFiltro.getSelectedItem();
        
        modCCTabla mcctbl = new modCCTabla();
        mcctbl.Filtrar(filtroBusqueda, tipoBusqueda);
        
        List<Object[]> rowData = mcctbl.getResult();
        for(Object[] rowD : rowData){
            tblModel.addRow(rowD);
        }
        
        double saldoTot = mcctbl.calcSaldo(tblModel);
        saldoTot = -(saldoTot);
        lblSaldoFiltroCalculo.setText("$" + String.valueOf(saldoTot));
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtBusquedaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBusquedaFocusGained
        txtBusqueda.setForeground(Color.BLACK);
        txtBusqueda.setText("");
    }//GEN-LAST:event_txtBusquedaFocusGained

    private void txtBusquedaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBusquedaFocusLost
        /*txtBusqueda.setForeground(Color.GRAY);
        txtBusqueda.setText("Buscar...");*/
    }//GEN-LAST:event_txtBusquedaFocusLost

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        DefaultTableModel tblModel = getTableModel();
        modCCTabla mcctbl = new modCCTabla();
        
        mcctbl.Filtrar();
        
        List<Object[]> rowData = mcctbl.getResult();
        for(Object[] rowD : rowData){
            tblModel.addRow(rowD);
        }

        double saldoTot = mcctbl.calcSaldo(tblModel);
        saldoTot = -(saldoTot);
        lblSaldoTotalCalculo.setText("$" + String.valueOf(saldoTot));
        lblSaldoFiltroCalculo.setText("$" + String.valueOf(saldoTot));
    }//GEN-LAST:event_formInternalFrameOpened

    private void tblCuentaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCuentaClienteMouseClicked
        
    }//GEN-LAST:event_tblCuentaClienteMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        int isFocusedRow = tblCuentaCliente.rowAtPoint(evt.getPoint());
        modCCTabla mcctbl = new modCCTabla();

        if (isFocusedRow != -1) {
            int selectedRow = tblCuentaCliente.getSelectedRow();
            if (selectedRow != -1) {
                int idRow = mcctbl.getIDSelectedRow(selectedRow);
                if (idRow != -1) {
                    // Crear un JOptionPane personalizado con botones "Sí" y "No"
                    int opcion = JOptionPane.showOptionDialog(null, "¿Borrar el registro completo?", "Confirmar Borrado",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Sí", "No"}, "Sí");

                    if (opcion == JOptionPane.YES_OPTION) {
                        mcctbl.Borrar(idRow);
                        ((DefaultTableModel) tblCuentaCliente.getModel()).removeRow(selectedRow);
                        DefaultTableModel tblModel = getTableModel();
                        double saldoTot = mcctbl.calcSaldo(tblModel);
                        saldoTot = -(saldoTot);
                        lblSaldoTotalCalculo.setText("$" + String.valueOf(saldoTot));
                        lblSaldoFiltroCalculo.setText("$" + String.valueOf(saldoTot));
                    } else {
                        System.out.println("Operación de borrado cancelada.");
                    }
                }
            }
        }
        
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnActualizarCambiosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarCambiosMouseClicked
        cmbTipoFiltro.setSelectedItem("Ninguno");
        
        DefaultTableModel tblModel = getTableModel();
        tblModel.setRowCount(0);
        
        modCCTabla mcctbl = new modCCTabla();
        mcctbl.Filtrar();
        
        List<Object[]> rowData = mcctbl.getResult();
        for(Object[] rowD : rowData){
            tblModel.addRow(rowD);
        }

        double saldoTot = mcctbl.calcSaldo(tblModel);
        saldoTot = -(saldoTot);
        lblSaldoTotalCalculo.setText("$" + String.valueOf(saldoTot));
        lblSaldoFiltroCalculo.setText("$" + String.valueOf(saldoTot));
    }//GEN-LAST:event_btnActualizarCambiosMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        int isFocusedRow = tblCuentaCliente.rowAtPoint(evt.getPoint());
        modCCTabla mcctbl = new modCCTabla();

        if (isFocusedRow != -1) {
            int selectedRow = tblCuentaCliente.getSelectedRow();
            if (selectedRow != -1) {
                int idRow = mcctbl.getIDSelectedRow(selectedRow);
                if (idRow != -1) {
                    DefaultTableModel tblModel = getTableModel();
                    mcctbl.setFecha_cctabla((Date) tblModel.getValueAt(selectedRow, 0));
                    mcctbl.setMotivo_cctabla((String) tblModel.getValueAt(selectedRow, 1));
                    mcctbl.setMonto_cctabla((double) tblModel.getValueAt(selectedRow, 2));
                    mcctbl.setMetodo_cctabla((String) tblModel.getValueAt(selectedRow, 3));
                    mcctbl.setEstado_cctabla((String) tblModel.getValueAt(selectedRow, 4));
                    mcctbl.setComprobante_cctabla((String) tblModel.getValueAt(selectedRow, 5));
                    
                    mcctbl.setIfEditWindowOpened(true);
                    mcctbl.setIdOfEditWindow(idRow);
                    
                    friCCAgregar friccagregar = new friCCAgregar();
                    frmPrincipal.jdpEscritorio.add(friccagregar);
                    friccagregar.show();
 
                    double saldoTot = mcctbl.calcSaldo(tblModel);
                    saldoTot = -(saldoTot);
                    lblSaldoTotalCalculo.setText("$" + String.valueOf(saldoTot));
                    lblSaldoFiltroCalculo.setText("$" + String.valueOf(saldoTot));
                }
            }
        }
    }//GEN-LAST:event_btnEditarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarCambios;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnComprobante;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cmbTipoFiltro;
    private javax.swing.JLabel lblCCStatus;
    private javax.swing.JLabel lblFiltrarPor;
    private javax.swing.JLabel lblNombreCliente;
    private javax.swing.JLabel lblNombreCliente1;
    private javax.swing.JLabel lblSaldoFiltro;
    private javax.swing.JLabel lblSaldoFiltroCalculo;
    private javax.swing.JLabel lblSaldoTotal;
    private javax.swing.JLabel lblSaldoTotalCalculo;
    private javax.swing.JPanel panComprobante;
    private javax.swing.JScrollPane scpCuentaCliente;
    private javax.swing.JTable tblCuentaCliente;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}
