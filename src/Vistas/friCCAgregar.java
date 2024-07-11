package Vistas;

import Modelos.modCCTabla;
import Modelos.modCCTablaDAO;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import javax.swing.JOptionPane;

public class friCCAgregar extends javax.swing.JInternalFrame {

    public friCCAgregar() {
        initComponents();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - getWidth()) / 2;
        int y = (screenSize.height - getHeight()) / 3;
        setLocation(x, y);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtComprobante = new javax.swing.JTextField();
        scpScrollMotivo = new javax.swing.JScrollPane();
        txaMotivo = new javax.swing.JTextArea();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        lblDNI = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        cmbMetodo = new javax.swing.JComboBox<>();
        cmbEstado = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnAnexarComprobante = new javax.swing.JButton();
        txtMonto = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Cuenta Corriente: agregar, modificar o eliminar");
        setToolTipText("");
        setMaximumSize(new java.awt.Dimension(426, 360));
        setMinimumSize(new java.awt.Dimension(426, 360));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
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
            }
        });

        btnAceptar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtComprobante.setBackground(new java.awt.Color(242, 242, 242));
        txtComprobante.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "N° Comprobante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        txaMotivo.setColumns(20);
        txaMotivo.setRows(5);
        txaMotivo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Motivo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        scpScrollMotivo.setViewportView(txaMotivo);

        jdcFecha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        lblDNI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDNI.setText("45168933");
        lblDNI.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DNI", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        lblCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCliente.setText("Maximiliano Ezequiel Marquez");
        lblCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        cmbMetodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Cheque", "Mercado Pago", "Transferencia bancaria", " " }));
        cmbMetodo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Metodo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pagado", "Pendiente" }));
        cmbEstado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        btnAnexarComprobante.setText("Anexar comprobante");
        btnAnexarComprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnexarComprobanteActionPerformed(evt);
            }
        });

        txtMonto.setBackground(new java.awt.Color(242, 242, 242));
        txtMonto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Monto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAnexarComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(scpScrollMotivo)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jdcFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                            .addComponent(cmbEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbMetodo, 0, 168, Short.MAX_VALUE)
                                            .addComponent(txtMonto)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDNI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMonto)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scpScrollMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAnexarComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAceptar)
                            .addComponent(btnCancelar)))
                    .addComponent(txtComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAnexarComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnexarComprobanteActionPerformed
        friCCComprobante fricccomprobante = new friCCComprobante();
        frmPrincipal.jdpEscritorio.add(fricccomprobante);
        fricccomprobante.show();
    }//GEN-LAST:event_btnAnexarComprobanteActionPerformed

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        modCCTablaDAO mcctblDAO = new modCCTablaDAO();
        
        if(mcctblDAO.getIfEditWindowOpened()){
            Date obtenerFecha = jdcFecha.getDate();
            java.sql.Date fecha_cctabla = new java.sql.Date(obtenerFecha.getTime());
            String motivo_cctabla = txaMotivo.getText();
            Double monto_cctabla = Double.valueOf(txtMonto.getText());
            String metodo_cctabla = (String) cmbMetodo.getSelectedItem();
            String estado_cctabla = (String) cmbEstado.getSelectedItem();
            String comprobante_cctabla = txtComprobante.getText();
            
            mcctblDAO.Editar(fecha_cctabla, motivo_cctabla, monto_cctabla, metodo_cctabla, estado_cctabla, comprobante_cctabla);
            mcctblDAO.setIfEditWindowOpened(false);
            dispose();
        }
        else{
            Date obtenerFecha = jdcFecha.getDate();
            java.sql.Date fecha_cctabla = new java.sql.Date(obtenerFecha.getTime());
            String motivo_cctabla = txaMotivo.getText();
            Double monto_cctabla = Double.valueOf(txtMonto.getText());
            String metodo_cctabla = (String) cmbMetodo.getSelectedItem();
            String estado_cctabla = (String) cmbEstado.getSelectedItem();
            String comprobante_cctabla = txtComprobante.getText();

            if((fecha_cctabla.toString().isEmpty())){
                JOptionPane.showMessageDialog(null, "El campo \"Fecha\" no puede estar vacío");
            }else if(motivo_cctabla.isEmpty()){
                JOptionPane.showMessageDialog(null, "El campo \"Motivo\" no puede estar vacío");
            }else if((monto_cctabla.toString().isEmpty())){
                JOptionPane.showMessageDialog(null, "El campo \"Monto\" no puede estar vacío");
            }else if(metodo_cctabla.isEmpty()){
                JOptionPane.showMessageDialog(null, "El campo \"Metodo\" no puede estar vacío");
            }else if(estado_cctabla.isEmpty()){
                JOptionPane.showMessageDialog(null, "El campo \"Estado\" no puede estar vacío");
            }else{
                mcctblDAO.Insertar(fecha_cctabla, motivo_cctabla, monto_cctabla, metodo_cctabla, estado_cctabla, comprobante_cctabla);
                dispose();
                mcctblDAO.setIfEditWindowOpened(false);
            }
        }
        
    }//GEN-LAST:event_btnAceptarMouseClicked

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        modCCTablaDAO mcctblDAO = new modCCTablaDAO();
        
        if(mcctblDAO.getIfEditWindowOpened()){
            Date getFecha_cctabla = modCCTabla.getFecha_cctabla();
            String getMotivo_cctabla = modCCTabla.getMotivo_cctabla();
            Double getMonto_cctabla = modCCTabla.getMonto_cctabla();
            String getMetodo_cctabla = modCCTabla.getMetodo_cctabla();
            String getEstado_cctabla = modCCTabla.getEstado_cctabla();
            String getComprobante_cctabla = modCCTabla.getComprobante_cctabla();
            
            jdcFecha.setDate(getFecha_cctabla);
            txaMotivo.setText(getMotivo_cctabla);
            txtMonto.setText(String.valueOf(getMonto_cctabla));
            cmbMetodo.setSelectedItem(getMetodo_cctabla);
            cmbEstado.setSelectedItem(getEstado_cctabla);
            txtComprobante.setText(getComprobante_cctabla);    
        }
    }//GEN-LAST:event_formInternalFrameActivated


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAnexarComprobante;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbMetodo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JScrollPane scpScrollMotivo;
    private javax.swing.JTextArea txaMotivo;
    private javax.swing.JTextField txtComprobante;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
