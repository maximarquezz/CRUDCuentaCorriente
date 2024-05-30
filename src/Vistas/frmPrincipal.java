package Vistas;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class frmPrincipal extends javax.swing.JFrame {

    public frmPrincipal() {
        initComponents();
        this.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpEscritorio = new javax.swing.JDesktopPane();
        mnbEscritorio = new javax.swing.JMenuBar();
        mnuEscritorio = new javax.swing.JMenu();
        mniCuentaCorriente = new javax.swing.JMenuItem();
        mniRestaurar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Software Clubs");

        javax.swing.GroupLayout jdpEscritorioLayout = new javax.swing.GroupLayout(jdpEscritorio);
        jdpEscritorio.setLayout(jdpEscritorioLayout);
        jdpEscritorioLayout.setHorizontalGroup(
            jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jdpEscritorioLayout.setVerticalGroup(
            jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        mnuEscritorio.setMnemonic('f');
        mnuEscritorio.setText("Cuenta Corriente");
        mnuEscritorio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        mniCuentaCorriente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mniCuentaCorriente.setText("Listar");
        mniCuentaCorriente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCuentaCorrienteActionPerformed(evt);
            }
        });
        mnuEscritorio.add(mniCuentaCorriente);

        mniRestaurar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mniRestaurar.setText("Restaurar");
        mniRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRestaurarActionPerformed(evt);
            }
        });
        mnuEscritorio.add(mniRestaurar);

        mnbEscritorio.add(mnuEscritorio);

        setJMenuBar(mnbEscritorio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniCuentaCorrienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCuentaCorrienteActionPerformed
        friCCListar fricclistar = new friCCListar();
        jdpEscritorio.add(fricclistar);
        fricclistar.show();
    }//GEN-LAST:event_mniCuentaCorrienteActionPerformed

    private void mniRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRestaurarActionPerformed
        friCCHistorial fricchistorial = new friCCHistorial();
        jdpEscritorio.add(fricchistorial);
        fricchistorial.show();
    }//GEN-LAST:event_mniRestaurarActionPerformed

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

        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane jdpEscritorio;
    private javax.swing.JMenuBar mnbEscritorio;
    private javax.swing.JMenuItem mniCuentaCorriente;
    private javax.swing.JMenuItem mniRestaurar;
    private javax.swing.JMenu mnuEscritorio;
    // End of variables declaration//GEN-END:variables

}
